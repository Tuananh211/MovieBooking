package com.base.moviebooking.ui.comments;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.base.moviebooking.DataLocalManager;
import com.base.moviebooking.R;
import com.base.moviebooking.adapter.CommentAdapter;
import com.base.moviebooking.adapter.HomeAdapter;
import com.base.moviebooking.adapter.ShowTimesAdapter;
import com.base.moviebooking.base.BaseFragment;
import com.base.moviebooking.databinding.ActiveCommentFragmentBinding;
import com.base.moviebooking.entity.Account;
import com.base.moviebooking.entity.Category;
import com.base.moviebooking.entity.Comment;
import com.base.moviebooking.entity.FilmInfo;
import com.base.moviebooking.entity.Movie;
import com.base.moviebooking.entity.Schedule;
import com.base.moviebooking.entity.Theater;
import com.base.moviebooking.listener.OnChooseRecyclerView;
import com.base.moviebooking.ui.home.HomeViewModel;
import com.base.moviebooking.ui.main.MainActivity;
import com.base.moviebooking.ui.show_time.ShowTimeFragment;
import com.base.moviebooking.ui.show_time.ShowTimeViewModel;
import com.base.moviebooking.ui.sign_in.SignInFragment;

import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CommentFragment extends BaseFragment<ActiveCommentFragmentBinding> {

    private CommentModel mViewModel;
    private List<Comment> commentList;
    private ShowTimeViewModel showTimeViewModel;
    private CommentAdapter commentAdapter;
    Movie nMovie;

    @Override
    protected int getLayoutId() {
        return R.layout.active_comment_fragment;
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
//        getActivity().findViewById(R.id.bottombar).setVisibility(View.GONE);
        mViewModel = ViewModelProviders.of(this, viewModelFactory).get(CommentModel.class);
        showTimeViewModel = ViewModelProviders.of(requireParentFragment(), viewModelFactory).get(ShowTimeViewModel.class);
//        showTimeViewModel.dataMovie.observe(getViewLifecycleOwner(), new Observer<Movie>() {
//            @Override
//            public void onChanged(Movie movie) {
//                nMovie = movie;
//            }
//        });
       // Show list comment
        binding.ryComment.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));
        mViewModel.getListComments(1);
        commentAdapter = new CommentAdapter(getContext(), false, getContext(), new OnChooseRecyclerView() {
            @Override
            public void onChoosePhim(Movie movie) {

            }

            @Override
            public void onChooseRap(Theater theater) {

            }

            @Override
            public void onChooseFilmInfo(FilmInfo filmInfo) {

            }

            @Override
            public void onChooseLichChieu(Schedule showTime) {

            }

            @Override
            public void onChooseCategory(Category category) {

            }

            @Override
            public void onChooseTime(Schedule schedule) {

            }
        });
        mViewModel.comments.observe(getViewLifecycleOwner(), new Observer<List<Comment>>() {
            @Override
            public void onChanged(List<Comment> movieListResponse) {
                if(movieListResponse.size()!=0){
                    commentList= movieListResponse;
                    commentAdapter.addModels(movieListResponse, false);
                    binding.ryComment.setVisibility(View.VISIBLE);
                    binding.lyCommentEmpty.setVisibility(View.GONE);
                } else {
                    binding.ryComment.setVisibility(View.GONE);
                    binding.lyCommentEmpty.setVisibility(View.VISIBLE);
                }

                Log.d("fat", "add Model", null);
                getActivity().findViewById(R.id.dialog_load).setVisibility(View.GONE);
            }
        });
        binding.ryComment.setAdapter(commentAdapter);

        //get user info
        mViewModel.getInfo();
        mViewModel.dataUser.observe(getViewLifecycleOwner(), new Observer<List<Account>>() {
            @Override
            public void onChanged(List<Account> accounts) {
                if(accounts.size()!=0){
                    if(accounts.get(0).getAvatar()!=null){
                        // doi anh base64
                        String base64Image = accounts.get(0).getAvatar();
//            Log.d("mmm","base64"+base64Image,null);
                        byte[] imageBytes = Base64.decode(parseBase64(base64Image), Base64.DEFAULT);
                        Bitmap bitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
                        binding.imgAvatar.setImageBitmap(bitmap);
                    }
                    else{
                        binding.imgAvatar.setImageResource(R.drawable.user2);
                    }
                }
            }
        });
    }

    @Override
    public void initData() {

    }

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
