package com.base.moviebooking.ui.schedule;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.base.moviebooking.R;
import com.base.moviebooking.adapter.ScheduleAdapter;
import com.base.moviebooking.adapter.ViewScheduleAdapter;
import com.base.moviebooking.base.BaseFragment;
import com.base.moviebooking.databinding.ScheduleCinemaFragmentBinding;
import com.base.moviebooking.entity.Theater;
import com.base.moviebooking.ui.theater.TheaterFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ScheduleCinemaFragment extends BaseFragment<ScheduleCinemaFragmentBinding> {
    private ScheduleCinemaModel mViewModel;
    private ViewScheduleAdapter viewPagerAdapter;
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
    public void onResume() {
        super.onResume();
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
        if (bundle != null && !bundle.isEmpty()) {
            theater = (Theater) bundle.getSerializable("theater");
            // Xử lý dữ liệu trong bundle
            mViewModel.sendDataTheater(theater);
            viewPagerAdapter = new ViewScheduleAdapter(this);
            binding.viewpagerLichphim.setAdapter(viewPagerAdapter);
            List<String> item_Lich = new ArrayList<>();
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String dateString = formatter.format(calendar.getTime());
            item_Lich.add(dateString);

            for (int i = 0; i < 7; i++) {
                calendar.add(Calendar.DAY_OF_YEAR, 1);
                String date2= formatter.format(calendar.getTime());
                item_Lich.add(date2);
            }
            new TabLayoutMediator(binding.tabLayout, binding.viewpagerLichphim, new TabLayoutMediator.TabConfigurationStrategy() {

                @Override
                public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                    switch (position) {
                        case 0:
                            tab.setText(item_Lich.get(0).toString());
                            mViewModel.sendDay(fomatDate(item_Lich.get(0)));
                            break;
                        case 1:
                            tab.setText(item_Lich.get(1).toString());
                            mViewModel.sendDay(fomatDate(item_Lich.get(1)));
                            break;
                        case 2:
                            tab.setText(item_Lich.get(2).toString());
                            mViewModel.sendDay(fomatDate(item_Lich.get(2)));
                            break;
                        case 3:
                            tab.setText(item_Lich.get(3).toString());
                            mViewModel.sendDay(fomatDate(item_Lich.get(3)));
                            break;
                        case 4:
                            tab.setText(item_Lich.get(4).toString());
                            mViewModel.sendDay(fomatDate(item_Lich.get(4)));
                            break;
                        case 5:
                            tab.setText(item_Lich.get(5).toString());
                            mViewModel.sendDay(fomatDate(item_Lich.get(5)));
                            break;
                        case 6:
                            tab.setText(item_Lich.get(6).toString());
                            mViewModel.sendDay(fomatDate(item_Lich.get(6)));
                            break;
                    }
                }
            }).attach();
            //toolbar
            activity.setSupportActionBar(binding.toolbar);
            if (activity.getSupportActionBar() != null) {
                activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }

        }
        else {
            // Không có dữ liệu để xử lý
            Log.d("cather","des NO data");
        }
    }

    @Override
    public void initData() {
        eventClick();
    }

    private void eventClick() {
        // set event click back
        binding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                getActivity().findViewById(R.id.bottombar).setVisibility(View.VISIBLE);
                mViewController.replaceFragment(TheaterFragment.class,null);

            }
        });
        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Thay đổi màu của thanh gạch chân khi tab được chọn
                binding.tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.white));
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // Xử lý khi tab không được chọn
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // Xử lý khi tab được chọn lại
            }
        });

    }

    private String fomatDate(String dateString){
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = inputFormat.parse(dateString);
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

}
