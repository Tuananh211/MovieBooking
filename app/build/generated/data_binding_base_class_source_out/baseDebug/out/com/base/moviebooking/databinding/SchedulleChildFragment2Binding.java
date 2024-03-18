// Generated by data binding compiler. Do not edit!
package com.base.moviebooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.base.moviebooking.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SchedulleChildFragment2Binding extends ViewDataBinding {
  @NonNull
  public final DialogLoadingBinding dialogLoadSchedule2;

  @NonNull
  public final LinearLayout lnNoMovie2;

  @NonNull
  public final RecyclerView rcvLichphim;

  @NonNull
  public final NestedScrollView scrollView2;

  protected SchedulleChildFragment2Binding(Object _bindingComponent, View _root,
      int _localFieldCount, DialogLoadingBinding dialogLoadSchedule2, LinearLayout lnNoMovie2,
      RecyclerView rcvLichphim, NestedScrollView scrollView2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dialogLoadSchedule2 = dialogLoadSchedule2;
    this.lnNoMovie2 = lnNoMovie2;
    this.rcvLichphim = rcvLichphim;
    this.scrollView2 = scrollView2;
  }

  @NonNull
  public static SchedulleChildFragment2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.schedulle_child_fragment2, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SchedulleChildFragment2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SchedulleChildFragment2Binding>inflateInternal(inflater, R.layout.schedulle_child_fragment2, root, attachToRoot, component);
  }

  @NonNull
  public static SchedulleChildFragment2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.schedulle_child_fragment2, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SchedulleChildFragment2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SchedulleChildFragment2Binding>inflateInternal(inflater, R.layout.schedulle_child_fragment2, null, false, component);
  }

  public static SchedulleChildFragment2Binding bind(@NonNull View view) {
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
  public static SchedulleChildFragment2Binding bind(@NonNull View view,
      @Nullable Object component) {
    return (SchedulleChildFragment2Binding)bind(component, view, R.layout.schedulle_child_fragment2);
  }
}
