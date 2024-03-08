package com.base.moviebooking.databinding;
import com.base.moviebooking.R;
import com.base.moviebooking.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RcvRapBindingImpl extends RcvRapBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image, 4);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RcvRapBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RcvRapBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.imageview.ShapeableImageView) bindings[4]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.lnTheater.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
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
        if (BR.theater == variableId) {
            setTheater((com.base.moviebooking.entity.Theater) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTheater(@Nullable com.base.moviebooking.entity.Theater Theater) {
        this.mTheater = Theater;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.theater);
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
        com.base.moviebooking.entity.Theater theater = mTheater;
        java.lang.String theaterPhone = null;
        boolean theaterAddressJavaLangObjectNull = false;
        java.lang.String javaLangStringPhoneTheaterPhoneJavaLangObjectNullTheaterPhoneJavaLangString0123456789 = null;
        java.lang.String theaterPhoneJavaLangObjectNullTheaterPhoneJavaLangString0123456789 = null;
        java.lang.String theaterName = null;
        java.lang.String theaterAddress = null;
        java.lang.String theaterCity = null;
        java.lang.String theaterAddressJavaLangObjectNullTheaterAddressTheaterCity = null;
        boolean theaterPhoneJavaLangObjectNull = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (theater != null) {
                    // read theater.phone
                    theaterPhone = theater.getPhone();
                    // read theater.name
                    theaterName = theater.getName();
                    // read theater.address
                    theaterAddress = theater.getAddress();
                }


                // read theater.phone != null
                theaterPhoneJavaLangObjectNull = (theaterPhone) != (null);
                // read theater.address != null
                theaterAddressJavaLangObjectNull = (theaterAddress) != (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(theaterPhoneJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(theaterAddressJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read theater.phone != null ? theater.phone : "0123456789"
                theaterPhoneJavaLangObjectNullTheaterPhoneJavaLangString0123456789 = ((theaterPhoneJavaLangObjectNull) ? (theaterPhone) : ("0123456789"));


                // read ("Phone:") + (theater.phone != null ? theater.phone : "0123456789")
                javaLangStringPhoneTheaterPhoneJavaLangObjectNullTheaterPhoneJavaLangString0123456789 = ("Phone:") + (theaterPhoneJavaLangObjectNullTheaterPhoneJavaLangString0123456789);
        }
        if ((dirtyFlags & 0x10L) != 0) {

                if (theater != null) {
                    // read theater.city
                    theaterCity = theater.getCity();
                }
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read theater.address != null ? theater.address : theater.city
                theaterAddressJavaLangObjectNullTheaterAddressTheaterCity = ((theaterAddressJavaLangObjectNull) ? (theaterAddress) : (theaterCity));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, theaterName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, theaterAddressJavaLangObjectNullTheaterAddressTheaterCity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, javaLangStringPhoneTheaterPhoneJavaLangObjectNullTheaterPhoneJavaLangString0123456789);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): theater
        flag 1 (0x2L): null
        flag 2 (0x3L): theater.phone != null ? theater.phone : "0123456789"
        flag 3 (0x4L): theater.phone != null ? theater.phone : "0123456789"
        flag 4 (0x5L): theater.address != null ? theater.address : theater.city
        flag 5 (0x6L): theater.address != null ? theater.address : theater.city
    flag mapping end*/
    //end
}