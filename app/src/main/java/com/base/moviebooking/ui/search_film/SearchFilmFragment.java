package com.base.moviebooking.ui.search_film;

import com.base.moviebooking.R;
import com.base.moviebooking.adapter.HomeAdapter;
import com.base.moviebooking.base.BaseFragment;
import com.base.moviebooking.databinding.ActiveSearchFragmentBinding;
import com.base.moviebooking.databinding.ThongtinFragmentBinding;

public class SearchFilmFragment  extends BaseFragment<ActiveSearchFragmentBinding> {
    private HomeAdapter homeAdapter;
    @Override
    protected int getLayoutId() {
        return R.layout.active_search_fragment;
    }

    @Override
    public void backFromAddFragment() {

    }

    @Override
    public boolean backPressed() {
        return false;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }
}
