package com.base.moviebooking.ui.schedule;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.base.moviebooking.R;
import com.base.moviebooking.adapter.ScheduleAdapter;
import com.base.moviebooking.base.BaseFragment;
import com.base.moviebooking.databinding.ScheduleCinemaFragmentBinding;
import com.base.moviebooking.entity.Movie;
import com.base.moviebooking.entity.Theater;
import com.base.moviebooking.ui.show_time.ShowTimeViewModel;

public class ScheduleCinemaFragment extends BaseFragment<ScheduleCinemaFragmentBinding> {
    private ScheduleCinemaModel mViewModel;
    Theater theater;
    private ScheduleAdapter scheduleAdapter;
    @Override
    protected int getLayoutId() {
        return R.layout.schedule_cinema_fragment;
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
        AppCompatActivity activity = (AppCompatActivity) requireActivity();
        mViewModel = ViewModelProviders.of(this, viewModelFactory).get(ScheduleCinemaModel.class);

        Bundle bundle = getArguments();
        Log.d("cather","detail");
        if (bundle != null && !bundle.isEmpty()) {
            theater = (Theater) bundle.getSerializable("cinema");
            // Xử lý dữ liệu trong bundle
            mViewModel.sendDataTheater(theater);
        }
        else {
            // Không có dữ liệu để xử lý
            Log.d("cather","des NO data");
        }
    }

    @Override
    public void initData() {

    }
}
