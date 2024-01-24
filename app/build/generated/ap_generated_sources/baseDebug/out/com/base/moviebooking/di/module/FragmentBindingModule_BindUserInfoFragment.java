package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.user_info.UserInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBindingModule_BindUserInfoFragment.UserInfoFragmentSubcomponent.class
)
public abstract class FragmentBindingModule_BindUserInfoFragment {
  private FragmentBindingModule_BindUserInfoFragment() {}

  @Binds
  @IntoMap
  @ClassKey(UserInfoFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UserInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface UserInfoFragmentSubcomponent extends AndroidInjector<UserInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<UserInfoFragment> {}
  }
}
