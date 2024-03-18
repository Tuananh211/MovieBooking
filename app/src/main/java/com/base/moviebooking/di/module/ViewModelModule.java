package com.base.moviebooking.di.module;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.base.moviebooking.di.ViewModelFactory;
import com.base.moviebooking.ui.account.AccountViewModel;
import com.base.moviebooking.ui.change_pass.ChangePassViewModel;
import com.base.moviebooking.ui.chonghe.ChonGheViewModel;
import com.base.moviebooking.ui.film_info.FilmInfoViewModel;
import com.base.moviebooking.ui.giaodich.GiaoDichViewModel;
import com.base.moviebooking.ui.home.HomeViewModel;
import com.base.moviebooking.ui.main.MainViewModel;
import com.base.moviebooking.ui.movie_by_categoryId.MovieByCategoryIdModel;
import com.base.moviebooking.ui.schedule.ScheduleCinemaModel;
import com.base.moviebooking.ui.schedule_child.ScheduleChildModel;
import com.base.moviebooking.ui.schedule_child.schedule_child1.ScheduleChildModel1;
import com.base.moviebooking.ui.schedule_child.schedule_child2.ScheduleChildModel2;
import com.base.moviebooking.ui.schedule_child.schedule_child3.ScheduleChildModel3;
import com.base.moviebooking.ui.schedule_child.schedule_child4.ScheduleChildModel4;
import com.base.moviebooking.ui.schedule_child.schedule_child5.ScheduleChildModel5;
import com.base.moviebooking.ui.schedule_child.schedule_child6.ScheduleChildModel6;
import com.base.moviebooking.ui.schedule_child.schedule_child7.ScheduleChildModel7;

import com.base.moviebooking.ui.search_film.SearchFilmModel;
import com.base.moviebooking.ui.show_time.ShowTimeViewModel;
import com.base.moviebooking.ui.show_time_child.ShowTimeChildViewModel;
import com.base.moviebooking.ui.sign_in.SignInViewModel;
import com.base.moviebooking.ui.sign_up.SignUpViewModel;
import com.base.moviebooking.ui.splash.SplashViewModel;
import com.base.moviebooking.ui.thanhtoan.ThanhToanViewModel;
import com.base.moviebooking.ui.theater.TheaterViewModel;
import com.base.moviebooking.ui.detail_movie.DetailMovieViewModel;
import com.base.moviebooking.ui.thongtin_Thanhtoan.ThongTinThanhToanViewModel;
import com.base.moviebooking.ui.user_info.UserInfoViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    //bind ViewModel
    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel.class)
    abstract ViewModel bindSplashViewModel(SplashViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(MovieByCategoryIdModel.class)
    abstract ViewModel bindMovieByCategoryIdFragment(MovieByCategoryIdModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(SearchFilmModel.class)
    abstract ViewModel bindSearchFilmFragment(SearchFilmModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    abstract ViewModel bindHomeViewModel(HomeViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(AccountViewModel.class)
    abstract ViewModel bindAccountViewModel(AccountViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(FilmInfoViewModel.class)
    abstract ViewModel bindFilmInfoViewModel(FilmInfoViewModel viewModel);


    @Binds
    @IntoMap
    @ViewModelKey(TheaterViewModel.class)
    abstract ViewModel bindTheaterViewModel(TheaterViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(SignUpViewModel.class)
    abstract ViewModel bindSignUpViewModel(SignUpViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(SignInViewModel.class)
    abstract ViewModel bindSignInViewModel(SignInViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ChonGheViewModel.class)
    abstract ViewModel bindChonGheViewModel(ChonGheViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ShowTimeViewModel.class)
    abstract ViewModel bindShowTimeViewModel(ShowTimeViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ShowTimeChildViewModel.class)
    abstract ViewModel bindShowTimeChildViewModel(ShowTimeChildViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ThanhToanViewModel.class)
    abstract ViewModel bindThanhToanViewModel(ThanhToanViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ThongTinThanhToanViewModel.class)
    abstract ViewModel bindThongTinThanhToanViewModel(ThongTinThanhToanViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(GiaoDichViewModel.class)
    abstract ViewModel bindGiaoDichViewModel(GiaoDichViewModel viewModel);


    @Binds
    @IntoMap
    @ViewModelKey(UserInfoViewModel.class)
    abstract ViewModel bindUserInfoViewModel(UserInfoViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(DetailMovieViewModel.class)
    abstract ViewModel bindDetailMovieViewModel(DetailMovieViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ChangePassViewModel.class)
    abstract ViewModel bindChangePassViewModel(ChangePassViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ScheduleCinemaModel.class)
    abstract ViewModel bindScheduleCineMaModel(ScheduleCinemaModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ScheduleChildModel1.class)
    abstract ViewModel bindScheduleChildModel1(ScheduleChildModel1 viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(ScheduleChildModel2.class)
    abstract ViewModel bindScheduleChildModel2(ScheduleChildModel2 viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(ScheduleChildModel3.class)
    abstract ViewModel bindScheduleChildModel3(ScheduleChildModel3 viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(ScheduleChildModel4.class)
    abstract ViewModel bindScheduleChildModel4(ScheduleChildModel4 viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(ScheduleChildModel5.class)
    abstract ViewModel bindScheduleChildModel5(ScheduleChildModel5 viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(ScheduleChildModel6.class)
    abstract ViewModel bindScheduleChildModel6(ScheduleChildModel6 viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(ScheduleChildModel7.class)
    abstract ViewModel bindScheduleChildModel7(ScheduleChildModel7 viewModel);



    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    abstract ViewModel bindMainViewModel(MainViewModel viewModel);





    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}
