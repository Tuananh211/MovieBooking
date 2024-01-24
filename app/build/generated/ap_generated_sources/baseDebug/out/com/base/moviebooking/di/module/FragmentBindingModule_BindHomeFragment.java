package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.home.HomeFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBindingModule_BindHomeFragment.HomeFragmentSubcomponent.class)
public abstract class FragmentBindingModule_BindHomeFragment {
  private FragmentBindingModule_BindHomeFragment() {}

  @Binds
  @IntoMap
  @ClassKey(HomeFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface HomeFragmentSubcomponent extends AndroidInjector<HomeFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeFragment> {}
  }
}
