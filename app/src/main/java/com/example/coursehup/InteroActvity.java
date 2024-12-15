package com.example.coursehup;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class InteroActvity extends AppCompatActivity {
    private ViewPager viewPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tabLayout;
    Button button;

    Button button1;

    TextView tvSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intero_actvity);
      button=findViewById(R.id.btn_next);
      button1=findViewById(R.id.btn_Getstart);
      tabLayout=findViewById(R.id.tab_indicator);
      tvSkip=findViewById(R.id.tv_skip);
      final List<ScreenItem> list=new ArrayList<>();
      list.add(new ScreenItem("Fresh Food","lorem",R.drawable.ic_launcher_background));
        list.add(new ScreenItem("Fresh Food","lorem",R.drawable.baseline_door_sliding_24));
        list.add(new ScreenItem("Fresh Food","lorem",R.drawable.baseline_navigate_next_24));
        viewPager=findViewById(R.id.Screen_Viewpager);
        introViewPagerAdapter=new IntroViewPagerAdapter(this,list);
        viewPager.setAdapter(introViewPagerAdapter);

    }
}