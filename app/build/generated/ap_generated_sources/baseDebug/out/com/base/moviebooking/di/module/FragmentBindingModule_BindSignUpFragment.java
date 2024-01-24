package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.sign_up.SignUpFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBindingModule_BindSignUpFragment.SignUpFragmentSubcomponent.class)
public abstract class FragmentBindingModule_BindSignUpFragment {
  private FragmentBindingModule_BindSignUpFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SignUpFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SignUpFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SignUpFragmentSubcomponent extends AndroidInjector<SignUpFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SignUpFragment> {}
  }
}
