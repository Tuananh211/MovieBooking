package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.schedule_child.schedule_child7.ScheduleChildFragment7;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindScheduleChildFragment7.ScheduleChildFragment7Subcomponent.class
)
public abstract class FragmentBindingModule_BindScheduleChildFragment7 {
  private FragmentBindingModule_BindScheduleChildFragment7() {}

  @Binds
  @IntoMap
  @ClassKey(ScheduleChildFragment7.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ScheduleChildFragment7Subcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleChildFragment7Subcomponent
      extends AndroidInjector<ScheduleChildFragment7> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleChildFragment7> {}
  }
}
