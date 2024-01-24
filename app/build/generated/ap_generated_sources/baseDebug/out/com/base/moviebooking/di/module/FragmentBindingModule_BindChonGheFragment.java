package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.chonghe.ChonGheFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBindingModule_BindChonGheFragment.ChonGheFragmentSubcomponent.class)
public abstract class FragmentBindingModule_BindChonGheFragment {
  private FragmentBindingModule_BindChonGheFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ChonGheFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ChonGheFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ChonGheFragmentSubcomponent extends AndroidInjector<ChonGheFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ChonGheFragment> {}
  }
}
