package com.base.moviebooking.base;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

import com.base.moviebooking.utils.Define;
import com.base.moviebooking.utils.DialogUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

public abstract class BaseFragment<T extends ViewDataBinding> extends DaggerFragment {

    @Inject
    protected ViewModelProvider.Factory viewModelFactory;

    protected T binding;

    /**
     * The ViewController for control fragments in an activity
     */
    @Nullable
    protected ViewController mViewController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false);
        binding.setLifecycleOwner(this.getViewLifecycleOwner());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initData();
    }

    protected abstract int getLayoutId();

    public void setViewController(ViewController viewController) {
        this.mViewController = viewController;
    }

    public void setData(HashMap<String, Object> data) {
        if (data == null || data.isEmpty()) {
            setArguments(new Bundle());
            return;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            if (entry.getValue() instanceof String) {
                bundle.putString(entry.getKey(), (String) entry.getValue());
            } else if (entry.getValue() instanceof Double) {
                bundle.putDouble(entry.getKey(), ((Double) entry.getValue()));
            } else if (entry.getValue() instanceof Integer) {
                bundle.putInt(entry.getKey(), (Integer) entry.getValue());
            } else if (entry.getValue() instanceof Float) {
                bundle.putFloat(entry.getKey(), ((Float) entry.getValue()));
            } else if (entry.getValue() instanceof Boolean) {
                bundle.putBoolean(entry.getKey(), ((Boolean) entry.getValue()));
            } else if (entry.getValue() instanceof Parcelable) {
                bundle.putParcelable(entry.getKey(), ((Parcelable) entry.getValue()));
            } else if (entry.getValue() instanceof String[]) {
                bundle.putStringArray(entry.getKey(), (String[]) entry.getValue());
            } else if (entry.getValue() instanceof ArrayList) {
                if (((ArrayList) entry.getValue()).size() > 0 && ((ArrayList) entry.getValue()).get(0) instanceof String) {
                    bundle.putStringArrayList(entry.getKey(), (ArrayList<String>) entry.getValue());
                } else if (((ArrayList) entry.getValue()).size() > 0 && ((ArrayList) entry.getValue()).get(0) instanceof Parcelable) {
                    bundle.putParcelableArrayList(entry.getKey(), (ArrayList<? extends Parcelable>) entry.getValue());
                }
            } else if (entry.getValue() instanceof Serializable) {
                bundle.putSerializable(entry.getKey(), (Serializable) entry.getValue());
            }
        }
        setArguments(bundle);
    }

    protected void handleListResponse(ListResponse<?> response) {
        switch (response.getType()) {
            case Define.ResponseStatus.LOADING:
                DialogUtil.getInstance(getContext()).show();
                break;
            case Define.ResponseStatus.SUCCESS:
                getListResponse(response.getData());
                DialogUtil.getInstance(getContext()).hidden();
                break;
            case Define.ResponseStatus.ERROR:
                handleNetworkError(response.getError(), true);
                DialogUtil.getInstance(getContext()).hidden();
        }
    }

    protected void handleLoadMoreResponse(ListResponse<?> response, boolean isRefresh, boolean canLoadmore) {
        switch (response.getType()) {
            case Define.ResponseStatus.LOADING:
                DialogUtil.getInstance(getContext()).show();
                break;
            case Define.ResponseStatus.SUCCESS:
                getListResponse(response.getData(), isRefresh, canLoadmore);
                DialogUtil.getInstance(getContext()).hidden();
                break;
            case Define.ResponseStatus.ERROR:
                handleNetworkError(response.getError(), true);
                DialogUtil.getInstance(getContext()).hidden();
        }
    }

    protected <U> void handleObjectResponse(ObjectResponse<U> response) {
        switch (response.getStatus()) {
            case Define.ResponseStatus.LOADING:
                DialogUtil.getInstance(getContext()).show();
                break;
            case Define.ResponseStatus.SUCCESS:
                getObjectResponse(response.getData());
                DialogUtil.getInstance(getContext()).hidden();
                break;
            case Define.ResponseStatus.ERROR:
                handleNetworkError(response.getError(), true);
                DialogUtil.getInstance(getContext()).hidden();
        }
    }

    protected void getListResponse(List<?> data) {

    }

    protected void getListResponse(List<?> data, boolean isRefresh, boolean canLoadmore) {

    }

    protected <U> void getObjectResponse(U data) {

    }

    protected void handleNetworkError(Throwable throwable, boolean isShowDialog) {
        if (getActivity() != null && getActivity() instanceof BaseActivity) {
            ((BaseActivity) getActivity()).handleNetworkError(throwable, isShowDialog);
        }
    }

    protected boolean avoidDuplicateClick() {
        if (getActivity() != null && getActivity() instanceof BaseActivity) {
            return ((BaseActivity) getActivity()).avoidDuplicateClick();
        }

        return false;
    }

    public abstract void backFromAddFragment();

    public abstract boolean backPressed();

    public abstract void initView();

    public abstract void initData();
}
