package com.example.hani.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        PlaceholderFragment place=new PlaceholderFragment();
        Bundle bund=new Bundle();
        bund.putInt("pos",i);
        place.setArguments(bund);

        return place;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "section 1";
            case 1:
                return "section 2";
            case 2:
                return "section 3";
        }
        return null;
    }
}
