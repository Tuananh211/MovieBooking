// Generated by data binding compiler. Do not edit!
package com.base.moviebooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.base.moviebooking.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ThongtinThanhtoanFragmentBinding extends ViewDataBinding {
  @NonNull
  public final Button btnLuuanh;

  @NonNull
  public final Button btnVehome;

  @NonNull
  public final ImageView imgQr;

  protected ThongtinThanhtoanFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button btnLuuanh, Button btnVehome, ImageView imgQr) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLuuanh = btnLuuanh;
    this.btnVehome = btnVehome;
    this.imgQr = imgQr;
  }

  @NonNull
  public static ThongtinThanhtoanFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.thongtin_thanhtoan_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ThongtinThanhtoanFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ThongtinThanhtoanFragmentBinding>inflateInternal(inflater, R.layout.thongtin_thanhtoan_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ThongtinThanhtoanFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.thongtin_thanhtoan_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ThongtinThanhtoanFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ThongtinThanhtoanFragmentBinding>inflateInternal(inflater, R.layout.thongtin_thanhtoan_fragment, null, false, component);
  }

  public static ThongtinThanhtoanFragmentBinding bind(@NonNull View view) {
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
  public static ThongtinThanhtoanFragmentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ThongtinThanhtoanFragmentBinding)bind(component, view, R.layout.thongtin_thanhtoan_fragment);
  }
}
