package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.film_info.FilmInfoChildFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindFilmInfoChildFragment.FilmInfoChildFragmentSubcomponent.class
)
public abstract class FragmentBindingModule_BindFilmInfoChildFragment {
  private FragmentBindingModule_BindFilmInfoChildFragment() {}

  @Binds
  @IntoMap
  @ClassKey(FilmInfoChildFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FilmInfoChildFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface FilmInfoChildFragmentSubcomponent
      extends AndroidInjector<FilmInfoChildFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FilmInfoChildFragment> {}
  }
}
