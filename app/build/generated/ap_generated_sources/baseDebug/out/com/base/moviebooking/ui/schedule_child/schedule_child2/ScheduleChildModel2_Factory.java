// Generated by Dagger (https://google.github.io/dagger).
package com.base.moviebooking.ui.schedule_child.schedule_child2;

import com.base.moviebooking.network.repository.Repository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ScheduleChildModel2_Factory implements Factory<ScheduleChildModel2> {
  private final Provider<Repository> repositoryProvider;

  public ScheduleChildModel2_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ScheduleChildModel2 get() {
    return new ScheduleChildModel2(repositoryProvider.get());
  }

  public static ScheduleChildModel2_Factory create(Provider<Repository> repositoryProvider) {
    return new ScheduleChildModel2_Factory(repositoryProvider);
  }

  public static ScheduleChildModel2 newScheduleChildModel2(Repository repository) {
    return new ScheduleChildModel2(repository);
  }
}
