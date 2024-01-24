package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.film_info.FilmInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBindingModule_BindFilmInfoFragment.FilmInfoFragmentSubcomponent.class
)
public abstract class FragmentBindingModule_BindFilmInfoFragment {
  private FragmentBindingModule_BindFilmInfoFragment() {}

  @Binds
  @IntoMap
  @ClassKey(FilmInfoFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FilmInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface FilmInfoFragmentSubcomponent extends AndroidInjector<FilmInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FilmInfoFragment> {}
  }
}
