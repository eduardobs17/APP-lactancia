package com.example.applactancia;

import java.util.ArrayList;

public class MenuAuxGaleria {

    private int idImagen;
    private String titulo;

    MenuAuxGaleria() {
        idImagen = 0;
        titulo = "";
    }

    private MenuAuxGaleria(int id, String tit) {
        idImagen = id;
        titulo = tit;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<MenuAuxGaleria> listaMenu() {
        ArrayList<MenuAuxGaleria> lista = new ArrayList<>();

        Integer[] imagenes = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5,
                R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10,
                R.drawable.img11, R.drawable.img12, R.drawable.img13, R.drawable.img14, R.drawable.img15,
                R.drawable.img16, R.drawable.img17, R.drawable.img18, R.drawable.img19, R.drawable.img20,
                R.drawable.img21, R.drawable.img22, R.drawable.img23};

        for (int x = 0; x < imagenes.length; x++) {
            MenuAuxGaleria menu = new MenuAuxGaleria(imagenes[x], "");
            lista.add(menu);
        }
        return lista;
    }
}
