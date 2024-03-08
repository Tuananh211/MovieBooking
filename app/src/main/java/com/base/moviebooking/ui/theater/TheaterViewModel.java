package com.base.moviebooking.ui.theater;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.base.moviebooking.base.BaseViewModel;
import com.base.moviebooking.entity.Cinema;
import com.base.moviebooking.entity.Theater;
import com.base.moviebooking.network.repository.Repository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class TheaterViewModel extends BaseViewModel {
    private Repository repository;
    MutableLiveData<List<Theater>> dataCinema = new MutableLiveData<>();
    @Inject
    public TheaterViewModel(Repository repository) {
        this.repository= repository;
    }

    public void getCinema() {
        repository.getCinemas()
                .subscribe(new SingleObserver<List<Theater>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(List<Theater> list) {
                        dataCinema.postValue(list);
                        Log.d("fat", "success Register");
                    }


                    @Override
                    public void onError(Throwable e) {
                        Log.d("fat", "" + e.getMessage());
                    }
                });
    }

}