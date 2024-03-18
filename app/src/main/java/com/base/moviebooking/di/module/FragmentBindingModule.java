package com.base.moviebooking.di.module;


import com.base.moviebooking.databinding.ActiveSearchFragmentBinding;
import com.base.moviebooking.ui.change_pass.ChangePassFragment;
import com.base.moviebooking.ui.chonghe.ChonGheFragment;
import com.base.moviebooking.ui.film_info.FilmInfoChildFragment;
import com.base.moviebooking.ui.giaodich.GiaoDichFragment;
import com.base.moviebooking.ui.movie_by_categoryId.MovieByCategoryIdFragment;
import com.base.moviebooking.ui.schedule.ScheduleCinemaFragment;
import com.base.moviebooking.ui.schedule_child.ScheduleChildFragment;
import com.base.moviebooking.ui.schedule_child.schedule_child1.ScheduleChildFragment1;
import com.base.moviebooking.ui.schedule_child.schedule_child2.ScheduleChildFragment2;
import com.base.moviebooking.ui.schedule_child.schedule_child3.ScheduleChildFragment3;
import com.base.moviebooking.ui.schedule_child.schedule_child4.ScheduleChildFragment4;
import com.base.moviebooking.ui.schedule_child.schedule_child5.ScheduleChildFragment5;
import com.base.moviebooking.ui.schedule_child.schedule_child6.ScheduleChildFragment6;
import com.base.moviebooking.ui.schedule_child.schedule_child7.ScheduleChildFragment7;

import com.base.moviebooking.ui.search_film.SearchFilmFragment;
import com.base.moviebooking.ui.show_time.ShowTimeFragment;
import com.base.moviebooking.ui.account.AccountFragment;
import com.base.moviebooking.ui.home.HomeFragment;
import com.base.moviebooking.ui.show_time_child.ShowTimeChildFragment;
import com.base.moviebooking.ui.sign_in.SignInFragment;
import com.base.moviebooking.ui.sign_up.SignUpFragment;
import com.base.moviebooking.ui.splash.SplashFragment;
import com.base.moviebooking.ui.thanhtoan.ThanhToanFragment;
import com.base.moviebooking.ui.theater.TheaterFragment;
import com.base.moviebooking.ui.film_info.FilmInfoFragment;
import com.base.moviebooking.ui.detail_movie.DetailMovieFragment;
import com.base.moviebooking.ui.thongtin_Thanhtoan.ThongTinThanhToanFragment;
import com.base.moviebooking.ui.user_info.UserInfoFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBindingModule {

    //TODO bind fragment
    @ContributesAndroidInjector
    abstract SplashFragment bindSplashFragment();

    @ContributesAndroidInjector
    abstract HomeFragment bindHomeFragment();

    @ContributesAndroidInjector
    abstract AccountFragment bindAccountFragment();

    @ContributesAndroidInjector
    abstract TheaterFragment bindTheaterFragment();

    @ContributesAndroidInjector
    abstract FilmInfoFragment bindFilmInfoFragment();

    @ContributesAndroidInjector
    abstract FilmInfoChildFragment bindFilmInfoChildFragment();

    @ContributesAndroidInjector
    abstract SignUpFragment bindSignUpFragment();

    @ContributesAndroidInjector
    abstract SignInFragment bindSignInFragment();

    @ContributesAndroidInjector
    abstract ChonGheFragment bindChonGheFragment();

    @ContributesAndroidInjector
    abstract ShowTimeFragment bindShowTimeFragment();

    @ContributesAndroidInjector
    abstract ShowTimeChildFragment bindShowTimeChildFragment();

    @ContributesAndroidInjector
    abstract DetailMovieFragment bindDetailMovieFragment();

    @ContributesAndroidInjector
    abstract ThanhToanFragment bindThanhToanFragment();

    @ContributesAndroidInjector
    abstract ChangePassFragment bindChangePassFragment();

    @ContributesAndroidInjector
    abstract ThongTinThanhToanFragment bindThongTinThanhToanFragment();

    @ContributesAndroidInjector
    abstract GiaoDichFragment bindGiaoDichFragment();

    @ContributesAndroidInjector
    abstract UserInfoFragment bindUserInfoFragment();

    @ContributesAndroidInjector
    abstract MovieByCategoryIdFragment bindMovieByCategoryIdFragment();

    @ContributesAndroidInjector
    abstract SearchFilmFragment bindSearchFragment();

    @ContributesAndroidInjector
    abstract ScheduleCinemaFragment bindScheduleFragment();

    @ContributesAndroidInjector
    abstract ScheduleChildFragment1 bindScheduleChildFragment1();
    @ContributesAndroidInjector
    abstract ScheduleChildFragment2 bindScheduleChildFragment2();
    @ContributesAndroidInjector
    abstract ScheduleChildFragment3 bindScheduleChildFragment3();
    @ContributesAndroidInjector
    abstract ScheduleChildFragment4 bindScheduleChildFragment4();
    @ContributesAndroidInjector
    abstract ScheduleChildFragment5 bindScheduleChildFragment5();
    @ContributesAndroidInjector
    abstract ScheduleChildFragment6 bindScheduleChildFragment6();
    @ContributesAndroidInjector
    abstract ScheduleChildFragment7 bindScheduleChildFragment7();



}
