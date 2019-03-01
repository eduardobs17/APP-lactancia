package com.example.applactancia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MenuUbicaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ubicaciones);

        TextView u1 = findViewById(R.id.u1);
        TextView u2 = findViewById(R.id.u2);
        TextView u3 = findViewById(R.id.u3);
        TextView u4 = findViewById(R.id.u4);
        TextView u5 = findViewById(R.id.u5);
        TextView u6 = findViewById(R.id.u6);

        u1.setMovementMethod(LinkMovementMethod.getInstance());
        u2.setMovementMethod(LinkMovementMethod.getInstance());
        u3.setMovementMethod(LinkMovementMethod.getInstance());
        u4.setMovementMethod(LinkMovementMethod.getInstance());
        u5.setMovementMethod(LinkMovementMethod.getInstance());
        u6.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
