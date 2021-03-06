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



public class ListaPersonajesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    RecyclerView recyclerView;
    ArrayList<clases> Listaelementos;

    public ListaPersonajesFragment() {
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
        Listaelementos.add(new clases("Litio", "El litio es un elemento químico de símbolo Li y número atómico 3.", R.drawable.litio));
        Listaelementos.add(new clases("Berilio", "El berilio es un elemento químico de símbolo Be y número atómico 4.", R.drawable.berilio));
        Listaelementos.add(new clases("Aluminio", "El aluminio es un elemento químico, de símbolo Al y número atómico 13.", R.drawable.aluminio));
        Listaelementos.add(new clases("Sodio", "El sodio es un elemento químico de símbolo Na con número atómico 11 que fue aislado por sir Humphry Davy en 1807.", R.drawable.sodio));
        Listaelementos.add(new clases("Magnesio", "El magnesio es el elemento químico de símbolo Mg y número atómico 12. Su masa atómica es de 24,305 u.", R.drawable.magnesio));
        Listaelementos.add(new clases("Aluminio", "El aluminio es un elemento químico, de símbolo Al y número atómico 13. Se trata de un metal no ferromagnético.", R.drawable.aluminio));
        Listaelementos.add(new clases("Potasio", "El potasio es un elemento químico de la tabla periódica cuyo símbolo químico es K, cuyo número atómico es 19.", R.drawable.potasio));
        Listaelementos.add(new clases("Calcio", "El calcio es un elemento químico, de símbolo Ca y de número atómico 20. Su masa atómica es 40,078 u.", R.drawable.calcio));
        Listaelementos.add(new clases("Escandio", "El escandio es un elemento químico de la tabla periódica cuyo símbolo es Sc y su número atómico es 21.", R.drawable.escandio));
        Listaelementos.add(new clases("Titanio", "El titanio es un elemento químico de símbolo Ti y número atómico 22 que se sitúa en el grupo 4 de la tabla periódica de los elementos. ", R.drawable.titanio));
        Listaelementos.add(new clases("Vanadio", "El vanadio es un elemento químico de número atómico 23 situado en el grupo 5 de la tabla periódica de los elementos. ", R.drawable.vanadio));
        Listaelementos.add(new clases("Cromo", "El cromo es un elemento químico de número atómico 24 que se encuentra en el grupo 6 de la tabla periódica de los elementos. ", R.drawable.cromo));
        Listaelementos.add(new clases("Manganeso", "El manganeso es un elemento químico de número atómico 25 situado en el grupo 7 de la tabla periódica de los elementos y se simboliza como Mn.", R.drawable.manganeso));
        Listaelementos.add(new clases("Hierro", "El hierro o fierro es un elemento químico de número atómico 26 situado en el grupo 8, periodo 4 de la tabla periódica de los elementos. ", R.drawable.hierro));
        Listaelementos.add(new clases("Colbato", "El cobalto es un elemento químico de número atómico 27 y símbolo Co situado en el grupo 9 de la tabla periódica de los elementos. ", R.drawable.cobalto));
        Listaelementos.add(new clases("Níquel", "El níquel es un elemento químico cuyo número atómico es 28 y su símbolo es Ni, situado en el grupo 10 de la tabla periódica de los elementos.", R.drawable.niquel));
        Listaelementos.add(new clases("Cobre", "El cobre  cuyo símbolo es Cu, es el elemento químico de número atómico 29.", R.drawable.cobre));
        Listaelementos.add(new clases("Zinc", "El zinc, es un elemento químico esencial de número atómico 30 y símbolo Zn, situado en el grupo 12 de la tabla periódica de los elementos.", R.drawable.cinc));
        Listaelementos.add(new clases("Rubidio", "El rubidio es un elemento químico de la tabla periódica cuyo símbolo es el Rb y su número atómico es 37.", R.drawable.rubidio));
        Listaelementos.add(new clases("Estroncio", "El estroncio es un elemento químico de la tabla periódica cuyo símbolo es Sr y su número atómico es 38.", R.drawable.estroncio));
        Listaelementos.add(new clases("Itrio", "El itrio es un elemento químico de la tabla periódica cuyo símbolo es Y y su número atómico es 39. Su peso atómico es 88,905. ", R.drawable.itrio));
        Listaelementos.add(new clases("Circonio", "El circonio o zirconio es un elemento químico de número atómico 40 y peso atómico 91.224. ", R.drawable.circonio));
        Listaelementos.add(new clases("Niobio", "El niobio es un elemento químico de número atómico 41 situado en el grupo 5 de la tabla periódica de los elementos.", R.drawable.niobio));
        Listaelementos.add(new clases("Molibdeno", "El molibdeno es un elemento químico de número atómico 42 que se encuentra en el grupo 6 de la tabla periódica de los elementos y se simboliza como Mo.", R.drawable.molibdeno));
        Listaelementos.add(new clases("Tecnecio", "El tecnecio es el más ligero de los elementos químicos que no cuentan con isótopos estables y el primer elemento sintético que se encuentra en la tabla periódica.", R.drawable.tecnecio));
        Listaelementos.add(new clases("Rutenio", "El rutenio es un elemento químico de número atómico 44 situado en el grupo 8 de la tabla periódica de los elementos. Su símbolo es Ru.", R.drawable.rutenio));
        Listaelementos.add(new clases("Rodio", "El rodio es un elemento químico de número atómico 45 situado en el grupo 9 de la tabla periódica de los elementos. Su símbolo es Rh.", R.drawable.rodio));
        Listaelementos.add(new clases("Paladio", "El paladio es un elemento químico de número atómico 46 situado en el grupo 10 de la tabla periódica de los elementos. Su símbolo es Pd.", R.drawable.paladio));
        Listaelementos.add(new clases("Plata", "La plata es un elemento químico de número atómico 47 situado en el grupo 11 de la tabla periódica de los elementos.", R.drawable.plata));
        Listaelementos.add(new clases("Cadmio", "El cadmio es un elemento químico de número atómico 48 situado en el grupo 12 de la tabla periódica de los elementos. Su símbolo es Cd. ", R.drawable.cadmio));
        Listaelementos.add(new clases("Indio", "El indio es un elemento químico de número atómico 49 situado en el grupo 13 de la tabla periódica de los elementos. Su símbolo es In. ", R.drawable.indio));
        Listaelementos.add(new clases("Estaño", "El estaño es un elemento químico de símbolo Sn (del latín stannum) y número atómico 50.", R.drawable.estanio));
        Listaelementos.add(new clases("Cesio", "El cesio es el elemento químico con número atómico 55 y peso atómico de 132,905 uma.", R.drawable.cesio));
        Listaelementos.add(new clases("Bario", "El bario es un elemento químico de la tabla periódica cuyo símbolo es Ba y su número atómico es 56.", R.drawable.bario));
        Listaelementos.add(new clases("Lantano", "El lantano es un elemento químico de la tabla periódica cuyo símbolo es La y su número atómico es 57.", R.drawable.lantano));
        Listaelementos.add(new clases("Cerio", "El cerio es un elemento químico de símbolo Ce y número atómico 58.", R.drawable.cerio));
        Listaelementos.add(new clases("Praseodiomio", "El praseodimio es un elemento químico de la tabla periódica cuyo símbolo es Pr y su número atómico es 59.", R.drawable.praseodimio));
        Listaelementos.add(new clases("Neodimio", "El neodimio es un elemento químico cuyo símbolo es Nd y su número atómico es 60.", R.drawable.neodimio));
        Listaelementos.add(new clases("Samario", "El samario es un elemento químico de símbolo Sm y número atómico 62.", R.drawable.samario));
        Listaelementos.add(new clases("Europio", "El europio es un elemento químico de la tabla periódica cuyo símbolo es Eu y su número atómico es 63.", R.drawable.europio));




    }

   }