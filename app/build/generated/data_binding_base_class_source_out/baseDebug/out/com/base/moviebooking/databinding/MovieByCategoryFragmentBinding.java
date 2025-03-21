// Generated by data binding compiler. Do not edit!
package com.base.moviebooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.base.moviebooking.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MovieByCategoryFragmentBinding extends ViewDataBinding {
  @NonNull
  public final DialogLoadingBinding dialogLoad2;

  @NonNull
  public final LinearLayout lnNoSchedule;

  @NonNull
  public final RecyclerView rcvSearch2;

  protected MovieByCategoryFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, DialogLoadingBinding dialogLoad2, LinearLayout lnNoSchedule,
      RecyclerView rcvSearch2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dialogLoad2 = dialogLoad2;
    this.lnNoSchedule = lnNoSchedule;
    this.rcvSearch2 = rcvSearch2;
  }

  @NonNull
  public static MovieByCategoryFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movie_by_category_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MovieByCategoryFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MovieByCategoryFragmentBinding>inflateInternal(inflater, R.layout.movie_by_category_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static MovieByCategoryFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movie_by_category_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MovieByCategoryFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MovieByCategoryFragmentBinding>inflateInternal(inflater, R.layout.movie_by_category_fragment, null, false, component);
  }

  public static MovieByCategoryFragmentBinding bind(@NonNull View view) {
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
  public static MovieByCategoryFragmentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (MovieByCategoryFragmentBinding)bind(component, view, R.layout.movie_by_category_fragment);
  }
}
