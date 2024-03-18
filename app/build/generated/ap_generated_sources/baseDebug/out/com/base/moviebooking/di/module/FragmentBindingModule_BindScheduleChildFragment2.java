package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.schedule_child.schedule_child2.ScheduleChildFragment2;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindScheduleChildFragment2.ScheduleChildFragment2Subcomponent.class
)
public abstract class FragmentBindingModule_BindScheduleChildFragment2 {
  private FragmentBindingModule_BindScheduleChildFragment2() {}

  @Binds
  @IntoMap
  @ClassKey(ScheduleChildFragment2.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ScheduleChildFragment2Subcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleChildFragment2Subcomponent
      extends AndroidInjector<ScheduleChildFragment2> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleChildFragment2> {}
  }
}
