package com.base.moviebooking.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.base.moviebooking.ui.detail_movie.DetailMovieFragment;
import com.base.moviebooking.ui.schedule_child.ScheduleChildFragment;
import com.base.moviebooking.ui.show_time_child.ShowTimeChildFragment;

public class ViewScheduleAdapter extends FragmentStateAdapter {

    public ViewScheduleAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new ScheduleChildFragment();
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }
}
