package com.example.applactancia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void ejecutarExtraccion(View v) {
        Intent intent = new Intent(MainActivity.this, extraccion.class);
        startActivity(intent);
    }

    public void ejecutarAlmacenamiento(View v) {
        Intent intent = new Intent(MainActivity.this, Almacenamiento.class);
        startActivity(intent);
    }

    public void ejecutarPosiciones(View v) {
        Intent intent = new Intent(MainActivity.this, Posiciones.class);
        startActivity(intent);
    }

    public void ejecutarCuidado(View v) {
        Intent intent = new Intent(MainActivity.this, CuidadosMamas.class);
        startActivity(intent);
    }

    public void ejecutarCuidados(View v) {
        Intent intent = new Intent(MainActivity.this, OtrosCuidados.class);
        startActivity(intent);
    }

    public void ejecutarLeyes(View v) {
        Intent intent = new Intent(MainActivity.this, Leyes.class);
        startActivity(intent);
    }

    public void ejecutarPaginasWeb(View v) {
        Intent intent = new Intent(MainActivity.this, Pagsweb.class);
        startActivity(intent);
    }

    public void ejecutarPreguntas(View v) {
        Intent intent = new Intent(MainActivity.this, Preguntas.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu1) {
            Intent intent = new Intent(MainActivity.this, MenuUbicaciones.class);
            startActivity(intent);
        }

        if (id == R.id.menu2) {
            Intent intent = new Intent(MainActivity.this, MenuContacto.class);
            startActivity(intent);
        }

        if (id == R.id.menu3) {
            Intent intent = new Intent(MainActivity.this, Ayuda.class);
            startActivity(intent);
        }

        if (id == R.id.menu4) {
            Intent intent = new Intent(MainActivity.this, MenuGaleria.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
