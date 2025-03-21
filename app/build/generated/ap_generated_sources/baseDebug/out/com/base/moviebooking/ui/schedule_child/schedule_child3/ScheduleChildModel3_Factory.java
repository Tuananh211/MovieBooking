// Generated by Dagger (https://google.github.io/dagger).
package com.base.moviebooking.ui.schedule_child.schedule_child3;

import com.base.moviebooking.network.repository.Repository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ScheduleChildModel3_Factory implements Factory<ScheduleChildModel3> {
  private final Provider<Repository> repositoryProvider;

  public ScheduleChildModel3_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ScheduleChildModel3 get() {
    return new ScheduleChildModel3(repositoryProvider.get());
  }

  public static ScheduleChildModel3_Factory create(Provider<Repository> repositoryProvider) {
    return new ScheduleChildModel3_Factory(repositoryProvider);
  }

  public static ScheduleChildModel3 newScheduleChildModel3(Repository repository) {
    return new ScheduleChildModel3(repository);
  }
}
