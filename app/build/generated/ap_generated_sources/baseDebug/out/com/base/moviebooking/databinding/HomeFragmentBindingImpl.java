package com.base.moviebooking.databinding;
import com.base.moviebooking.R;
import com.base.moviebooking.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeFragmentBindingImpl extends HomeFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(1, 
            new String[] {"dialog_loading"},
            new int[] {2},
            new int[] {com.base.moviebooking.R.layout.dialog_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView2, 3);
        sViewsWithIds.put(R.id.editTextText, 4);
        sViewsWithIds.put(R.id.viewpager, 5);
        sViewsWithIds.put(R.id.circle_indicator, 6);
        sViewsWithIds.put(R.id.textView9, 7);
        sViewsWithIds.put(R.id.categoryView, 8);
        sViewsWithIds.put(R.id.progressBar2, 9);
        sViewsWithIds.put(R.id.cst2, 10);
        sViewsWithIds.put(R.id.tvt_dangchieu, 11);
        sViewsWithIds.put(R.id.tvt_sapchieu, 12);
        sViewsWithIds.put(R.id.tvt_toanquoc, 13);
        sViewsWithIds.put(R.id.rcv_search, 14);
        sViewsWithIds.put(R.id.btnXemTiep, 15);
        sViewsWithIds.put(R.id.scrollview_home, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private HomeFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (me.relex.circleindicator.CircleIndicator) bindings[6]
            , (android.widget.LinearLayout) bindings[10]
            , (com.base.moviebooking.databinding.DialogLoadingBinding) bindings[2]
            , (android.widget.EditText) bindings[4]
            , (android.widget.ProgressBar) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (androidx.core.widget.NestedScrollView) bindings[3]
            , (android.widget.HorizontalScrollView) bindings[16]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (androidx.viewpager.widget.ViewPager) bindings[5]
            );
        setContainedBinding(this.dialogLoad);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
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
        dialogLoad.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (dialogLoad.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        dialogLoad.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDialogLoad((com.base.moviebooking.databinding.DialogLoadingBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDialogLoad(com.base.moviebooking.databinding.DialogLoadingBinding DialogLoad, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        executeBindingsOn(dialogLoad);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dialogLoad
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}