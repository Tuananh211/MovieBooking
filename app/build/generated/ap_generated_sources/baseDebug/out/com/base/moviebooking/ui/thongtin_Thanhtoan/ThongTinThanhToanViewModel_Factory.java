// Generated by Dagger (https://google.github.io/dagger).
package com.base.moviebooking.ui.thongtin_Thanhtoan;

import com.base.moviebooking.network.repository.Repository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ThongTinThanhToanViewModel_Factory
    implements Factory<ThongTinThanhToanViewModel> {
  private final Provider<Repository> repositoryProvider;

  public ThongTinThanhToanViewModel_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ThongTinThanhToanViewModel get() {
    return new ThongTinThanhToanViewModel(repositoryProvider.get());
  }

  public static ThongTinThanhToanViewModel_Factory create(Provider<Repository> repositoryProvider) {
    return new ThongTinThanhToanViewModel_Factory(repositoryProvider);
  }

  public static ThongTinThanhToanViewModel newThongTinThanhToanViewModel(Repository repository) {
    return new ThongTinThanhToanViewModel(repository);
  }
}
