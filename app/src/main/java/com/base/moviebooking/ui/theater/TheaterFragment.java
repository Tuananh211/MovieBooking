package com.base.moviebooking.ui.theater;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.base.moviebooking.DataLocalManager;
import com.base.moviebooking.R;
import com.base.moviebooking.adapter.HomeAdapter;
import com.base.moviebooking.adapter.TheaterAdapter;
import com.base.moviebooking.base.BaseFragment;
import com.base.moviebooking.databinding.RapphimFragmentBinding;
import com.base.moviebooking.entity.Category;
import com.base.moviebooking.entity.FilmInfo;
import com.base.moviebooking.entity.Movie;
import com.base.moviebooking.entity.Schedule;
import com.base.moviebooking.entity.Theater;
import com.base.moviebooking.listener.OnChooseRecyclerView;
import com.base.moviebooking.ui.main.MainActivity;
import com.base.moviebooking.ui.schedule.ScheduleCinemaFragment;
import com.base.moviebooking.ui.show_time.ShowTimeFragment;
import com.base.moviebooking.ui.sign_in.SignInFragment;
import com.base.moviebooking.ui.theater.TheaterViewModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TheaterFragment extends BaseFragment<RapphimFragmentBinding> {
    String TAG="fat";
    private TheaterViewModel mViewModel;
    private List<Theater> rapList= new ArrayList<>();
    private TheaterAdapter rapAdapter;
    @Override
    protected int getLayoutId() {

        return R.layout.rapphim_fragment;
    }

    @Override
    public void backFromAddFragment() {

    }

    @Override
    public boolean backPressed() {
        return true;
    }

    @Override
    public void initView() {
        mViewModel = ViewModelProviders.of(this,viewModelFactory).get(TheaterViewModel.class);
        binding.rcvRapphim.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        mViewModel.getCinema();
        rapAdapter =  new TheaterAdapter(getContext(), false, getContext(), new OnChooseRecyclerView() {
            @Override
            public void onChoosePhim(Movie movie) {

            }

            @Override
            public void onChooseRap(Theater theater) {
                if (DataLocalManager.getInstance() != null && DataLocalManager.getBooleanValue()) {
                    Log.d("mmm", "home đã Login", null);
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("theater", theater);
                    mViewController.addFragment(ScheduleCinemaFragment.class, hashMap);
                } else {
                    Log.d("mmm", "home chưa Login", null);
                    getActivity().findViewById(R.id.bottombar).setVisibility(View.GONE);
                    ((MainActivity) getActivity()).getViewController().replaceFragment(SignInFragment.class, null);

                }
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
        mViewModel.dataCinema.observe(getViewLifecycleOwner(), new Observer<List<Theater>>() {
            @Override
            public void onChanged(List<Theater> cinemaListResponse) {
                if (cinemaListResponse.size()!=0){
                    rapAdapter.addModels(cinemaListResponse, false);
                    Log.d("fat", "add Model", null);
                    getActivity().findViewById(R.id.dialog_load).setVisibility(View.GONE);
                }
                else{
                    rapAdapter.addModels(getListModel(),false);
                }

            }
        });
        binding.rcvRapphim.setAdapter(rapAdapter);
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL);
        binding.rcvRapphim.addItemDecoration(itemDecoration);
    }
    private List<Theater> getListModel() {
        rapList.add(new Theater(1,"Mê Linh Plaza","http://res.cloudinary.com/drlb07jfr/image/upload/v1709864456/ou0mhqz3nps1x4twk4p4.jpg","","Hà Nội","0987654321"));
        rapList.add(new Theater(2,"Joy City Point","http://res.cloudinary.com/drlb07jfr/image/upload/v1709864456/ou0mhqz3nps1x4twk4p4.jpg","116 Nguyễn Du,Quận 1,Tp.HCM","TPHCM","0987654321"));
        rapList.add(new Theater(3,"Vincom Plaza","http://res.cloudinary.com/drlb07jfr/image/upload/v1709864456/ou0mhqz3nps1x4twk4p4.jpg","","Hà Nội","0987654321"));
        rapList.add(new Theater(4,"Tower Plaza","http://res.cloudinary.com/drlb07jfr/image/upload/v1709864456/ou0mhqz3nps1x4twk4p4.jpg","","Hà Nội","0987654321"));
        rapList.add(new Theater(6,"Thăng Long Plaza","http://res.cloudinary.com/drlb07jfr/image/upload/v1709864456/ou0mhqz3nps1x4twk4p4.jpg","","Hà Nội","0987654321"));
        rapList.add(new Theater(8,"Hoàn Kiếm Plaza","http://res.cloudinary.com/drlb07jfr/image/upload/v1709864456/ou0mhqz3nps1x4twk4p4.jpg","","Hà Nội","0987654321"));
        rapList.add(new Theater(9,"Vincom Thái Bình","http://res.cloudinary.com/drlb07jfr/image/upload/v1709864456/ou0mhqz3nps1x4twk4p4.jpg","","Hà Nội","0987654321"));
        rapList.add(new Theater(10,"Lotte Hà Nội","http://res.cloudinary.com/drlb07jfr/image/upload/v1709864456/ou0mhqz3nps1x4twk4p4.jpg","","Hà Nội","0987654321"));

        return rapList;
    }


    @Override
    public void initData() {

    }
    @Override
    protected void getListResponse(List<?> data, boolean isRefresh, boolean canLoadmore) {

    }


    @Override
    public void onResume() {
        super.onResume();
        getActivity().findViewById(R.id.view_header).setVisibility(View.GONE);
        getActivity().findViewById(R.id.img_header).setVisibility(View.GONE);
        TextView textView = getActivity().findViewById(R.id.tvt_header);
        textView.setText("Rạp phim");
        Log.d(TAG,"on Resume Rap");

    }



}
