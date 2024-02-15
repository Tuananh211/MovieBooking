package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.movie_by_categoryId.MovieByCategoryIdFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindMovieByCategoryIdFragment.MovieByCategoryIdFragmentSubcomponent
          .class
)
public abstract class FragmentBindingModule_BindMovieByCategoryIdFragment {
  private FragmentBindingModule_BindMovieByCategoryIdFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MovieByCategoryIdFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MovieByCategoryIdFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface MovieByCategoryIdFragmentSubcomponent
      extends AndroidInjector<MovieByCategoryIdFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MovieByCategoryIdFragment> {}
  }
}
