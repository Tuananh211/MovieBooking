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
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.base.moviebooking.R;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ThongtinFragmentBinding extends ViewDataBinding {
  @NonNull
  public final DialogLoadingBinding actorLoad;

  @NonNull
  public final RecyclerView cateView;

  @NonNull
  public final DialogLoadingBinding categoryLoad;

  @NonNull
  public final TextView descriptionMovie;

  @NonNull
  public final TextView dienvien;

  @NonNull
  public final ShapeableImageView directorImage;

  @NonNull
  public final TextView directorMovie;

  @NonNull
  public final PlayerView exoplayer;

  @NonNull
  public final ImageView imgPlayMovie;

  @NonNull
  public final RecyclerView listActor;

  @NonNull
  public final TextView test1;

  @NonNull
  public final LinearLayout thongtinFragment;

  @NonNull
  public final TextView trailer;

  @NonNull
  public final TextView txtCategory;

  protected ThongtinFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      DialogLoadingBinding actorLoad, RecyclerView cateView, DialogLoadingBinding categoryLoad,
      TextView descriptionMovie, TextView dienvien, ShapeableImageView directorImage,
      TextView directorMovie, PlayerView exoplayer, ImageView imgPlayMovie, RecyclerView listActor,
      TextView test1, LinearLayout thongtinFragment, TextView trailer, TextView txtCategory) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actorLoad = actorLoad;
    this.cateView = cateView;
    this.categoryLoad = categoryLoad;
    this.descriptionMovie = descriptionMovie;
    this.dienvien = dienvien;
    this.directorImage = directorImage;
    this.directorMovie = directorMovie;
    this.exoplayer = exoplayer;
    this.imgPlayMovie = imgPlayMovie;
    this.listActor = listActor;
    this.test1 = test1;
    this.thongtinFragment = thongtinFragment;
    this.trailer = trailer;
    this.txtCategory = txtCategory;
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
