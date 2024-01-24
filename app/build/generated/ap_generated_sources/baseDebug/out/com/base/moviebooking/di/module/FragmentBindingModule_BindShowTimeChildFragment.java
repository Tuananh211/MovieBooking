package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.show_time_child.ShowTimeChildFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindShowTimeChildFragment.ShowTimeChildFragmentSubcomponent.class
)
public abstract class FragmentBindingModule_BindShowTimeChildFragment {
  private FragmentBindingModule_BindShowTimeChildFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ShowTimeChildFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ShowTimeChildFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ShowTimeChildFragmentSubcomponent
      extends AndroidInjector<ShowTimeChildFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ShowTimeChildFragment> {}
  }
}
