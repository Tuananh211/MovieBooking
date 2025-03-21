// Generated by data binding compiler. Do not edit!
package com.base.moviebooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.base.moviebooking.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActiveSearchFragmentBinding extends ViewDataBinding {
  @NonNull
  public final DialogLoadingBinding dialogLoadMovie;

  @NonNull
  public final EditText edtKeyword;

  @NonNull
  public final ImageView imageBack;

  @NonNull
  public final ImageView imageDelete;

  @NonNull
  public final LinearLayout lnNoMovie;

  @NonNull
  public final RecyclerView rcvData;

  protected ActiveSearchFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      DialogLoadingBinding dialogLoadMovie, EditText edtKeyword, ImageView imageBack,
      ImageView imageDelete, LinearLayout lnNoMovie, RecyclerView rcvData) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dialogLoadMovie = dialogLoadMovie;
    this.edtKeyword = edtKeyword;
    this.imageBack = imageBack;
    this.imageDelete = imageDelete;
    this.lnNoMovie = lnNoMovie;
    this.rcvData = rcvData;
  }

  @NonNull
  public static ActiveSearchFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.active_search_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActiveSearchFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActiveSearchFragmentBinding>inflateInternal(inflater, R.layout.active_search_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ActiveSearchFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.active_search_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActiveSearchFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActiveSearchFragmentBinding>inflateInternal(inflater, R.layout.active_search_fragment, null, false, component);
  }

  public static ActiveSearchFragmentBinding bind(@NonNull View view) {
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
  public static ActiveSearchFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActiveSearchFragmentBinding)bind(component, view, R.layout.active_search_fragment);
  }
}
