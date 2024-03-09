package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.schedule.ScheduleCinemaFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindScheduleFragment.ScheduleCinemaFragmentSubcomponent.class
)
public abstract class FragmentBindingModule_BindScheduleFragment {
  private FragmentBindingModule_BindScheduleFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ScheduleCinemaFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ScheduleCinemaFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleCinemaFragmentSubcomponent
      extends AndroidInjector<ScheduleCinemaFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleCinemaFragment> {}
  }
}
