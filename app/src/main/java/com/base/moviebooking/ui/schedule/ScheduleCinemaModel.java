package com.base.moviebooking.ui.schedule;

import androidx.lifecycle.MutableLiveData;

import com.base.moviebooking.base.BaseViewModel;
import com.base.moviebooking.entity.Category;
import com.base.moviebooking.entity.Movie;
import com.base.moviebooking.entity.Schedule;
import com.base.moviebooking.entity.Theater;
import com.base.moviebooking.network.repository.Repository;

import java.util.List;

import javax.inject.Inject;

public class ScheduleCinemaModel extends BaseViewModel {
    private final Repository repository;
    MutableLiveData<List<Movie>> dataMovie = new MutableLiveData<>();
    MutableLiveData<List<Schedule>> dataSchedule = new MutableLiveData<>();
    public MutableLiveData<List<Movie>> getDataMovie() {
        return dataMovie;
    }

    public MutableLiveData<List<Schedule>> getDataSchedule() {
        return dataSchedule;
    }
    public  MutableLiveData<Theater> dataTheater = new MutableLiveData<>();
    public MutableLiveData<Theater> getData() {
        return dataTheater;
    }
    @Inject
    public ScheduleCinemaModel(Repository repository) {
        this.repository = repository;
    }

    public void sendDataTheater(Theater theater){
        dataTheater.setValue(theater);
    }
}
