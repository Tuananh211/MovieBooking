// Generated by Dagger (https://google.github.io/dagger).
package com.base.moviebooking.ui.main;

import dagger.internal.Factory;

public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private static final MainViewModel_Factory INSTANCE = new MainViewModel_Factory();

  @Override
  public MainViewModel get() {
    return new MainViewModel();
  }

  public static MainViewModel_Factory create() {
    return INSTANCE;
  }

  public static MainViewModel newMainViewModel() {
    return new MainViewModel();
  }
}
