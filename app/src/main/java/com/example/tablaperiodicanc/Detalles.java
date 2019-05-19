package com.example.tablaperiodicanc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Detalles extends Fragment {


    public Detalles() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detalles, container, false);

            Toolbar toolbar = (Toolbar) v.findViewById(R.id.toolbar);
                toolbar.inflateMenu(R.menu.activity_menulateral_drawer);

            ((TextView) v.findViewById(R.id.nombre)).setText("Cobre");
            ((TextView) v.findViewById(R.id.dato1)).setText("No.Atomico x");
            ((TextView) v.findViewById(R.id.dato2)).setText("Fam. in");
            ((TextView) v.findViewById(R.id.dato3)).setText("Otro dato");
            //poner imagen


        return v;
    }

}
