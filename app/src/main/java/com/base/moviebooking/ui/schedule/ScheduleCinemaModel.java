package com.base.moviebooking.ui.schedule;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.base.moviebooking.base.BaseViewModel;
import com.base.moviebooking.entity.Category;
import com.base.moviebooking.entity.Cinema;
import com.base.moviebooking.entity.Movie;
import com.base.moviebooking.entity.Schedule;
import com.base.moviebooking.entity.Theater;
import com.base.moviebooking.network.repository.Repository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class ScheduleCinemaModel extends BaseViewModel {
    private final Repository repository;

    public  MutableLiveData<Theater> dataTheater = new MutableLiveData<>();
    public MutableLiveData<Theater> getDataTheater() {
        return dataTheater;
    }

    public  MutableLiveData<String> day = new MutableLiveData<>();
    public MutableLiveData<String> getDay() {
        return day;
    }
    
    @Inject
    public ScheduleCinemaModel(Repository repository) {
        this.repository = repository;
    }

    public void sendDataTheater(Theater theater){
        dataTheater.setValue(theater);
    }
    public void sendDay(String dayString) {
        day.setValue(dayString);
    }
    

}
