// Generated by Dagger (https://google.github.io/dagger).
package com.base.moviebooking.ui.movie_by_categoryId;

import com.base.moviebooking.network.repository.Repository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MovieByCategoryIdModel_Factory implements Factory<MovieByCategoryIdModel> {
  private final Provider<Repository> repositoryProvider;

  public MovieByCategoryIdModel_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MovieByCategoryIdModel get() {
    return new MovieByCategoryIdModel(repositoryProvider.get());
  }

  public static MovieByCategoryIdModel_Factory create(Provider<Repository> repositoryProvider) {
    return new MovieByCategoryIdModel_Factory(repositoryProvider);
  }

  public static MovieByCategoryIdModel newMovieByCategoryIdModel(Repository repository) {
    return new MovieByCategoryIdModel(repository);
  }
}
