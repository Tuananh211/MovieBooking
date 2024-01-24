package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.theater.TheaterFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBindingModule_BindTheaterFragment.TheaterFragmentSubcomponent.class)
public abstract class FragmentBindingModule_BindTheaterFragment {
  private FragmentBindingModule_BindTheaterFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TheaterFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TheaterFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TheaterFragmentSubcomponent extends AndroidInjector<TheaterFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TheaterFragment> {}
  }
}
