package com.base.moviebooking.di.module;

import com.base.moviebooking.ui.thongtin_Thanhtoan.ThongTinThanhToanFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBindingModule_BindThongTinThanhToanFragment.ThongTinThanhToanFragmentSubcomponent
          .class
)
public abstract class FragmentBindingModule_BindThongTinThanhToanFragment {
  private FragmentBindingModule_BindThongTinThanhToanFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ThongTinThanhToanFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ThongTinThanhToanFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ThongTinThanhToanFragmentSubcomponent
      extends AndroidInjector<ThongTinThanhToanFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ThongTinThanhToanFragment> {}
  }
}
