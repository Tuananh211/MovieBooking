package com.base.moviebooking.ui.change_pass;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.base.moviebooking.DataLocalManager;
import com.base.moviebooking.R;
import com.base.moviebooking.base.BaseFragment;
import com.base.moviebooking.databinding.ChangePassFragmentBinding;
import com.base.moviebooking.entity.ChangePass;
import com.base.moviebooking.entity.LoginResponse;

public class ChangePassFragment extends BaseFragment<ChangePassFragmentBinding> {
    String TAG = "fat";
    private ChangePassViewModel mViewModel;


    @Override
    protected int getLayoutId() {
        return R.layout.change_pass_fragment;
    }

    @Override
    public void backFromAddFragment() {

    }

    @Override
    public boolean backPressed() {
        return true;
    }


    @Override
    public void initView() {
        mViewModel = ViewModelProviders.of(this, viewModelFactory).get(ChangePassViewModel.class);
    }

    @Override
    public void initData() {
        mViewModel.dataUser.observe(getViewLifecycleOwner(), new Observer<LoginResponse>() {
            @Override
            public void onChanged(LoginResponse response) {
                if(response.isSuccess()){
                    Toast.makeText(getContext(),"Đổi mật khẩu thành công",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getContext(), response.getData().getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        eventClick();

    }

    private void eventClick() {
        binding.backTt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("linhd","click backtt");
                mViewController.backFromAddFragment(null);
            }
        });
        binding.btnChangePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("linhd",DataLocalManager.getStringValue());
                if(binding.edtOldPass.getText().toString().equals("")||binding.edtNewPass.getText().toString().equals("")
                ||binding.edtConfirmPass.getText().toString().equals("")){
                    Toast.makeText(getContext(),"Không được để trống",Toast.LENGTH_SHORT).show();
                }else if(!binding.edtOldPass.getText().toString().equals(DataLocalManager.getStringValue())){
                    Toast.makeText(getContext(),"Mật khẩu không đúng",Toast.LENGTH_SHORT).show();
                    }else if(binding.edtNewPass.getText().toString().equals(binding.edtOldPass.getText().toString())){
                    Toast.makeText(getContext(),"Mật khẩu mới không được trùng khớp với mật khẩu cũ ",Toast.LENGTH_SHORT).show();
                }else{
                    mViewModel.changePass(new ChangePass(binding.edtOldPass.getText().toString(),binding.edtNewPass.getText().toString(),binding.edtConfirmPass.getText().toString()));
                }
            }
        });

    }


    @Override
    public void onResume() {
        super.onResume();
        Log.d("fat", "onResume account");


    }
}




