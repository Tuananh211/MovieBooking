package com.base.moviebooking.databinding;
import com.base.moviebooking.R;
import com.base.moviebooking.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RcvGiaodichBindingImpl extends RcvGiaodichBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ln_GDich, 1);
        sViewsWithIds.put(R.id.tien, 2);
        sViewsWithIds.put(R.id.cinema, 3);
        sViewsWithIds.put(R.id.room, 4);
        sViewsWithIds.put(R.id.movie, 5);
        sViewsWithIds.put(R.id.gio, 6);
        sViewsWithIds.put(R.id.chair, 7);
        sViewsWithIds.put(R.id.bongngo, 8);
        sViewsWithIds.put(R.id.nuoc, 9);
        sViewsWithIds.put(R.id.combo, 10);
        sViewsWithIds.put(R.id.lnHuy, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RcvGiaodichBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private RcvGiaodichBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[6]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.lnRcvgiaodich.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.giaodich == variableId) {
            setGiaodich((com.base.moviebooking.entity.ThongTinThanhToan) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGiaodich(@Nullable com.base.moviebooking.entity.ThongTinThanhToan Giaodich) {
        this.mGiaodich = Giaodich;
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
        flag 0 (0x1L): giaodich
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}