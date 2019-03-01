package com.example.applactancia;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<MenuAuxGaleria> listaMenu;
    private OnclickRecycler listener;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adaptador, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MenuAuxGaleria menu = listaMenu.get(position);
        holder.bind(menu, listener);
    }

    @Override
    public int getItemCount() {
        return listaMenu.size();
    }

    public interface OnclickRecycler {
        void OnclickItemRecycler(MenuAuxGaleria menu);
    }

    public RecyclerAdapter(ArrayList<MenuAuxGaleria> lista, OnclickRecycler recycler) {
        listaMenu = lista;
        listener = recycler;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imagengaleria);
        }

        /**
         * Obtiene el id de la imagen y lo carga en la variable creada.
         * @param menu
         * @param listener
         */
        void bind(final MenuAuxGaleria menu, final OnclickRecycler listener) {
            Glide.with(imageView.getContext()).load(menu.getIdImagen()).into(imageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.OnclickItemRecycler(menu);
                }
            });
        }
    }
}
