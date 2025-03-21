package com.base.moviebooking.ui.schedule_child.schedule_child1;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.base.moviebooking.base.BaseViewModel;
import com.base.moviebooking.entity.Movie;
import com.base.moviebooking.entity.MovieSchedule;
import com.base.moviebooking.entity.Schedule;
import com.base.moviebooking.network.repository.Repository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class ScheduleChildModel1 extends BaseViewModel {
    private Repository repository;

    MutableLiveData<List<MovieSchedule>> dataMovie = new MutableLiveData<>();
    public MutableLiveData<List<MovieSchedule>> getDataMovie() {
        return dataMovie;
    }

    public MutableLiveData<List<Schedule>> dataSchedule = new MutableLiveData<>();
    public MutableLiveData<List<Schedule>> getDataSchedule() {
        return dataSchedule;
    }

    @Inject
    public ScheduleChildModel1(Repository repository) {
        this.repository = repository;
    }

    public void getMovieHasSchedule(int theaterId,String day) {
        repository.getMoviesHasSchedule(theaterId,day)
                .subscribe(new SingleObserver<List<MovieSchedule>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(List<MovieSchedule> list) {
                        dataMovie.postValue(list);
                        Log.d("fat", "success Cinemas");
                    }


                    @Override
                    public void onError(Throwable e) {
                        Log.d("token", "" + e.getMessage());
                    }
                });
    }
    public void getTimeSchedule(int theaterId,int movieId,String day) {
        repository.getTimeSchedule(theaterId,movieId,day)
                .subscribe(new SingleObserver<List<Schedule>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(List<Schedule> list) {
                        dataSchedule.postValue(list);
                        Log.d("fat", "success Cinemas");
                    }


                    @Override
                    public void onError(Throwable e) {
                        Log.d("token", "" + e.getMessage());
                    }
                });
    }
}
