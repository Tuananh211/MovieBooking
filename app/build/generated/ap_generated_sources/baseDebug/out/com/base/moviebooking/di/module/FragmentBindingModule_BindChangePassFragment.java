package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.change_pass.ChangePassFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBindingModule_BindChangePassFragment.ChangePassFragmentSubcomponent.class
)
public abstract class FragmentBindingModule_BindChangePassFragment {
  private FragmentBindingModule_BindChangePassFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ChangePassFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ChangePassFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ChangePassFragmentSubcomponent extends AndroidInjector<ChangePassFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ChangePassFragment> {}
  }
}
