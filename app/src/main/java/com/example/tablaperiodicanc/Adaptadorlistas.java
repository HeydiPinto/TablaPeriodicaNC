package com.example.tablaperiodicanc;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adaptadorlistas extends RecyclerView.Adapter<Adaptadorlistas.PersonajeViewHolder> {
    ArrayList<clases> Listaelementos;
    ArrayList<clases> ListaelementosF;
    public Adaptadorlistas(ArrayList<clases> listaelementos){
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
    }

    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    ListaelementosF = Listaelementos;
                } else {
                    ArrayList<clases> filteredList = new ArrayList<>();
                    for (clases row : Listaelementos) {
                        // Aquí estamos buscando el nombre o el número de teléfono
                        if (row.getNombre().toLowerCase().contains(charString.toLowerCase()) || row.getInfo().contains(charSequence)) {
                            filteredList.add(row);
                        }
                    }

                    ListaelementosF= filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = ListaelementosF;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                ListaelementosF = (ArrayList<clases>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

}