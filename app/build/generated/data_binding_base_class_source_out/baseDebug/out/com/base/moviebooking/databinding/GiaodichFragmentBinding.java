// Generated by data binding compiler. Do not edit!
package com.base.moviebooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.base.moviebooking.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class GiaodichFragmentBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rcvGd;

  protected GiaodichFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView rcvGd) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rcvGd = rcvGd;
  }

  @NonNull
  public static GiaodichFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.giaodich_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static GiaodichFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<GiaodichFragmentBinding>inflateInternal(inflater, R.layout.giaodich_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static GiaodichFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.giaodich_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static GiaodichFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<GiaodichFragmentBinding>inflateInternal(inflater, R.layout.giaodich_fragment, null, false, component);
  }

  public static GiaodichFragmentBinding bind(@NonNull View view) {
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
  public static GiaodichFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (GiaodichFragmentBinding)bind(component, view, R.layout.giaodich_fragment);
  }
}
