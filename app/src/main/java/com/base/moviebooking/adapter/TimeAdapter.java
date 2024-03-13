package com.base.moviebooking.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.base.moviebooking.R;
import com.base.moviebooking.base.EndlessLoadingRecyclerViewAdapter;
import com.base.moviebooking.base.RecyclerViewAdapter;
import com.base.moviebooking.databinding.ViewholderCategoryBinding;
import com.base.moviebooking.databinding.ViewholderTimesBinding;
import com.base.moviebooking.entity.Category;
import com.base.moviebooking.entity.Movie;
import com.base.moviebooking.entity.Schedule;
import com.base.moviebooking.entity.Theater;
import com.base.moviebooking.listener.OnChooseRecyclerView;
import com.base.moviebooking.ui.chonghe.ChonGheFragment;
import com.base.moviebooking.ui.main.MainActivity;
import com.base.moviebooking.ui.schedule.ScheduleCinemaModel;
import com.base.moviebooking.ui.theater.TheaterFragment;

import java.util.HashMap;

public class TimeAdapter extends EndlessLoadingRecyclerViewAdapter<ViewholderTimesBinding> {
    private Context mContext;
    private OnChooseRecyclerView mOnChooseRecyclerView;
    ScheduleCinemaModel scheduleCinemaModel;
    Movie movie;
    public TimeAdapter(Context context, boolean enableSelectedMode, Context mContext, OnChooseRecyclerView onChooseRecyclerView, Movie movie) {
        super(context, enableSelectedMode);
        this.mContext = mContext;
        this.mOnChooseRecyclerView = onChooseRecyclerView;
        this.movie= movie;
    }


    @Override
    protected RecyclerView.ViewHolder initNormalViewHolder(ViewholderTimesBinding binding, ViewGroup parent) {
        return new TimeAdapter.TimeViewHolder(binding);
    }

    @Override
    protected void bindNormalViewHolder(NormalViewHolder holder, int position) {
        TimeAdapter.TimeViewHolder timeViewHolder = (TimeAdapter.TimeViewHolder) holder;
        timeViewHolder.bind(getItem(position, Schedule.class));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.viewholder_times;
    }

    public class TimeViewHolder extends NormalViewHolder<Schedule> {
        private ViewholderTimesBinding binding;

        TimeViewHolder(ViewholderTimesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        @Override
        public void bind(Schedule data) {
            binding.timeText.setText(changeTimeZone(data.getPremiere().toString()));
            binding.listTime.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Theater theater = scheduleCinemaModel.getDataTheater().getValue();
                   HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("schedule", data);
                    hashMap.put("movie", movie);
                    hashMap.put("cinema",theater.getName());
                    if (mContext instanceof MainActivity) {
                        ((MainActivity) mContext).getViewController().addFragment(ChonGheFragment.class, hashMap);
                    }
                }
            });
        }
        public String changeTimeZone(String s){
            String s1 = s.substring(0,2);
            String s2 = s.substring(3,5);
            int i = Integer.parseInt(s1)+7;
            if(i>=24){
                i = i-24;
            }
            s= i+":"+s2;
            return s;
        }
    }
}
