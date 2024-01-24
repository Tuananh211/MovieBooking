package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.detail_movie.DetailMovieFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindDetailMovieFragment.DetailMovieFragmentSubcomponent.class
)
public abstract class FragmentBindingModule_BindDetailMovieFragment {
  private FragmentBindingModule_BindDetailMovieFragment() {}

  @Binds
  @IntoMap
  @ClassKey(DetailMovieFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DetailMovieFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface DetailMovieFragmentSubcomponent extends AndroidInjector<DetailMovieFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailMovieFragment> {}
  }
}
