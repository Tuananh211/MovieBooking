package com.base.moviebooking.ui.sign_in;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.base.moviebooking.base.BaseViewModel;
import com.base.moviebooking.entity.ForgetPass;
import com.base.moviebooking.entity.LoginRequest;
import com.base.moviebooking.entity.LoginResponse;
import com.base.moviebooking.network.repository.Repository;

import javax.inject.Inject;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class SignInViewModel extends BaseViewModel {
    private  Repository repository;
    MutableLiveData<LoginResponse> dataLogin = new MutableLiveData<>();
    MutableLiveData<LoginResponse> dataResponeMK = new MutableLiveData<>();

    public MutableLiveData<LoginResponse> getLoginRespone() {
        return dataLogin;
    }
    @Inject
    public SignInViewModel(Repository repository) {
        this.repository = repository;
    }


    public void login(LoginRequest loginRequest) {
        repository.getLoginResponse(loginRequest)
                .subscribe(new SingleObserver<LoginResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(LoginResponse loginResponse) {
                        dataLogin.postValue(loginResponse);
                        Log.d("fat", "success Login");
                    }


                    @Override
                    public void onError(Throwable e) {
                        Log.d("fat", "" + e.getMessage());
                    }
                });
    }
    public void quenMK(ForgetPass e) {
        repository.forgotPassword(e)
                .subscribe(new SingleObserver<LoginResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(LoginResponse response) {
                        dataResponeMK.postValue(response);
                    }


                    @Override
                    public void onError(Throwable e) {
                        Log.d("fat", "" + e.getMessage());
                    }
                });
    }

}
