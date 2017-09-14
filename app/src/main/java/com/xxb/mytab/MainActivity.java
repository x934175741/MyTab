package com.xxb.mytab;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.longsh.longshlibrary.PagerSlidingTabStrip;

public class MainActivity extends AppCompatActivity {
    private PagerSlidingTabStrip tabs;
    private ViewPager pager;
//// TODO: 2017/9/14  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = (ViewPager) findViewById(R.id.pager);
        tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
    }
}
