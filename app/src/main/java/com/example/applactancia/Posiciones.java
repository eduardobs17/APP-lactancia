package com.example.applactancia;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Posiciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posiciones);

        ViewPager viewPager = findViewById(R.id.viewpagerPosiciones);
        viewPager.setAdapter(new CustomPagerAdapter(this, 3));
    }
}
