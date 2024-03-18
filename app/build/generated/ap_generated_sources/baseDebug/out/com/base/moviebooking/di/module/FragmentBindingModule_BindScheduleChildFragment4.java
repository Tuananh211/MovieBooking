package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.schedule_child.schedule_child4.ScheduleChildFragment4;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindScheduleChildFragment4.ScheduleChildFragment4Subcomponent.class
)
public abstract class FragmentBindingModule_BindScheduleChildFragment4 {
  private FragmentBindingModule_BindScheduleChildFragment4() {}

  @Binds
  @IntoMap
  @ClassKey(ScheduleChildFragment4.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ScheduleChildFragment4Subcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleChildFragment4Subcomponent
      extends AndroidInjector<ScheduleChildFragment4> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleChildFragment4> {}
  }
}
