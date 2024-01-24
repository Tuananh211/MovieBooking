package com.base.moviebooking.databinding;
import com.base.moviebooking.R;
import com.base.moviebooking.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RcvDienanhBindingImpl extends RcvDienanhBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image, 2);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RcvDienanhBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private RcvDienanhBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.imageview.ShapeableImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[1]
            );
        this.lnFilminfo.setTag(null);
        this.name.setTag(null);
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
        if (BR.dienanh == variableId) {
            setDienanh((com.base.moviebooking.entity.FilmInfo) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDienanh(@Nullable com.base.moviebooking.entity.FilmInfo Dienanh) {
        this.mDienanh = Dienanh;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.dienanh);
        super.requestRebind();
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
        java.lang.String dienanhTenDienAnh = null;
        com.base.moviebooking.entity.FilmInfo dienanh = mDienanh;

        if ((dirtyFlags & 0x3L) != 0) {



                if (dienanh != null) {
                    // read dienanh.tenDienAnh
                    dienanhTenDienAnh = dienanh.getTenDienAnh();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, dienanhTenDienAnh);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dienanh
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}