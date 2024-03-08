package com.base.moviebooking.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.base.moviebooking.R;
import com.base.moviebooking.base.EndlessLoadingRecyclerViewAdapter;
import com.base.moviebooking.base.RecyclerViewAdapter;
import com.base.moviebooking.databinding.RcvPhimHomeBinding;
import com.base.moviebooking.databinding.ViewholderScheduleBinding;
import com.base.moviebooking.entity.Movie;
import com.base.moviebooking.entity.Schedule;
import com.base.moviebooking.listener.OnChooseRecyclerView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScheduleAdapter extends EndlessLoadingRecyclerViewAdapter<ViewholderScheduleBinding> {
    private Context mContext;
    private OnChooseRecyclerView mOnChooseRecyclerView;

    public ScheduleAdapter(Context context, boolean enableSelectedMode, Context mContext, OnChooseRecyclerView mOnChooseRecyclerView) {
        super(context, enableSelectedMode);
        this.mContext = mContext;
        this.mOnChooseRecyclerView = mOnChooseRecyclerView;
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
