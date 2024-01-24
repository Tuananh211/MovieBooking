package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.giaodich.GiaoDichFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBindingModule_BindGiaoDichFragment.GiaoDichFragmentSubcomponent.class
)
public abstract class FragmentBindingModule_BindGiaoDichFragment {
  private FragmentBindingModule_BindGiaoDichFragment() {}

  @Binds
  @IntoMap
  @ClassKey(GiaoDichFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      GiaoDichFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface GiaoDichFragmentSubcomponent extends AndroidInjector<GiaoDichFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<GiaoDichFragment> {}
  }
}
