package com.example.eventlogger;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class events_fragment extends AppCompatActivity {

    private SectionsStatePagerAdapter mSectionsStatePagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_events);

        /*mSectionsStatePagerAdapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);

        setupViewPager(mViewPager);*/
    }
    private void setupViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new events_airplane());
        //adapter.addFragment(new Fragment2(), "Fragment2");
        //adapter.addFragment(new Fragment3(), "Fragment3");
        viewPager.setAdapter(adapter);
    }
  /*  public void setViewPager(int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);
    }*/



    }




