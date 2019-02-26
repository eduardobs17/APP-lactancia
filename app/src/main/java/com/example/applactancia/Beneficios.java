package com.example.applactancia;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Beneficios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficios);

        ViewPager viewPager = findViewById(R.id.viewpagerBeneficios);
        viewPager.setAdapter(new CustomPagerAdapter(this, 1));
    }
}
