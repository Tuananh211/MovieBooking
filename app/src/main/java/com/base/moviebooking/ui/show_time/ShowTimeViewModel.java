package com.base.moviebooking.ui.show_time;

import androidx.lifecycle.MutableLiveData;

import com.base.moviebooking.base.BaseViewModel;
import com.base.moviebooking.entity.Movie;

import javax.inject.Inject;

public class ShowTimeViewModel extends BaseViewModel {
    public  MutableLiveData<Movie> dataMovie = new MutableLiveData<>();
    public  MutableLiveData<Movie> dataMovieComment = new MutableLiveData<>();
    public MutableLiveData<Movie> getData() {
        return dataMovie;
    }
    public MutableLiveData<Movie> getDataMovieComent() {
        return dataMovieComment;
    }
    @Inject
    ShowTimeViewModel() {
    }
    public void sendData(Movie movie){
        dataMovie.setValue(movie);
    }
    public void sendDataMovieComment(Movie movie){
        dataMovieComment.setValue(movie);
    }
}