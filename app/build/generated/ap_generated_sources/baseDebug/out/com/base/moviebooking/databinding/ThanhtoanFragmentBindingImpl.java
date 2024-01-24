package com.base.moviebooking.databinding;
import com.base.moviebooking.R;
import com.base.moviebooking.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ThanhtoanFragmentBindingImpl extends ThanhtoanFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.back_tt, 1);
        sViewsWithIds.put(R.id.img_phim, 2);
        sViewsWithIds.put(R.id.tvt_tenphim, 3);
        sViewsWithIds.put(R.id.tvt_rap, 4);
        sViewsWithIds.put(R.id.tvt_time, 5);
        sViewsWithIds.put(R.id.ln_gheThuong, 6);
        sViewsWithIds.put(R.id.tvt_gheThuong, 7);
        sViewsWithIds.put(R.id.tvt_giagheThuong, 8);
        sViewsWithIds.put(R.id.ln_gheVip, 9);
        sViewsWithIds.put(R.id.tvt_gheVip, 10);
        sViewsWithIds.put(R.id.tvt_giagheVip, 11);
        sViewsWithIds.put(R.id.ln_bong, 12);
        sViewsWithIds.put(R.id.tvt_bong, 13);
        sViewsWithIds.put(R.id.tvt_giabong, 14);
        sViewsWithIds.put(R.id.ln_nuoc, 15);
        sViewsWithIds.put(R.id.tvt_nuoc, 16);
        sViewsWithIds.put(R.id.tvt_giaNuoc, 17);
        sViewsWithIds.put(R.id.ln_combo, 18);
        sViewsWithIds.put(R.id.tvt_combo, 19);
        sViewsWithIds.put(R.id.tvt_giaCombo, 20);
        sViewsWithIds.put(R.id.tvt_tongtien, 21);
        sViewsWithIds.put(R.id.btn_thanhtoan, 22);
        sViewsWithIds.put(R.id.webviewTT, 23);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ThanhtoanFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private ThanhtoanFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.Button) bindings[22]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[21]
            , (android.webkit.WebView) bindings[23]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}