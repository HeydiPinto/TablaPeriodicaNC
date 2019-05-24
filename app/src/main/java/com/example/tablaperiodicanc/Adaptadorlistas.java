package com.example.tablaperiodicanc;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptadorlistas extends RecyclerView.Adapter<Adaptadorlistas.PersonajeViewHolder> {
    ArrayList<clases> Listaelementos;
    public Adaptadorlistas(ArrayList<clases>listaelementos){
        this.Listaelementos=listaelementos;
    }

    @NonNull
    @Override
    public PersonajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int ViewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista,null,false);

        return new PersonajeViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(PersonajeViewHolder holder, int position) {
        holder.txtNombre.setText(Listaelementos.get(position).getNombre());
        holder.txtInformacion.setText(Listaelementos.get(position).getInfo());
        holder.foto.setImageResource(Listaelementos.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return Listaelementos.size();
    }

    public class PersonajeViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre, txtInformacion;
        ImageView foto;

        public PersonajeViewHolder(View itemView) {
            super(itemView);
            txtNombre = (TextView) itemView.findViewById(R.id.idNombre);
            txtInformacion = (TextView) itemView.findViewById(R.id.ne);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
        }
    }}