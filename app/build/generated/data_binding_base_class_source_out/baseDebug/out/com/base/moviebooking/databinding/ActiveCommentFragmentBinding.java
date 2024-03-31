// Generated by data binding compiler. Do not edit!
package com.base.moviebooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.base.moviebooking.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActiveCommentFragmentBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView imgAvatar;

  @NonNull
  public final RelativeLayout lyComment;

  @NonNull
  public final LinearLayout lyCommentEmpty;

  @NonNull
  public final LinearLayout lySendComment;

  @NonNull
  public final RecyclerView ryComment;

  @NonNull
  public final TextView tvBannerComment;

  @NonNull
  public final TextView tvContentComment;

  protected ActiveCommentFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CircleImageView imgAvatar, RelativeLayout lyComment, LinearLayout lyCommentEmpty,
      LinearLayout lySendComment, RecyclerView ryComment, TextView tvBannerComment,
      TextView tvContentComment) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgAvatar = imgAvatar;
    this.lyComment = lyComment;
    this.lyCommentEmpty = lyCommentEmpty;
    this.lySendComment = lySendComment;
    this.ryComment = ryComment;
    this.tvBannerComment = tvBannerComment;
    this.tvContentComment = tvContentComment;
  }

  @NonNull
  public static ActiveCommentFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.active_comment_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActiveCommentFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActiveCommentFragmentBinding>inflateInternal(inflater, R.layout.active_comment_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ActiveCommentFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.active_comment_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActiveCommentFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActiveCommentFragmentBinding>inflateInternal(inflater, R.layout.active_comment_fragment, null, false, component);
  }

  public static ActiveCommentFragmentBinding bind(@NonNull View view) {
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
  public static ActiveCommentFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActiveCommentFragmentBinding)bind(component, view, R.layout.active_comment_fragment);
  }
}
