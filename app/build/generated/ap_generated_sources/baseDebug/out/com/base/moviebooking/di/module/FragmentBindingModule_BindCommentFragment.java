package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.comments.CommentFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBindingModule_BindCommentFragment.CommentFragmentSubcomponent.class)
public abstract class FragmentBindingModule_BindCommentFragment {
  private FragmentBindingModule_BindCommentFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CommentFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommentFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface CommentFragmentSubcomponent extends AndroidInjector<CommentFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CommentFragment> {}
  }
}
