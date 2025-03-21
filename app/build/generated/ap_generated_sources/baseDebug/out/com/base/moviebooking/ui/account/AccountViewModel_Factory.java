// Generated by Dagger (https://google.github.io/dagger).
package com.base.moviebooking.ui.account;

import com.base.moviebooking.network.repository.Repository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AccountViewModel_Factory implements Factory<AccountViewModel> {
  private final Provider<Repository> repositoryProvider;

  public AccountViewModel_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AccountViewModel get() {
    return new AccountViewModel(repositoryProvider.get());
  }

  public static AccountViewModel_Factory create(Provider<Repository> repositoryProvider) {
    return new AccountViewModel_Factory(repositoryProvider);
  }

  public static AccountViewModel newAccountViewModel(Repository repository) {
    return new AccountViewModel(repository);
  }
}
