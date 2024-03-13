package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.schedule_child.ScheduleChildFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindScheduleChildFragment.ScheduleChildFragmentSubcomponent.class
)
public abstract class FragmentBindingModule_BindScheduleChildFragment {
  private FragmentBindingModule_BindScheduleChildFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ScheduleChildFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ScheduleChildFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleChildFragmentSubcomponent
      extends AndroidInjector<ScheduleChildFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleChildFragment> {}
  }
}
