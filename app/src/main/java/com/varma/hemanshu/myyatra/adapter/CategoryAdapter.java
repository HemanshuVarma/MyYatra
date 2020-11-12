package com.varma.hemanshu.myyatra.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.varma.hemanshu.myyatra.R;
import com.varma.hemanshu.myyatra.fragments.AdventureFragment;
import com.varma.hemanshu.myyatra.fragments.FoodFragment;
import com.varma.hemanshu.myyatra.fragments.HotelsFragment;
import com.varma.hemanshu.myyatra.fragments.PlacesFragment;

public class CategoryAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * To fetch the Fragment to be Displayed
     *
     * @param i Represents the position of Fragment
     * @return Fragment to Inflate
     */
    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new PlacesFragment();
        } else if (i == 1) {
            return new HotelsFragment();
        } else if (i == 2) {
            return new FoodFragment();
        } else {
            return new AdventureFragment();
        }
    }

    /**
     * To return the Name of the Tab which is active
     *
     * @param position which describes the current tab
     * @return Name of current/Active Tab
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.places);
        } else if (position == 1) {
            return mContext.getString(R.string.hotels);
        } else if (position == 2) {
            return mContext.getString(R.string.food);
        } else {
            return mContext.getString(R.string.adventure);
        }
    }

    /**
     * To Get the count of Fragments to be displayed
     *
     * @return count of Fragments
     */
    @Override
    public int getCount() {
        return 4;
    }
}
