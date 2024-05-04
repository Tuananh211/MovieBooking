package com.base.moviebooking.ui.user_info;

import static android.app.Activity.RESULT_OK;

import android.Manifest;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.base.moviebooking.R;
import com.base.moviebooking.base.BaseFragment;
import com.base.moviebooking.databinding.UserInfoFragmentBinding;
import com.base.moviebooking.entity.Account;
import com.base.moviebooking.entity.ChangePass;
import com.base.moviebooking.entity.RegisterResponse;
import com.base.moviebooking.entity.UserUpdate;
import com.base.moviebooking.ui.account.AccountFragment;
import com.base.moviebooking.ui.change_pass.ChangePassFragment;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.normal.TedPermission;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInfoFragment extends BaseFragment<UserInfoFragmentBinding> {

    private UserInfoViewModel mViewModel;
    private UserUpdate updateUser;
    final Calendar calendar = Calendar.getInstance();
    final int year = calendar.get(Calendar.YEAR);
    final int month = calendar.get(Calendar.MONTH);
    final int day = calendar.get(Calendar.DAY_OF_MONTH);
    Uri selectedImageUri;

    Bitmap bitmap;
    String encode= "";
    private Account account;

    @Override
    protected int getLayoutId() {
        return R.layout.user_info_fragment;
    }

    @Override
    public void backFromAddFragment() {

    }

    @Override
    public boolean backPressed() {
        return false;
    }

    @Override
    public void initView() {
        getActivity().findViewById(R.id.bottombar).setVisibility(View.GONE);
        mViewModel = ViewModelProviders.of(this,viewModelFactory).get(UserInfoViewModel.class);
        mViewModel.getInfo();
        mViewModel.dataUser.observe(getViewLifecycleOwner(), new Observer<List<Account>>() {
            @Override
            public void onChanged(List<Account> accounts) {
                 account = accounts.get(0);
                binding.nameUser.setText(account.getFullName().toString());
//                binding.phoneuser.setText(account.get().toString());
                String s = account.getDateOfBirth().toString().substring(0,10);
                SimpleDateFormat stringformat = new SimpleDateFormat("yyyy-MM-dd");
                if(account.getAvatar()!=null){
                    // doi anh base64
                    String base64Image = account.getAvatar();
//            Log.d("mmm","base64"+base64Image,null);
                    byte[] imageBytes = Base64.decode(parseBase64(base64Image), Base64.DEFAULT);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
                    binding.imgUser.setImageBitmap(bitmap);
                }
                else{
                    binding.imgUser.setImageResource(R.drawable.user2);
                    binding.imgUser.setBackgroundResource(R.drawable.oval_btn_blackground_grey);
                }
                Date date = null;
                try {
                    date = stringformat.parse(s);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                binding.birthdayUser.setText(dateFormat.format(date));
                binding.gmailUser.setText(account.getEmail().toString());
                binding.address.setText(account.getAddress().toString());
                if(account.getGender()== 1){
                    binding.nam.setChecked(true);
                }else {
                    binding.nu.setChecked(true);

                }
            }
        });
        binding.btnPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewController.addFragment(ChangePassFragment.class, null);

            }
        });
        binding.backTt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().findViewById(R.id.bottombar).setVisibility(View.VISIBLE);
                mViewController.backFromAddFragment(null);
            }
        });
        mViewModel.update.observe(getViewLifecycleOwner(), new Observer<RegisterResponse>() {
            @Override
            public void onChanged(RegisterResponse response) {
                if(response.isSuccess()){
                    mViewController.backFromAddFragment(null);
                    getActivity().findViewById(R.id.bottombar).setVisibility(View.VISIBLE);
                    binding.showInfo.setVisibility(View.VISIBLE);
                    binding.loadingUpdate.setVisibility(View.GONE);
                    binding.overlay.setVisibility(View.GONE);
                    mViewModel.getInfo();
                    Toast.makeText(getContext(), "Cập nhật thành công", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(getContext(), "Cập nhật thất bại", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }

    @Override
    public void initData() {
        binding.birthdayUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month + 1;
                        String date = dayOfMonth + "/" + month + "/" + year;
                        binding.birthdayUser.setText(date);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });
        binding.btnCapnhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.showInfo.setVisibility(View.GONE);
                binding.loadingUpdate.setVisibility(View.VISIBLE);
                binding.overlay.setVisibility(View.VISIBLE);
                SimpleDateFormat stringformat = new SimpleDateFormat("dd/MM/yyyy");

                Date date = null;
                try {
                    date = stringformat.parse(binding.birthdayUser.getText().toString());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                int gender =0;
                if(binding.nam.isChecked()){
                    gender=1;

                }
                if(binding.nu.isChecked()){
                    gender=0;

                }
                String newImage;
                if(!encode.isEmpty() && !encode.equals(account.getAvatar())){
                    newImage=encode;
                }
                else {
                    newImage= account.getAvatar();
                }
                updateUser = new UserUpdate(binding.nameUser.getText().toString(),binding.address.getText().toString(), dateFormat.format(date),gender,newImage);
                mViewModel.updateUser(updateUser);

            }
        });
        binding.pickImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PermissionListener permissionlistener = new PermissionListener() {
                    @Override
                    public void onPermissionGranted() { Intent intent = new Intent();
                        intent.setType("image/*");
                        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);// camera
                        intent.setAction(Intent.ACTION_GET_CONTENT);
                        mActivityResult.launch(intent);
                        Toast.makeText(getContext(), "Permission Granted", Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onPermissionDenied(List<String> deniedPermissions) {
                        Toast.makeText(getContext(), "Permission Denied\n" + deniedPermissions.toString(), Toast.LENGTH_SHORT).show();
                    }

                };
                TedPermission.create()
                        .setPermissionListener(permissionlistener)
                        .setDeniedMessage("If you reject permission,you can not use this service\n\nPlease turn on permissions at [Setting] > [Permission]")
                        .setPermissions( Manifest.permission.READ_EXTERNAL_STORAGE)
                        .check();

            }
        });
    }
    private final ActivityResultLauncher<Intent> mActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult()
            , new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == RESULT_OK) {
                        Intent intent = result.getData();
                        selectedImageUri = intent.getData();// gallery
                        binding.imgUser.setImageURI(selectedImageUri);
                        try {
                            InputStream inputStream =  requireContext().getContentResolver().openInputStream(selectedImageUri);
                            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                            ByteArrayOutputStream stream = new ByteArrayOutputStream();
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                            byte[] imageBytes = stream.toByteArray();
                            encode = "data:image/jpeg;base64,"+ android.util.Base64.encodeToString(imageBytes, Base64.DEFAULT);
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            });


    public static String parseBase64(String base64) {

        try {
            Pattern pattern = Pattern.compile("((?<=base64,).*\\s*)", Pattern.DOTALL | Pattern.MULTILINE);
            Matcher matcher = pattern.matcher(base64);
            if (matcher.find()) {
                return matcher.group().toString();
            } else {
                return "";
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return "";
    }
}
