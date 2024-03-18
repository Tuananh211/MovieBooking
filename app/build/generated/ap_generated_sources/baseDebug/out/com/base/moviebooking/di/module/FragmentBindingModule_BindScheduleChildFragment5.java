package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.schedule_child.schedule_child5.ScheduleChildFragment5;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindScheduleChildFragment5.ScheduleChildFragment5Subcomponent.class
)
public abstract class FragmentBindingModule_BindScheduleChildFragment5 {
  private FragmentBindingModule_BindScheduleChildFragment5() {}

  @Binds
  @IntoMap
  @ClassKey(ScheduleChildFragment5.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ScheduleChildFragment5Subcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleChildFragment5Subcomponent
      extends AndroidInjector<ScheduleChildFragment5> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleChildFragment5> {}
  }
}
