package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.sign_in.SignInFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBindingModule_BindSignInFragment.SignInFragmentSubcomponent.class)
public abstract class FragmentBindingModule_BindSignInFragment {
  private FragmentBindingModule_BindSignInFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SignInFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SignInFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SignInFragmentSubcomponent extends AndroidInjector<SignInFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SignInFragment> {}
  }
}
