package com.base.moviebooking.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.base.moviebooking.R;
import com.base.moviebooking.base.EndlessLoadingRecyclerViewAdapter;
import com.base.moviebooking.base.RecyclerViewAdapter;
import com.base.moviebooking.databinding.RcvPhimHomeBinding;
import com.base.moviebooking.databinding.ViewholderScheduleBinding;
import com.base.moviebooking.entity.Category;
import com.base.moviebooking.entity.FilmInfo;
import com.base.moviebooking.entity.Movie;
import com.base.moviebooking.entity.Schedule;
import com.base.moviebooking.entity.Theater;
import com.base.moviebooking.listener.OnChooseRecyclerView;
import com.base.moviebooking.ui.chonghe.ChonGheFragment;
import com.base.moviebooking.ui.main.MainActivity;
import com.base.moviebooking.ui.schedule.ScheduleCinemaModel;
import com.base.moviebooking.ui.schedule_child.ScheduleChildModel;

import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScheduleAdapter extends EndlessLoadingRecyclerViewAdapter<ViewholderScheduleBinding> {
    private Context mContext;
    private OnChooseRecyclerView mOnChooseRecyclerView;
    ScheduleCinemaModel scheduleCinemaModel;
    ScheduleChildModel scheduleChildModel;
    TimeAdapter timeAdapter;
    private LifecycleOwner lifecycleOwner;

    public ScheduleAdapter(Context context, boolean enableSelectedMode, Context mContext, OnChooseRecyclerView mOnChooseRecyclerView, LifecycleOwner lifecycleOwner) {
        super(context, enableSelectedMode);
        this.mContext = mContext;
        this.mOnChooseRecyclerView = mOnChooseRecyclerView;
        this.lifecycleOwner=lifecycleOwner;
    }

    @Override
    protected RecyclerView.ViewHolder initNormalViewHolder(ViewholderScheduleBinding binding, ViewGroup parent) {
        return new ScheduleViewHolder(binding);
    }

    @Override
    protected void bindNormalViewHolder(NormalViewHolder holder, int position) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.viewholder_schedule;
    }

    public class ScheduleViewHolder extends NormalViewHolder<Movie> {
        private ViewholderScheduleBinding binding;

        ScheduleViewHolder(ViewholderScheduleBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        @Override
        public void bind(Movie data) {

            // doi anh base64
            String base64Image = data.getImage();
//            Log.d("mmm","base64"+base64Image,null);
            byte[] imageBytes = Base64.decode(parseBase64(base64Image), Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
            binding.image.setImageBitmap(bitmap);
            binding.tvtAgeLimit.setText("C" + data.getAgeLimit());
            binding.tvtName.setText(data.getName());
            scheduleCinemaModel = ViewModelProviders.of((FragmentActivity) mContext).get(ScheduleCinemaModel.class);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
            binding.listTimes.setLayoutManager(gridLayoutManager);
            String day = scheduleCinemaModel.day.getValue();
            Theater theater = scheduleCinemaModel.getDataTheater().getValue();
            scheduleChildModel.getTimeSchedule(theater.getId(),data.getId(),day);
            timeAdapter =  new TimeAdapter(getContext(), false, getContext(), new OnChooseRecyclerView() {
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
                    Theater theater = scheduleCinemaModel.getDataTheater().getValue();
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("schedule", schedule);
                    hashMap.put("movie", data);
                    hashMap.put("cinema",theater.getName());
                    if (mContext instanceof MainActivity) {
                        ((MainActivity) mContext).getViewController().addFragment(ChonGheFragment.class, hashMap);
                    }
                }
            });
            scheduleChildModel.dataSchedule.observe((LifecycleOwner) lifecycleOwner.getLifecycle(), new Observer<List<Schedule>>() {
                @Override
                public void onChanged(List<Schedule> listScheduleResponse) {
                    if (listScheduleResponse.size()!=0){
                        timeAdapter.addModels(listScheduleResponse, false);
                        Log.d("fat", "add Model", null);
//                        getActivity().findViewById(R.id.dialog_load).setVisibility(View.GONE);
//                        binding.lnNoMovie.setVisibility(View.GONE);
                    }
//                    else{
//                        getActivity().findViewById(R.id.dialog_load).setVisibility(View.GONE);
//                        binding.lnNoMovie.setVisibility(View.VISIBLE);
//                    }

                }
            });
            binding.listTimes.setAdapter(timeAdapter);
            timeAdapter.notifyDataSetChanged();
        }
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
