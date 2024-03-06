package com.base.moviebooking;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.base.moviebooking.databinding.ActiveSearchFragmentBindingImpl;
import com.base.moviebooking.databinding.ActivityMainBindingImpl;
import com.base.moviebooking.databinding.ChangePassFragmentBindingImpl;
import com.base.moviebooking.databinding.ChongheFragmentBindingImpl;
import com.base.moviebooking.databinding.DangkyFragmentBindingImpl;
import com.base.moviebooking.databinding.DangnhapFragmentBindingImpl;
import com.base.moviebooking.databinding.DialogLoadingBindingImpl;
import com.base.moviebooking.databinding.DienanhFragmentBindingImpl;
import com.base.moviebooking.databinding.FilmInfoChildFragmentBindingImpl;
import com.base.moviebooking.databinding.GiaodichFragmentBindingImpl;
import com.base.moviebooking.databinding.HomeFragmentBindingImpl;
import com.base.moviebooking.databinding.LichChieuFragmentBindingImpl;
import com.base.moviebooking.databinding.LichPhimBindingImpl;
import com.base.moviebooking.databinding.MovieByCategoryFragmentBindingImpl;
import com.base.moviebooking.databinding.RapphimFragmentBindingImpl;
import com.base.moviebooking.databinding.RcvDienanhBindingImpl;
import com.base.moviebooking.databinding.RcvGiaodichBindingImpl;
import com.base.moviebooking.databinding.RcvLichchieuBindingImpl;
import com.base.moviebooking.databinding.RcvPhimHomeBindingImpl;
import com.base.moviebooking.databinding.RcvRapBindingImpl;
import com.base.moviebooking.databinding.RcvSeatBindingImpl;
import com.base.moviebooking.databinding.SplashFragmentBindingImpl;
import com.base.moviebooking.databinding.TaikhoanFragmentBindingImpl;
import com.base.moviebooking.databinding.ThanhtoanFragmentBindingImpl;
import com.base.moviebooking.databinding.ThongtinFragmentBindingImpl;
import com.base.moviebooking.databinding.ThongtinThanhtoanFragmentBindingImpl;
import com.base.moviebooking.databinding.UserInfoFragmentBindingImpl;
import com.base.moviebooking.databinding.ViewholderActorsBindingImpl;
import com.base.moviebooking.databinding.ViewholderCategoryBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVESEARCHFRAGMENT = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_CHANGEPASSFRAGMENT = 3;

  private static final int LAYOUT_CHONGHEFRAGMENT = 4;

  private static final int LAYOUT_DANGKYFRAGMENT = 5;

  private static final int LAYOUT_DANGNHAPFRAGMENT = 6;

  private static final int LAYOUT_DIALOGLOADING = 7;

  private static final int LAYOUT_DIENANHFRAGMENT = 8;

  private static final int LAYOUT_FILMINFOCHILDFRAGMENT = 9;

  private static final int LAYOUT_GIAODICHFRAGMENT = 10;

  private static final int LAYOUT_HOMEFRAGMENT = 11;

  private static final int LAYOUT_LICHCHIEUFRAGMENT = 12;

  private static final int LAYOUT_LICHPHIM = 13;

  private static final int LAYOUT_MOVIEBYCATEGORYFRAGMENT = 14;

  private static final int LAYOUT_RAPPHIMFRAGMENT = 15;

  private static final int LAYOUT_RCVDIENANH = 16;

  private static final int LAYOUT_RCVGIAODICH = 17;

  private static final int LAYOUT_RCVLICHCHIEU = 18;

  private static final int LAYOUT_RCVPHIMHOME = 19;

  private static final int LAYOUT_RCVRAP = 20;

  private static final int LAYOUT_RCVSEAT = 21;

  private static final int LAYOUT_SPLASHFRAGMENT = 22;

  private static final int LAYOUT_TAIKHOANFRAGMENT = 23;

  private static final int LAYOUT_THANHTOANFRAGMENT = 24;

  private static final int LAYOUT_THONGTINFRAGMENT = 25;

  private static final int LAYOUT_THONGTINTHANHTOANFRAGMENT = 26;

  private static final int LAYOUT_USERINFOFRAGMENT = 27;

  private static final int LAYOUT_VIEWHOLDERACTORS = 28;

  private static final int LAYOUT_VIEWHOLDERCATEGORY = 29;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(29);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.active_search_fragment, LAYOUT_ACTIVESEARCHFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.change_pass_fragment, LAYOUT_CHANGEPASSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.chonghe_fragment, LAYOUT_CHONGHEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.dangky_fragment, LAYOUT_DANGKYFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.dangnhap_fragment, LAYOUT_DANGNHAPFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.dialog_loading, LAYOUT_DIALOGLOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.dienanh_fragment, LAYOUT_DIENANHFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.film_info_child_fragment, LAYOUT_FILMINFOCHILDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.giaodich_fragment, LAYOUT_GIAODICHFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.home_fragment, LAYOUT_HOMEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.lich_chieu_fragment, LAYOUT_LICHCHIEUFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.lich_phim, LAYOUT_LICHPHIM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.movie_by_category_fragment, LAYOUT_MOVIEBYCATEGORYFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.rapphim_fragment, LAYOUT_RAPPHIMFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.rcv_dienanh, LAYOUT_RCVDIENANH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.rcv_giaodich, LAYOUT_RCVGIAODICH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.rcv_lichchieu, LAYOUT_RCVLICHCHIEU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.rcv_phim_home, LAYOUT_RCVPHIMHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.rcv_rap, LAYOUT_RCVRAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.rcv_seat, LAYOUT_RCVSEAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.splash_fragment, LAYOUT_SPLASHFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.taikhoan_fragment, LAYOUT_TAIKHOANFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.thanhtoan_fragment, LAYOUT_THANHTOANFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.thongtin_fragment, LAYOUT_THONGTINFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.thongtin_thanhtoan_fragment, LAYOUT_THONGTINTHANHTOANFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.user_info_fragment, LAYOUT_USERINFOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.viewholder_actors, LAYOUT_VIEWHOLDERACTORS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.base.moviebooking.R.layout.viewholder_category, LAYOUT_VIEWHOLDERCATEGORY);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVESEARCHFRAGMENT: {
          if ("layout/active_search_fragment_0".equals(tag)) {
            return new ActiveSearchFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for active_search_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CHANGEPASSFRAGMENT: {
          if ("layout/change_pass_fragment_0".equals(tag)) {
            return new ChangePassFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for change_pass_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_CHONGHEFRAGMENT: {
          if ("layout/chonghe_fragment_0".equals(tag)) {
            return new ChongheFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for chonghe_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_DANGKYFRAGMENT: {
          if ("layout/dangky_fragment_0".equals(tag)) {
            return new DangkyFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dangky_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_DANGNHAPFRAGMENT: {
          if ("layout/dangnhap_fragment_0".equals(tag)) {
            return new DangnhapFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dangnhap_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGLOADING: {
          if ("layout/dialog_loading_0".equals(tag)) {
            return new DialogLoadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_loading is invalid. Received: " + tag);
        }
        case  LAYOUT_DIENANHFRAGMENT: {
          if ("layout/dienanh_fragment_0".equals(tag)) {
            return new DienanhFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dienanh_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_FILMINFOCHILDFRAGMENT: {
          if ("layout/film_info_child_fragment_0".equals(tag)) {
            return new FilmInfoChildFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for film_info_child_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_GIAODICHFRAGMENT: {
          if ("layout/giaodich_fragment_0".equals(tag)) {
            return new GiaodichFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for giaodich_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEFRAGMENT: {
          if ("layout/home_fragment_0".equals(tag)) {
            return new HomeFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_LICHCHIEUFRAGMENT: {
          if ("layout/lich_chieu_fragment_0".equals(tag)) {
            return new LichChieuFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for lich_chieu_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_LICHPHIM: {
          if ("layout/lich_phim_0".equals(tag)) {
            return new LichPhimBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for lich_phim is invalid. Received: " + tag);
        }
        case  LAYOUT_MOVIEBYCATEGORYFRAGMENT: {
          if ("layout/movie_by_category_fragment_0".equals(tag)) {
            return new MovieByCategoryFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for movie_by_category_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_RAPPHIMFRAGMENT: {
          if ("layout/rapphim_fragment_0".equals(tag)) {
            return new RapphimFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rapphim_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_RCVDIENANH: {
          if ("layout/rcv_dienanh_0".equals(tag)) {
            return new RcvDienanhBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rcv_dienanh is invalid. Received: " + tag);
        }
        case  LAYOUT_RCVGIAODICH: {
          if ("layout/rcv_giaodich_0".equals(tag)) {
            return new RcvGiaodichBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rcv_giaodich is invalid. Received: " + tag);
        }
        case  LAYOUT_RCVLICHCHIEU: {
          if ("layout/rcv_lichchieu_0".equals(tag)) {
            return new RcvLichchieuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rcv_lichchieu is invalid. Received: " + tag);
        }
        case  LAYOUT_RCVPHIMHOME: {
          if ("layout/rcv_phim_home_0".equals(tag)) {
            return new RcvPhimHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rcv_phim_home is invalid. Received: " + tag);
        }
        case  LAYOUT_RCVRAP: {
          if ("layout/rcv_rap_0".equals(tag)) {
            return new RcvRapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rcv_rap is invalid. Received: " + tag);
        }
        case  LAYOUT_RCVSEAT: {
          if ("layout/rcv_seat_0".equals(tag)) {
            return new RcvSeatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rcv_seat is invalid. Received: " + tag);
        }
        case  LAYOUT_SPLASHFRAGMENT: {
          if ("layout/splash_fragment_0".equals(tag)) {
            return new SplashFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for splash_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_TAIKHOANFRAGMENT: {
          if ("layout/taikhoan_fragment_0".equals(tag)) {
            return new TaikhoanFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for taikhoan_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_THANHTOANFRAGMENT: {
          if ("layout/thanhtoan_fragment_0".equals(tag)) {
            return new ThanhtoanFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for thanhtoan_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_THONGTINFRAGMENT: {
          if ("layout/thongtin_fragment_0".equals(tag)) {
            return new ThongtinFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for thongtin_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_THONGTINTHANHTOANFRAGMENT: {
          if ("layout/thongtin_thanhtoan_fragment_0".equals(tag)) {
            return new ThongtinThanhtoanFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for thongtin_thanhtoan_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_USERINFOFRAGMENT: {
          if ("layout/user_info_fragment_0".equals(tag)) {
            return new UserInfoFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for user_info_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWHOLDERACTORS: {
          if ("layout/viewholder_actors_0".equals(tag)) {
            return new ViewholderActorsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for viewholder_actors is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWHOLDERCATEGORY: {
          if ("layout/viewholder_category_0".equals(tag)) {
            return new ViewholderCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for viewholder_category is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "dienanh");
      sKeys.put(2, "giaodich");
      sKeys.put(3, "lichchieu");
      sKeys.put(4, "movie");
      sKeys.put(5, "seat");
      sKeys.put(6, "theater");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(29);

    static {
      sKeys.put("layout/active_search_fragment_0", com.base.moviebooking.R.layout.active_search_fragment);
      sKeys.put("layout/activity_main_0", com.base.moviebooking.R.layout.activity_main);
      sKeys.put("layout/change_pass_fragment_0", com.base.moviebooking.R.layout.change_pass_fragment);
      sKeys.put("layout/chonghe_fragment_0", com.base.moviebooking.R.layout.chonghe_fragment);
      sKeys.put("layout/dangky_fragment_0", com.base.moviebooking.R.layout.dangky_fragment);
      sKeys.put("layout/dangnhap_fragment_0", com.base.moviebooking.R.layout.dangnhap_fragment);
      sKeys.put("layout/dialog_loading_0", com.base.moviebooking.R.layout.dialog_loading);
      sKeys.put("layout/dienanh_fragment_0", com.base.moviebooking.R.layout.dienanh_fragment);
      sKeys.put("layout/film_info_child_fragment_0", com.base.moviebooking.R.layout.film_info_child_fragment);
      sKeys.put("layout/giaodich_fragment_0", com.base.moviebooking.R.layout.giaodich_fragment);
      sKeys.put("layout/home_fragment_0", com.base.moviebooking.R.layout.home_fragment);
      sKeys.put("layout/lich_chieu_fragment_0", com.base.moviebooking.R.layout.lich_chieu_fragment);
      sKeys.put("layout/lich_phim_0", com.base.moviebooking.R.layout.lich_phim);
      sKeys.put("layout/movie_by_category_fragment_0", com.base.moviebooking.R.layout.movie_by_category_fragment);
      sKeys.put("layout/rapphim_fragment_0", com.base.moviebooking.R.layout.rapphim_fragment);
      sKeys.put("layout/rcv_dienanh_0", com.base.moviebooking.R.layout.rcv_dienanh);
      sKeys.put("layout/rcv_giaodich_0", com.base.moviebooking.R.layout.rcv_giaodich);
      sKeys.put("layout/rcv_lichchieu_0", com.base.moviebooking.R.layout.rcv_lichchieu);
      sKeys.put("layout/rcv_phim_home_0", com.base.moviebooking.R.layout.rcv_phim_home);
      sKeys.put("layout/rcv_rap_0", com.base.moviebooking.R.layout.rcv_rap);
      sKeys.put("layout/rcv_seat_0", com.base.moviebooking.R.layout.rcv_seat);
      sKeys.put("layout/splash_fragment_0", com.base.moviebooking.R.layout.splash_fragment);
      sKeys.put("layout/taikhoan_fragment_0", com.base.moviebooking.R.layout.taikhoan_fragment);
      sKeys.put("layout/thanhtoan_fragment_0", com.base.moviebooking.R.layout.thanhtoan_fragment);
      sKeys.put("layout/thongtin_fragment_0", com.base.moviebooking.R.layout.thongtin_fragment);
      sKeys.put("layout/thongtin_thanhtoan_fragment_0", com.base.moviebooking.R.layout.thongtin_thanhtoan_fragment);
      sKeys.put("layout/user_info_fragment_0", com.base.moviebooking.R.layout.user_info_fragment);
      sKeys.put("layout/viewholder_actors_0", com.base.moviebooking.R.layout.viewholder_actors);
      sKeys.put("layout/viewholder_category_0", com.base.moviebooking.R.layout.viewholder_category);
    }
  }
}
