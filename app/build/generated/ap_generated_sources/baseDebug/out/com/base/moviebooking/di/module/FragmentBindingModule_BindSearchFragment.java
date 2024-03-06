package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.search_film.SearchFilmFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBindingModule_BindSearchFragment.SearchFilmFragmentSubcomponent.class
)
public abstract class FragmentBindingModule_BindSearchFragment {
  private FragmentBindingModule_BindSearchFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SearchFilmFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SearchFilmFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SearchFilmFragmentSubcomponent extends AndroidInjector<SearchFilmFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SearchFilmFragment> {}
  }
}
