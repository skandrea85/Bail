package com.example.andrea.bailicata;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    private String tabTitles[] = new String[]{"Castle", "Forest", "Water", "Ghost Town"};


    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new Castle();
        } else if (position == 1) {

            return new WoodsFragment();
        } else if (position == 2) {
            return new WaterFragment();
        } else {
            return new GhostTown();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
