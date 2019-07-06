package com.example.project;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements Triund.OnFragmentInteractionListener,Kareri.OnFragmentInteractionListener,Chandarshila.OnFragmentInteractionListener,Dhankar.OnFragmentInteractionListener{
      ViewPager viewPager;
      PagerAdaptor pagerAdaptor;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout=(TabLayout)findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Triund"));
        tabLayout.addTab(tabLayout.newTab().setText("Kareri"));
        tabLayout.addTab(tabLayout.newTab().setText("Dhankar"));
        tabLayout.addTab(tabLayout.newTab().setText("Chandar"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        pagerAdaptor=new PagerAdaptor(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdaptor);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
