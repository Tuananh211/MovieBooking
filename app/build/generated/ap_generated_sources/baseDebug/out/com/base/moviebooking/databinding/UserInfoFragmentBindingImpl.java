package com.base.moviebooking.databinding;
import com.base.moviebooking.R;
import com.base.moviebooking.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UserInfoFragmentBindingImpl extends UserInfoFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.back_tt, 1);
        sViewsWithIds.put(R.id.imgUser, 2);
        sViewsWithIds.put(R.id.pickImage, 3);
        sViewsWithIds.put(R.id.nameUser, 4);
        sViewsWithIds.put(R.id.phoneuser, 5);
        sViewsWithIds.put(R.id.birthday_user, 6);
        sViewsWithIds.put(R.id.gmail_user, 7);
        sViewsWithIds.put(R.id.address, 8);
        sViewsWithIds.put(R.id.nam, 9);
        sViewsWithIds.put(R.id.nu, 10);
        sViewsWithIds.put(R.id.btnPass, 11);
        sViewsWithIds.put(R.id.btnCapnhat, 12);
        sViewsWithIds.put(R.id.loading, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UserInfoFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private UserInfoFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[8]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.EditText) bindings[6]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[11]
            , (android.widget.TextView) bindings[7]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[2]
            , (android.widget.ProgressBar) bindings[13]
            , (android.widget.RadioButton) bindings[9]
            , (android.widget.EditText) bindings[4]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
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