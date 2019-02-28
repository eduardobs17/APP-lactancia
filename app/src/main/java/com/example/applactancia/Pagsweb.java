package com.example.applactancia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Pagsweb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagsweb);

        TextView pw1 = findViewById(R.id.pw1);
        TextView pw2 = findViewById(R.id.pw2);
        TextView pw3 = findViewById(R.id.pw3);
        TextView pw4 = findViewById(R.id.pw4);
        TextView pw5 = findViewById(R.id.pw5);
        TextView pw6 = findViewById(R.id.pw6);
        TextView pw7 = findViewById(R.id.pw7);

        pw1.setMovementMethod(LinkMovementMethod.getInstance());
        pw2.setMovementMethod(LinkMovementMethod.getInstance());
        pw3.setMovementMethod(LinkMovementMethod.getInstance());
        pw4.setMovementMethod(LinkMovementMethod.getInstance());
        pw5.setMovementMethod(LinkMovementMethod.getInstance());
        pw6.setMovementMethod(LinkMovementMethod.getInstance());
        pw7.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
