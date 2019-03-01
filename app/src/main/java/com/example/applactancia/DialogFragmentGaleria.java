package com.example.applactancia;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DialogFragmentGaleria extends DialogFragment {

    View view;
    RecyclerView recyclerView;
    ImageView imagen;
    ArrayList<MenuAuxGaleria> listaMenu;
    RecyclerAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_dialog_fragment_galeria, container, false);
        recyclerView = view.findViewById(R.id.galeria);
        imagen = view.findViewById(R.id.imagen);

        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        listaMenu = new MenuAuxGaleria().listaMenu();
        adapter = new RecyclerAdapter(listaMenu, new RecyclerAdapter.OnclickRecycler() {
            @Override
            public void OnclickItemRecycler(MenuAuxGaleria menu) {
                Glide.with(getContext()).load(menu.getIdImagen()).into(imagen);
            }
        });

        recyclerView.setAdapter(adapter);
        return view;
    }
}
