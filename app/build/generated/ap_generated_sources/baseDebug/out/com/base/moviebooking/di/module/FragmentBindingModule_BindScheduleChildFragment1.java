package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.schedule_child.schedule_child1.ScheduleChildFragment1;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindScheduleChildFragment1.ScheduleChildFragment1Subcomponent.class
)
public abstract class FragmentBindingModule_BindScheduleChildFragment1 {
  private FragmentBindingModule_BindScheduleChildFragment1() {}

  @Binds
  @IntoMap
  @ClassKey(ScheduleChildFragment1.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ScheduleChildFragment1Subcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleChildFragment1Subcomponent
      extends AndroidInjector<ScheduleChildFragment1> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleChildFragment1> {}
  }
}
