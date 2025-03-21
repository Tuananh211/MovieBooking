// Generated by data binding compiler. Do not edit!
package com.base.moviebooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.base.moviebooking.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LichPhimBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final CollapsingToolbarLayout collapsingLayout;

  @NonNull
  public final LinearLayout constraintLayout;

  @NonNull
  public final ImageView imgMovie;

  @NonNull
  public final TextView movieStar;

  @NonNull
  public final TextView movieTime;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final ViewPager2 viewpagerLichphim;

  protected LichPhimBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingLayout,
      LinearLayout constraintLayout, ImageView imgMovie, TextView movieStar, TextView movieTime,
      NestedScrollView nestedScrollView, TabLayout tabLayout, Toolbar toolbar,
      ViewPager2 viewpagerLichphim) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBarLayout = appBarLayout;
    this.collapsingLayout = collapsingLayout;
    this.constraintLayout = constraintLayout;
    this.imgMovie = imgMovie;
    this.movieStar = movieStar;
    this.movieTime = movieTime;
    this.nestedScrollView = nestedScrollView;
    this.tabLayout = tabLayout;
    this.toolbar = toolbar;
    this.viewpagerLichphim = viewpagerLichphim;
  }

  @NonNull
  public static LichPhimBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.lich_phim, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LichPhimBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LichPhimBinding>inflateInternal(inflater, R.layout.lich_phim, root, attachToRoot, component);
  }

  @NonNull
  public static LichPhimBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.lich_phim, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LichPhimBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LichPhimBinding>inflateInternal(inflater, R.layout.lich_phim, null, false, component);
  }

  public static LichPhimBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LichPhimBinding bind(@NonNull View view, @Nullable Object component) {
    return (LichPhimBinding)bind(component, view, R.layout.lich_phim);
  }
}
