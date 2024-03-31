package com.base.moviebooking.ui.comments;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.base.moviebooking.base.BaseViewModel;
import com.base.moviebooking.entity.Account;
import com.base.moviebooking.entity.Comment;
import com.base.moviebooking.entity.CreateComment;
import com.base.moviebooking.entity.Seat;
import com.base.moviebooking.network.repository.Repository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class CommentModel extends BaseViewModel {
    private final Repository repository;
    MutableLiveData<List<Comment>> comments = new MutableLiveData<>();
    MutableLiveData<List<Account>> dataUser = new MutableLiveData<>();
    MutableLiveData<List<Comment>> userComment = new MutableLiveData<>();
    public MutableLiveData<List<Account>> getDataUser() {
        return dataUser;
    }
    public MutableLiveData<List<Comment>> getDataComment() {
        return comments;
    }
    public MutableLiveData<List<Comment>> getDataUserComment() {
        return userComment;
    }
    @Inject
    public CommentModel(Repository repository) {
        this.repository = repository;
    }

    public void getListComments(int movieId) {
        repository.getListComments(movieId)
                .subscribe(new SingleObserver<List<Comment>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(List<Comment> list) {
                        comments.postValue(list);
                    }


                    @Override
                    public void onError(Throwable e) {
                        Log.d("fat", "" + e.getMessage());
                    }
                });
    }
    public void getUserComment(int movieId) {
        repository.getMovieCommentOfUser(movieId)
                .subscribe(new SingleObserver<List<Comment>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(List<Comment> list) {
                        userComment.postValue(list);
                    }


                    @Override
                    public void onError(Throwable e) {
                        Log.d("fat", "" + e.getMessage());
                    }
                });
    }

    public void getInfo() {
        repository.getInfoUser()
                .subscribe(new SingleObserver<List<Account>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(List<Account> account) {
                        dataUser.postValue(account);
                        Log.d("fat", "success get Data User");
                    }


                    @Override
                    public void onError(Throwable e) {
                        Log.d("fat", "" + e.getMessage());
                    }
                });
    }

    public void createComment(CreateComment createComment) {
        repository.createComment(createComment)
                .subscribe(new SingleObserver<List<Comment>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(List<Comment> list) {
                        comments.postValue(list);
                    }


                    @Override
                    public void onError(Throwable e) {
                        Log.d("fat", "" + e.getMessage());
                    }
                });
    }
}
