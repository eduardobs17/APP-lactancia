package com.example.applactancia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ImageSwitcher imageSwitcher;
    private int[] galeria = {R.drawable.img1, R.drawable.img2, R.drawable.img3};
    private int posicion;
    private static final int DURACION = 5000;
    private Timer timer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSwitcher = findViewById(R.id.imageSwitcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            public View makeView() {
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

                return imageView;
            }
        });

        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        imageSwitcher.setInAnimation(fadeIn);
        imageSwitcher.setOutAnimation(fadeOut);

        //startSlider();
    }

    public void startSlider() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                runOnUiThread(new Runnable() {
                    public void run() {
                        imageSwitcher.setImageResource(galeria[posicion]);
                        posicion++;
                        if (posicion == galeria.length)
                            posicion = 0;
                    }
                });
            }
        }, 0, DURACION);
    }

    public void ejecutarInfo(View v) {
        Intent intent = new Intent(MainActivity.this, ActivityInfo.class);
        startActivity(intent);
    }

    public void ejecutarBeneficios(View v) {
        Intent intent = new Intent(MainActivity.this, Beneficios.class);
        startActivity(intent);
    }

    public void ejecutarAlimentacion(View v) {
        Intent intent = new Intent(MainActivity.this, Alimentacion.class);
        startActivity(intent);
    }

    public void ejecutarCuidado(View v) { }

    public void ejecutarExtraccion(View v) {
        Intent intent = new Intent(MainActivity.this, extraccion.class);
        startActivity(intent);
    }

    public void ejecutarAlmacenamiento(View v) { }
    public void ejecutarPosiciones(View v) { }
    public void ejecutarCuidados(View v) { }
    public void ejecutarLeyes(View v) { }
    public void ejecutarPaginasWeb(View v) { }
    public void ejecutarPreguntas(View v) { }

}
