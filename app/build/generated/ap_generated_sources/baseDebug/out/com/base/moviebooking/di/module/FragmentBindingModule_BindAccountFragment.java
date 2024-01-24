package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.account.AccountFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBindingModule_BindAccountFragment.AccountFragmentSubcomponent.class)
public abstract class FragmentBindingModule_BindAccountFragment {
  private FragmentBindingModule_BindAccountFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AccountFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AccountFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface AccountFragmentSubcomponent extends AndroidInjector<AccountFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AccountFragment> {}
  }
}
