package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.schedule_child.schedule_child3.ScheduleChildFragment3;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindScheduleChildFragment3.ScheduleChildFragment3Subcomponent.class
)
public abstract class FragmentBindingModule_BindScheduleChildFragment3 {
  private FragmentBindingModule_BindScheduleChildFragment3() {}

  @Binds
  @IntoMap
  @ClassKey(ScheduleChildFragment3.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ScheduleChildFragment3Subcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleChildFragment3Subcomponent
      extends AndroidInjector<ScheduleChildFragment3> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleChildFragment3> {}
  }
}
