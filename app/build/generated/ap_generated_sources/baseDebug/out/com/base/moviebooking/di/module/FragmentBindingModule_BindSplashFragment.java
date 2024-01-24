package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.splash.SplashFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBindingModule_BindSplashFragment.SplashFragmentSubcomponent.class)
public abstract class FragmentBindingModule_BindSplashFragment {
  private FragmentBindingModule_BindSplashFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SplashFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SplashFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SplashFragmentSubcomponent extends AndroidInjector<SplashFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SplashFragment> {}
  }
}
