package com.buu.se.tabbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Dell on 02/02/2560.
 */

public class TabbarAdapter extends FragmentPagerAdapter {

    public TabbarAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public int getCount() {
        // Show 3 total pages.
        return 2;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        if(position == 0){
            fragment= ProfileFragment.newInstance();
        }else{
            fragment= ForetellFragment.newInstance();
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "โปรไฟล์";
            case 1:
                return "ดูดวง";
            case 2:
                return "SECTION 3";
        }
        return null;
    }
}