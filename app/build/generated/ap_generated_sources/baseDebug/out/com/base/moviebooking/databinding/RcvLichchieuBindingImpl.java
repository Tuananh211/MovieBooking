package com.base.moviebooking.databinding;
import com.base.moviebooking.R;
import com.base.moviebooking.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RcvLichchieuBindingImpl extends RcvLichchieuBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ln_down, 2);
        sViewsWithIds.put(R.id.check, 3);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RcvLichchieuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private RcvLichchieuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[2]
            );
        this.lnCheck.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
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
        if (BR.lichchieu == variableId) {
            setLichchieu((com.base.moviebooking.entity.Schedule) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLichchieu(@Nullable com.base.moviebooking.entity.Schedule Lichchieu) {
        this.mLichchieu = Lichchieu;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.lichchieu);
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
        com.base.moviebooking.entity.Schedule lichchieu = mLichchieu;
        java.lang.String lichchieuRoomName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (lichchieu != null) {
                    // read lichchieu.room_name
                    lichchieuRoomName = lichchieu.getRoom_name();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, lichchieuRoomName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): lichchieu
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}