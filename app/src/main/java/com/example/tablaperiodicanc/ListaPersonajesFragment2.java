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



public class ListaPersonajesFragment2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    RecyclerView recyclerView;
    ArrayList<clases> Listaelementos;

    public ListaPersonajesFragment2() {
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
        Listaelementos.add(new clases("Hidrógeno", "El hidrógeno es el elemento químico de número atómico 1, representado por el símbolo H.", R.drawable.hidrogeno));
        Listaelementos.add(new clases("Helio", "El helio, por haberse inferido en 1868 su existencia en la atmósfera solar es un elemento químico de número atómico 2, símbolo He y peso atómico estándar de 4,0026.", R.drawable.helio));
        Listaelementos.add(new clases("Carbono", "El carbono, es un elemento químico con símbolo C, número atómico 6 y masa atómica 12,01. Es un no metal y tetravalente, disponiendo de cuatro electrones para formar enlaces químicos covalentes. ", R.drawable.carbono));
        Listaelementos.add(new clases("Nitrógeno", "El nitrógeno es un elemento químico de número atómico 7, símbolo N, su masa atómica es de 14,006 u y que en condiciones normales forma un gas diatómico (nitrógeno diatómico o molecular) que constituye del orden del 78 % del aire atmosférico.", R.drawable.nitrogeno));
        Listaelementos.add(new clases("Oxígeno", "El oxígeno es un elemento químico de número atómico 8 y representado por el símbolo O.", R.drawable.oxigeno));
        Listaelementos.add(new clases("Flúor", "El flúor es el elemento químico de número atómico 9 situado en el grupo de los halógenos (grupo 17) de la tabla periódica de los elementos.", R.drawable.fluor));
        Listaelementos.add(new clases("Neón", "El neón es un elemento químico de número atómico 10 y símbolo Ne.", R.drawable.neon));
        Listaelementos.add(new clases("Fósforo", "El fósforo es un elemento químico de número atómico 15 y símbolo P. ", R.drawable.fosforo));
        Listaelementos.add(new clases("Azúfre", "El azufre es un elemento químico de número atómico 16 y símbolo S.", R.drawable.azufre));
        Listaelementos.add(new clases("Cloro", "El cloro es un elemento químico de número atómico 17 situado en el grupo de los halógenos (grupo VIIA) de la tabla periódica de los elementos. ", R.drawable.cloro));
        Listaelementos.add(new clases("Argón", "El argón es un elemento químico de número atómico 18 y símbolo Ar. Es el tercero de los gases nobles, incoloro e inerte como ellos, constituye el 0,934 % del aire seco.", R.drawable.argon));
        Listaelementos.add(new clases("Selenio", "El selenio es un elemento químico de la tabla periódica cuyo símbolo es Se y su número atómico 34.", R.drawable.selenio));
        Listaelementos.add(new clases("Bromo", "El bromo (también llamado antaño fuego líquido) es un elemento químico de número atómico 35 situado en el grupo de los halógenos (grupo VII A) de la tabla periódica de los elementos.", R.drawable.bromo));
        Listaelementos.add(new clases("Kriptón", "El kriptón o criptón es un elemento químico de la tabla periódica cuyo símbolo es Kr y su número atómico es 36.", R.drawable.kripton));
        Listaelementos.add(new clases("Yodo", "El yodo o iodo  es un elemento químico de número atómico 53 situado en el grupo de los halógenos (grupo 17) de la tabla periódica de los elementos.", R.drawable.yodo));
        Listaelementos.add(new clases("Xenón", "El xenón es un elemento químico de la tabla periódica cuyo símbolo es Xe y su número atómico el 54.", R.drawable.xenon));
        Listaelementos.add(new clases("Radón", "El radón es un elemento químico perteneciente al grupo de los gases nobles.", R.drawable.radon));



    }
}

