package com.base.moviebooking.ui.detail_movie;

import android.net.Uri;
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
import com.base.moviebooking.utils.StringUtil;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

import java.util.HashMap;
import java.util.List;

public class DetailMovieFragment extends BaseFragment<ThongtinFragmentBinding> {

    DetailMovieViewModel mViewModel;
    ShowTimeViewModel showTimeViewModel;
    private CategoryListAdapter categoryListAdapter;
    private ActorAdapter actorAdapter;
    private ExtractorMediaSource mMediaSource;
    private SimpleExoPlayer mPlayer;

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
                if (!StringUtil.isEmpty(s.getTrailer())) {
                    Log.e("Movie Url", s.getTrailer());
                    initializeExoPlayer(s.getTrailer());
                }
            }
        });
    }

    @Override
    public void initData() {
        binding.imgPlayMovie.setOnClickListener(view -> startVideo());

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
                if(actorsListResponse.size()>0){
                    actorAdapter.addModels(actorsListResponse,false);
                    Log.d("fat", "add Model Actor", null);
                    getActivity().findViewById(R.id.actor_load).setVisibility(View.GONE);
                }
                else {
                    actorsListResponse.add(new Actor(1,"Perdo Pascal","https://resizing.flixster.com/-XZAfHZM39UwaGJIFWKAE8fS0ak=/v3/t/assets/494807_v9_bd.jpg"));
                    actorsListResponse.add(new Actor(2,"Anna Torv","https://resizing.flixster.com/-XZAfHZM39UwaGJIFWKAE8fS0ak=/v3/t/assets/494807_v9_bd.jpg"));
                    actorsListResponse.add(new Actor(3,"Nico Parker","https://resizing.flixster.com/-XZAfHZM39UwaGJIFWKAE8fS0ak=/v3/t/assets/494807_v9_bd.jpg"));
                    actorsListResponse.add(new Actor(4,"Nick Offerman","https://resizing.flixster.com/-XZAfHZM39UwaGJIFWKAE8fS0ak=/v3/t/assets/494807_v9_bd.jpg"));
                    actorAdapter.addModels(actorsListResponse,false);
                    Log.d("fat", "add Model Actor", null);
                    getActivity().findViewById(R.id.actor_load).setVisibility(View.GONE);
                }

            }
        });
        binding.listActor.setAdapter(actorAdapter);
    }
    private void initExoPlayer(String trailerUrl) {
        PlayerView mExoPlayerView = binding.exoplayer;

        if (mPlayer != null) {
            return;
        }

        DefaultBandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
        TrackSelection.Factory videoTrackSelectionFactory = new AdaptiveTrackSelection.Factory(bandwidthMeter);
        TrackSelector trackSelector = new DefaultTrackSelector(videoTrackSelectionFactory);
        LoadControl loadControl = new DefaultLoadControl();

        mPlayer = ExoPlayerFactory.newSimpleInstance(requireContext(), trackSelector, loadControl);
        mExoPlayerView.setPlayer(mPlayer);

        DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(requireContext(), Util.getUserAgent(requireContext(), "app-name"), bandwidthMeter);
        mMediaSource = new ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse("https://www.rmp-streaming.com/media/big-buck-bunny-360p.mp4"));

        mPlayer.prepare(mMediaSource);
//        mPlayer.setPlayWhenReady(true);
    }

    // Phương thức này sẽ được gọi từ ViewModel để tạo và khởi tạo ExoPlayer
    public void initializeExoPlayer(String trailerUrl) {
        initExoPlayer(trailerUrl);
    }

    // Phương thức này sẽ được gọi từ ViewModel để release ExoPlayer khi không cần thiết nữa
    public void releaseExoPlayer() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }

    private void startVideo() {
        binding.imgPlayMovie.setVisibility(View.GONE);
        if (mPlayer != null) {
            // Prepare video source
            mPlayer.prepare(mMediaSource);
            // Set play video
            mPlayer.setPlayWhenReady(true);
        }
    }

}
