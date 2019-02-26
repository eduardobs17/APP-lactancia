package com.example.applactancia;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class Alimentacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentacion);

        ViewPager viewPager = findViewById(R.id.viewpagerAlimentacion);
        viewPager.setAdapter(new CustomPagerAdapter(this, 2));
    }

}
