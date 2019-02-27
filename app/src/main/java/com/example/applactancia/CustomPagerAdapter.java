package com.example.applactancia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CustomPagerAdapter extends PagerAdapter {

    private Context mContext;
    private int mId;

    CustomPagerAdapter(Context context, int id) {
        mContext = context;
        mId = id;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup collection, int position) {
        ViewGroup layout;
        LayoutInflater inflater;
        switch (mId) {
            case 1:
                ModelObjectBeneficios modelObject1 = ModelObjectBeneficios.values()[position];
                inflater = LayoutInflater.from(mContext);
                layout = (ViewGroup) inflater.inflate(modelObject1.getLayoutResId(), collection, false);
                collection.addView(layout);
                return layout;

            case 2:
                ModelObjectAlimentacion modelObject2 = ModelObjectAlimentacion.values()[position];
                inflater = LayoutInflater.from(mContext);
                layout = (ViewGroup) inflater.inflate(modelObject2.getLayoutResId(), collection, false);
                collection.addView(layout);
                return layout;

            case 3:
                ModelObjectPosiciones modelObject3 = ModelObjectPosiciones.values()[position];
                inflater = LayoutInflater.from(mContext);
                layout = (ViewGroup) inflater.inflate(modelObject3.getLayoutResId(), collection, false);
                collection.addView(layout);
                return layout;
        }
        //noinspection ConstantConditions
        return null;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup collection, int position, @NonNull Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        switch (mId) {
            case 1:
                return ModelObjectBeneficios.values().length;
            case 2:
                return ModelObjectAlimentacion.values().length;
            case 3:
                return ModelObjectPosiciones.values().length;
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (mId) {
            case 1:
                ModelObjectBeneficios customPagerEnum1 = ModelObjectBeneficios.values()[position];
                return mContext.getString(customPagerEnum1.getTitleResId());
            case 2:
                ModelObjectAlimentacion customPagerEnum2 = ModelObjectAlimentacion.values()[position];
                return mContext.getString(customPagerEnum2.getTitleResId());
            case 3:
                ModelObjectPosiciones customPagerEnum3 = ModelObjectPosiciones.values()[position];
                return mContext.getString(customPagerEnum3.getTitleResId());
        }
        return null;
    }

}
