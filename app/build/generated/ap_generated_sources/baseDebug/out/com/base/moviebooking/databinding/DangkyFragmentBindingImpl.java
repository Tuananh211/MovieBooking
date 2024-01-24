package com.base.moviebooking.databinding;
import com.base.moviebooking.R;
import com.base.moviebooking.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DangkyFragmentBindingImpl extends DangkyFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout, 1);
        sViewsWithIds.put(R.id.back_image, 2);
        sViewsWithIds.put(R.id.view, 3);
        sViewsWithIds.put(R.id.back_dky, 4);
        sViewsWithIds.put(R.id.edt_name, 5);
        sViewsWithIds.put(R.id.edt_email, 6);
        sViewsWithIds.put(R.id.edt_phone, 7);
        sViewsWithIds.put(R.id.edt_address, 8);
        sViewsWithIds.put(R.id.edt_birthday, 9);
        sViewsWithIds.put(R.id.edt_password, 10);
        sViewsWithIds.put(R.id.repeat_pass, 11);
        sViewsWithIds.put(R.id.btn_Register, 12);
        sViewsWithIds.put(R.id.To_login, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DangkyFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private DangkyFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[13]
            , (android.widget.ImageView) bindings[4]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatButton) bindings[12]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (com.google.android.material.textfield.TextInputEditText) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (android.widget.LinearLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[11]
            , (android.view.View) bindings[3]
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