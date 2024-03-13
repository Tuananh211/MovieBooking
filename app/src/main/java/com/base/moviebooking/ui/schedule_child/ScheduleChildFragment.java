package com.base.moviebooking.ui.schedule_child;

import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.base.moviebooking.DataLocalManager;
import com.base.moviebooking.R;
import com.base.moviebooking.adapter.ScheduleAdapter;
import com.base.moviebooking.adapter.TheaterAdapter;
import com.base.moviebooking.base.BaseFragment;
import com.base.moviebooking.databinding.ScheduleCinemaFragmentBinding;
import com.base.moviebooking.databinding.SchedulleChildFragmentBinding;
import com.base.moviebooking.entity.Category;
import com.base.moviebooking.entity.FilmInfo;
import com.base.moviebooking.entity.Movie;
import com.base.moviebooking.entity.Schedule;
import com.base.moviebooking.entity.Theater;
import com.base.moviebooking.listener.OnChooseRecyclerView;
import com.base.moviebooking.ui.main.MainActivity;
import com.base.moviebooking.ui.schedule.ScheduleCinemaFragment;
import com.base.moviebooking.ui.schedule.ScheduleCinemaModel;
import com.base.moviebooking.ui.show_time.ShowTimeViewModel;
import com.base.moviebooking.ui.sign_in.SignInFragment;

import java.util.HashMap;
import java.util.List;

public class ScheduleChildFragment extends BaseFragment<SchedulleChildFragmentBinding> {
    ScheduleChildModel mViewModel;
    ScheduleCinemaModel scheduleCinemaModel;
    ScheduleAdapter scheduleAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.schedulle_child_fragment;
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
        scheduleCinemaModel = ViewModelProviders.of(requireParentFragment(), viewModelFactory).get(ScheduleCinemaModel.class);
        mViewModel = ViewModelProviders.of(this, viewModelFactory).get(ScheduleChildModel.class);
        binding.rcvLichphim.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));
        String day = scheduleCinemaModel.day.getValue().toString();
        Theater theater = scheduleCinemaModel.getDataTheater().getValue();
        mViewModel.getMovieHasSchedule(theater.getId(),day);
        scheduleAdapter =  new ScheduleAdapter(getContext(), false, getContext(), new OnChooseRecyclerView() {
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
        },this);
        mViewModel.dataMovie.observe(getViewLifecycleOwner(), new Observer<List<Movie>>() {
            @Override
            public void onChanged(List<Movie> listMovieResponse) {
                if (listMovieResponse.size()!=0){
                    scheduleAdapter.addModels(listMovieResponse, false);
                    Log.d("fat", "add Model", null);
                    getActivity().findViewById(R.id.dialog_load_schedule).setVisibility(View.GONE);
                    binding.lnNoMovie.setVisibility(View.GONE);
                }
                else{
                    getActivity().findViewById(R.id.dialog_load_schedule).setVisibility(View.GONE);
                    binding.lnNoMovie.setVisibility(View.VISIBLE);
                }

            }
        });
        binding.rcvLichphim.setAdapter(scheduleAdapter);
        scheduleAdapter.notifyDataSetChanged();
    }

    @Override
    public void initData() {

    }
}
