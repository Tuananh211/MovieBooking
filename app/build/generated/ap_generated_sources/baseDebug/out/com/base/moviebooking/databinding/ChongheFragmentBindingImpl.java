package com.base.moviebooking.databinding;
import com.base.moviebooking.R;
import com.base.moviebooking.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChongheFragmentBindingImpl extends ChongheFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nameMovie, 1);
        sViewsWithIds.put(R.id.format, 2);
        sViewsWithIds.put(R.id.tvt_ageLimit, 3);
        sViewsWithIds.put(R.id.rcv_seat, 4);
        sViewsWithIds.put(R.id.amount_thuong, 5);
        sViewsWithIds.put(R.id.amount_vip, 6);
        sViewsWithIds.put(R.id.cb_nuoc, 7);
        sViewsWithIds.put(R.id.img_nuoc, 8);
        sViewsWithIds.put(R.id.tvt_Nuoc, 9);
        sViewsWithIds.put(R.id.tru_nuoc, 10);
        sViewsWithIds.put(R.id.sl_nuoc, 11);
        sViewsWithIds.put(R.id.cong_nuoc, 12);
        sViewsWithIds.put(R.id.gia_nuoc, 13);
        sViewsWithIds.put(R.id.cb_bong, 14);
        sViewsWithIds.put(R.id.img_bong, 15);
        sViewsWithIds.put(R.id.tvt_bong, 16);
        sViewsWithIds.put(R.id.tru_bong, 17);
        sViewsWithIds.put(R.id.sl_bong, 18);
        sViewsWithIds.put(R.id.cong_bong, 19);
        sViewsWithIds.put(R.id.gia_bong, 20);
        sViewsWithIds.put(R.id.cb_combo, 21);
        sViewsWithIds.put(R.id.img_combo, 22);
        sViewsWithIds.put(R.id.tvt_combo, 23);
        sViewsWithIds.put(R.id.tru_combo, 24);
        sViewsWithIds.put(R.id.sl_combo, 25);
        sViewsWithIds.put(R.id.cong_combo, 26);
        sViewsWithIds.put(R.id.gia_combo, 27);
        sViewsWithIds.put(R.id.tvt_listghe, 28);
        sViewsWithIds.put(R.id.tvt_tongtien, 29);
        sViewsWithIds.put(R.id.btn_datve, 30);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChongheFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private ChongheFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[30]
            , (android.widget.CheckBox) bindings[14]
            , (android.widget.CheckBox) bindings[21]
            , (android.widget.CheckBox) bindings[7]
            , (android.widget.Button) bindings[19]
            , (android.widget.Button) bindings[26]
            , (android.widget.Button) bindings[12]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[13]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[11]
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[24]
            , (android.widget.Button) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[29]
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