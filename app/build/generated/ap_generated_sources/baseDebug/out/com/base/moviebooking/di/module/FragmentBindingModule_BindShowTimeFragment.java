package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.show_time.ShowTimeFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBindingModule_BindShowTimeFragment.ShowTimeFragmentSubcomponent.class
)
public abstract class FragmentBindingModule_BindShowTimeFragment {
  private FragmentBindingModule_BindShowTimeFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ShowTimeFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ShowTimeFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ShowTimeFragmentSubcomponent extends AndroidInjector<ShowTimeFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ShowTimeFragment> {}
  }
}
