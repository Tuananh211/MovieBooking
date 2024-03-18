package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.schedule_child.schedule_child6.ScheduleChildFragment6;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindScheduleChildFragment6.ScheduleChildFragment6Subcomponent.class
)
public abstract class FragmentBindingModule_BindScheduleChildFragment6 {
  private FragmentBindingModule_BindScheduleChildFragment6() {}

  @Binds
  @IntoMap
  @ClassKey(ScheduleChildFragment6.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ScheduleChildFragment6Subcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleChildFragment6Subcomponent
      extends AndroidInjector<ScheduleChildFragment6> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleChildFragment6> {}
  }
}
