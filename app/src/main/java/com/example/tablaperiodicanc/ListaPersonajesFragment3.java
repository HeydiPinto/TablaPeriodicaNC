package com.example.tablaperiodicanc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ListaPersonajesFragment3 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    RecyclerView recyclerView;
    ArrayList<clases> Listaelementos;

    public ListaPersonajesFragment3() {
        // Required empty public constructor
    }


    public static ListaPersonajesFragment newInstance(String param1, String param2) {
        ListaPersonajesFragment fragment = new ListaPersonajesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_lista_personajes, container, false);

        Listaelementos = new ArrayList<>();
        recyclerView = (RecyclerView) vista.findViewById(R.id.recyclerId);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarLista();

        Adaptadorlistas adapter = new Adaptadorlistas(Listaelementos);
        recyclerView.setAdapter(adapter);

        return vista;
    }

    private void llenarLista() {
        Listaelementos.add(new clases("Boro", "El boro es un elemento químico de la tabla periódica de los elementos que tiene el símbolo B y número atómico 5, su masa es de 10,811.", R.drawable.boro));
        //Listaelementos.add(new clases("", "", R.drawable.Boro));
        Listaelementos.add(new clases("Silicio", "El silicio es un elemento químico metaloide, número atómico 14 y situado en el grupo 14 de la tabla periódica de los elementos de símbolo Si.", R.drawable.silicio));
        Listaelementos.add(new clases("Germanio", "El germanio es un elemento químico con número atómico 32, y símbolo Ge perteneciente al período 4 de la tabla periódica de los elementos.", R.drawable.germanio));
        Listaelementos.add(new clases("Arsénico", "El arsénico es un elemento químico de la tabla periódica que pertenece al grupo de los metaloides, también llamados semimetales, se puede encontrar de diversas formas, aunque raramente se encuentra en estado sólido.", R.drawable.arsenico));
        Listaelementos.add(new clases("Antimonio", "El antimonio es un elemento químico que forma parte del grupo de los metaloides de número atómico 51 situado en el grupo 15 de la tabla periódica de los elementos.", R.drawable.anti));
        Listaelementos.add(new clases("Telurio", "El telurio o telurio  es un elemento químico cuyo símbolo es Te y su número atómico es 52. ", R.drawable.telurio));
        Listaelementos.add(new clases("Polonio", "El polonio es un elemento químico en la tabla periódica de los elementos cuyo símbolo es Po y su número atómico es 84.", R.drawable.polonio));
    }

}