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
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(1, 
            new String[] {"dialog_loading"},
            new int[] {4},
            new int[] {com.base.moviebooking.R.layout.dialog_loading});
        sIncludes.setIncludes(2, 
            new String[] {"dialog_loading"},
            new int[] {3},
            new int[] {com.base.moviebooking.R.layout.dialog_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView2, 5);
        sViewsWithIds.put(R.id.search_film, 6);
        sViewsWithIds.put(R.id.viewpager, 7);
        sViewsWithIds.put(R.id.circle_indicator, 8);
        sViewsWithIds.put(R.id.textView9, 9);
        sViewsWithIds.put(R.id.categoryView, 10);
        sViewsWithIds.put(R.id.cst2, 11);
        sViewsWithIds.put(R.id.tvt_dangchieu, 12);
        sViewsWithIds.put(R.id.tvt_sapchieu, 13);
        sViewsWithIds.put(R.id.tvt_toanquoc, 14);
        sViewsWithIds.put(R.id.rcv_search, 15);
        sViewsWithIds.put(R.id.btnXemTiep, 16);
        sViewsWithIds.put(R.id.scrollview_home, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private HomeFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (me.relex.circleindicator.CircleIndicator) bindings[8]
            , (android.widget.LinearLayout) bindings[11]
            , (com.base.moviebooking.databinding.DialogLoadingBinding) bindings[3]
            , (com.base.moviebooking.databinding.DialogLoadingBinding) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (androidx.core.widget.NestedScrollView) bindings[5]
            , (android.widget.HorizontalScrollView) bindings[17]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (androidx.viewpager2.widget.ViewPager2) bindings[7]
            );
        setContainedBinding(this.dialogCategory);
        setContainedBinding(this.dialogLoad);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        dialogCategory.invalidateAll();
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
        if (dialogCategory.hasPendingBindings()) {
            return true;
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
        dialogCategory.setLifecycleOwner(lifecycleOwner);
        dialogLoad.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDialogCategory((com.base.moviebooking.databinding.DialogLoadingBinding) object, fieldId);
            case 1 :
                return onChangeDialogLoad((com.base.moviebooking.databinding.DialogLoadingBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDialogCategory(com.base.moviebooking.databinding.DialogLoadingBinding DialogCategory, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDialogLoad(com.base.moviebooking.databinding.DialogLoadingBinding DialogLoad, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        executeBindingsOn(dialogCategory);
        executeBindingsOn(dialogLoad);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dialogCategory
        flag 1 (0x2L): dialogLoad
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}