// Generated by data binding compiler. Do not edit!
package com.base.moviebooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.base.moviebooking.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ThongtinFragmentBinding extends ViewDataBinding {
  @NonNull
  public final TextView descriptionMovie;

  @NonNull
  public final TextView directorMovie;

  @NonNull
  public final LinearLayout thongtinFragment;

  @NonNull
  public final TextView xemtiep;

  protected ThongtinFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView descriptionMovie, TextView directorMovie, LinearLayout thongtinFragment,
      TextView xemtiep) {
    super(_bindingComponent, _root, _localFieldCount);
    this.descriptionMovie = descriptionMovie;
    this.directorMovie = directorMovie;
    this.thongtinFragment = thongtinFragment;
    this.xemtiep = xemtiep;
  }

  @NonNull
  public static ThongtinFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.thongtin_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ThongtinFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ThongtinFragmentBinding>inflateInternal(inflater, R.layout.thongtin_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ThongtinFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.thongtin_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ThongtinFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ThongtinFragmentBinding>inflateInternal(inflater, R.layout.thongtin_fragment, null, false, component);
  }

  public static ThongtinFragmentBinding bind(@NonNull View view) {
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
  public static ThongtinFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ThongtinFragmentBinding)bind(component, view, R.layout.thongtin_fragment);
  }
}
