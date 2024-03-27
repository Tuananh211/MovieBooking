package com.base.moviebooking.ui.comments;

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
    }

    @Override
    public void initData() {

    }
}
