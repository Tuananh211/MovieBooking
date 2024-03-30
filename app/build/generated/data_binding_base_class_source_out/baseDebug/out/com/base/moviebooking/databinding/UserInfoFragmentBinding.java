// Generated by data binding compiler. Do not edit!
package com.base.moviebooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.base.moviebooking.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class UserInfoFragmentBinding extends ViewDataBinding {
  @NonNull
  public final EditText address;

  @NonNull
  public final ImageView backTt;

  @NonNull
  public final EditText birthdayUser;

  @NonNull
  public final Button btnCapnhat;

  @NonNull
  public final Button btnPass;

  @NonNull
  public final TextView gmailUser;

  @NonNull
  public final ShapeableImageView imgUser;

  @NonNull
  public final ProgressBar loading;

  @NonNull
  public final RadioButton nam;

  @NonNull
  public final EditText nameUser;

  @NonNull
  public final RadioButton nu;

  @NonNull
  public final TextView phoneuser;

  @NonNull
  public final ShapeableImageView pickImage;

  protected UserInfoFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText address, ImageView backTt, EditText birthdayUser, Button btnCapnhat, Button btnPass,
      TextView gmailUser, ShapeableImageView imgUser, ProgressBar loading, RadioButton nam,
      EditText nameUser, RadioButton nu, TextView phoneuser, ShapeableImageView pickImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.address = address;
    this.backTt = backTt;
    this.birthdayUser = birthdayUser;
    this.btnCapnhat = btnCapnhat;
    this.btnPass = btnPass;
    this.gmailUser = gmailUser;
    this.imgUser = imgUser;
    this.loading = loading;
    this.nam = nam;
    this.nameUser = nameUser;
    this.nu = nu;
    this.phoneuser = phoneuser;
    this.pickImage = pickImage;
  }

  @NonNull
  public static UserInfoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.user_info_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static UserInfoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<UserInfoFragmentBinding>inflateInternal(inflater, R.layout.user_info_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static UserInfoFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.user_info_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static UserInfoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<UserInfoFragmentBinding>inflateInternal(inflater, R.layout.user_info_fragment, null, false, component);
  }

  public static UserInfoFragmentBinding bind(@NonNull View view) {
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
  public static UserInfoFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (UserInfoFragmentBinding)bind(component, view, R.layout.user_info_fragment);
  }
}
