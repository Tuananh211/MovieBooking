// Generated by Dagger (https://google.github.io/dagger).
package com.base.moviebooking.ui.splash;

import dagger.internal.Factory;

public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private static final SplashViewModel_Factory INSTANCE = new SplashViewModel_Factory();

  @Override
  public SplashViewModel get() {
    return new SplashViewModel();
  }

  public static SplashViewModel_Factory create() {
    return INSTANCE;
  }

  public static SplashViewModel newSplashViewModel() {
    return new SplashViewModel();
  }
}
