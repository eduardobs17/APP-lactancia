package com.example.applactancia;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MenuGaleria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_galeria);

        FragmentManager manager = getSupportFragmentManager();
        DialogFragmentGaleria galeria = new DialogFragmentGaleria();
        galeria.setStyle(DialogFragment.STYLE_NO_FRAME, R.style.transparente);
        galeria.show(manager, "");
    }
}
