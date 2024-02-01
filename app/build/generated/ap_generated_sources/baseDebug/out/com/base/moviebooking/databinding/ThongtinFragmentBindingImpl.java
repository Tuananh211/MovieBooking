package com.base.moviebooking.databinding;
import com.base.moviebooking.R;
import com.base.moviebooking.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ThongtinFragmentBindingImpl extends ThongtinFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(1, 
            new String[] {"dialog_loading", "dialog_loading"},
            new int[] {2, 3},
            new int[] {com.base.moviebooking.R.layout.dialog_loading,
                com.base.moviebooking.R.layout.dialog_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txtCategory, 4);
        sViewsWithIds.put(R.id.cateView, 5);
        sViewsWithIds.put(R.id.test1, 6);
        sViewsWithIds.put(R.id.descriptionMovie, 7);
        sViewsWithIds.put(R.id.dienvien, 8);
        sViewsWithIds.put(R.id.listActor, 9);
        sViewsWithIds.put(R.id.directorImage, 10);
        sViewsWithIds.put(R.id.directorMovie, 11);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ThongtinFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ThongtinFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.base.moviebooking.databinding.DialogLoadingBinding) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (com.base.moviebooking.databinding.DialogLoadingBinding) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        setContainedBinding(this.actorLoad);
        setContainedBinding(this.categoryLoad);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.thongtinFragment.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        categoryLoad.invalidateAll();
        actorLoad.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (categoryLoad.hasPendingBindings()) {
            return true;
        }
        if (actorLoad.hasPendingBindings()) {
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
        categoryLoad.setLifecycleOwner(lifecycleOwner);
        actorLoad.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeActorLoad((com.base.moviebooking.databinding.DialogLoadingBinding) object, fieldId);
            case 1 :
                return onChangeCategoryLoad((com.base.moviebooking.databinding.DialogLoadingBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeActorLoad(com.base.moviebooking.databinding.DialogLoadingBinding ActorLoad, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCategoryLoad(com.base.moviebooking.databinding.DialogLoadingBinding CategoryLoad, int fieldId) {
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
        executeBindingsOn(categoryLoad);
        executeBindingsOn(actorLoad);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): actorLoad
        flag 1 (0x2L): categoryLoad
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}