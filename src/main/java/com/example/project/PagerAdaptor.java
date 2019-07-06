package com.example.project;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdaptor extends FragmentStatePagerAdapter {
    int noofTabs;
    public PagerAdaptor(FragmentManager fm, int noofTabs) {
        super(fm);
        this.noofTabs=noofTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                Triund triund=new Triund();
                return triund;
            case 1:
                Kareri kareri=new Kareri();
                return kareri;
            case 2:
                Dhankar dhankar=new Dhankar();
                return dhankar;
            case 3:
                Chandarshila chandarshila=new Chandarshila();
                return chandarshila;
            default:
                return null;
    }
    }

    @Override
    public int getCount() {
        return noofTabs;
    }
}
