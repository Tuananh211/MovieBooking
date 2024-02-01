package com.base.moviebooking.ui.detail_movie;

import android.util.Log;
import android.view.View;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.base.moviebooking.DataLocalManager;
import com.base.moviebooking.R;
import com.base.moviebooking.adapter.ActorAdapter;
import com.base.moviebooking.adapter.CategoryListAdapter;
import com.base.moviebooking.base.BaseFragment;
import com.base.moviebooking.databinding.ThongtinFragmentBinding;
import com.base.moviebooking.entity.Actor;
import com.base.moviebooking.entity.Category;
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
import com.bumptech.glide.Glide;

import java.util.HashMap;
import java.util.List;

public class DetailMovieFragment extends BaseFragment<ThongtinFragmentBinding> {

    DetailMovieViewModel mViewModel;
    ShowTimeViewModel showTimeViewModel;
    private CategoryListAdapter categoryListAdapter;
    private ActorAdapter actorAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.thongtin_fragment;
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
        mViewModel = ViewModelProviders.of(this, viewModelFactory).get(DetailMovieViewModel.class);
        getActivity().findViewById(R.id.bottombar).setVisibility(View.GONE);
//        mViewModel = ViewModelProviders.of(this,viewModelFactory).get(DetailMovieViewModel.class);
        showTimeViewModel = ViewModelProviders.of(requireParentFragment(), viewModelFactory).get(ShowTimeViewModel.class);
        showTimeViewModel.getData().observe(getViewLifecycleOwner(), new Observer<Movie>() {
            @Override
            public void onChanged(Movie s) {
                Log.d("transfer", "sendata observable");
                binding.descriptionMovie.setText(s.getDescription());
                binding.directorMovie.setText(s.getDirector());

                if(s.getImage() != null && !s.getImage().isEmpty()){
                    Glide.with(requireContext())
                            .load(s.getImageDirector())
                            .into(binding.directorImage);
                } else {
                // Nếu không có đường dẫn ảnh thì có thể hiển thị ảnh mặc định hoặc ẩn ImageView
                binding.directorImage.setImageResource(R.drawable.dv5);
                // hoặc
                // binding.actorImage.setVisibility(View.GONE);
                }
//                        binding.descriptionMovie.setText(s.getTime());
//                        binding.descriptionMovie.setText(s.getTimeRelease());
                showCategory(s.getId());
                showActor(s.getId());
            }
        });
    }

    @Override
    public void initData() {


    }

    public void showCategory(int movieId){
        // Category
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.cateView.setLayoutManager(linearLayoutManager);
        mViewModel.getListCategoryByMovieId(movieId);
        categoryListAdapter = new CategoryListAdapter(getContext(), false, getContext(),
                new OnChooseRecyclerView() {
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
                    public void onChooseLichChieu(Schedule schedule) {

                    }

                    @Override
                    public void onChooseCategory(Category category) {
                    }
                });

        mViewModel.dataCategory.observe(getViewLifecycleOwner(), new Observer<List<Category>>() {
            @Override
            public void onChanged(List<Category> categoriesListResponse) {
                categoryListAdapter.addModels(categoriesListResponse,false);
                Log.d("fat", "add Model Category", null);
                getActivity().findViewById(R.id.category_load).setVisibility(View.GONE);
            }
        });
        binding.cateView.setAdapter(categoryListAdapter);
    }
//  Show actor
    public void showActor(int movieId){
        // Actor
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.listActor.setLayoutManager(linearLayoutManager2);
        mViewModel.getListActorsByMovieId(movieId);
        actorAdapter = new ActorAdapter(getContext(), false, getContext(),
                new OnChooseRecyclerView() {
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
                    public void onChooseLichChieu(Schedule schedule) {

                    }

                    @Override
                    public void onChooseCategory(Category category) {
                    }
                });

        mViewModel.dataActors.observe(getViewLifecycleOwner(), new Observer<List<Actor>>() {
            @Override
            public void onChanged(List<Actor> actorsListResponse) {
                actorAdapter.addModels(actorsListResponse,false);
                Log.d("fat", "add Model Actor", null);
                getActivity().findViewById(R.id.actor_load).setVisibility(View.GONE);
            }
        });
        binding.listActor.setAdapter(actorAdapter);
    }

}
