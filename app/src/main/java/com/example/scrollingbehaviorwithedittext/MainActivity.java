package com.example.scrollingbehaviorwithedittext;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        toolbar = findViewById(R.id.toolbar);

        ContentsPagerAdapter adapter = new ContentsPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Title");
        getSupportActionBar().setElevation(0);
    }
}