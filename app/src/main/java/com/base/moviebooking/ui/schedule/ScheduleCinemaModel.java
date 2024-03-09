package com.base.moviebooking.ui.schedule;

import com.base.moviebooking.base.BaseViewModel;
import com.base.moviebooking.network.repository.Repository;

import javax.inject.Inject;

public class ScheduleCinemaModel extends BaseViewModel {
    private final Repository repository;

    @Inject
    public ScheduleCinemaModel(Repository repository) {
        this.repository = repository;
    }
}
