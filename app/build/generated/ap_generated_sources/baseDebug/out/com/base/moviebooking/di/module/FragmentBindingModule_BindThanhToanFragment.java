package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.thanhtoan.ThanhToanFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBindingModule_BindThanhToanFragment.ThanhToanFragmentSubcomponent.class
)
public abstract class FragmentBindingModule_BindThanhToanFragment {
  private FragmentBindingModule_BindThanhToanFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ThanhToanFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ThanhToanFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ThanhToanFragmentSubcomponent extends AndroidInjector<ThanhToanFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ThanhToanFragment> {}
  }
}
