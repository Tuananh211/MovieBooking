package com.base.moviebooking.ui.search_film;

import androidx.lifecycle.MutableLiveData;

import com.base.moviebooking.base.BaseViewModel;
import com.base.moviebooking.entity.Movie;
import com.base.moviebooking.network.repository.Repository;

import java.util.List;

import javax.inject.Inject;

public class SearchFilmModel extends BaseViewModel {
    private final Repository repository;
    MutableLiveData<List<Movie>> dataMovie = new MutableLiveData<>();

    public MutableLiveData<List<Movie>> getDataMovie() {
        return dataMovie;
    }

    @Inject
    public SearchFilmModel(Repository repository) {
        this.repository = repository;
    }

}
