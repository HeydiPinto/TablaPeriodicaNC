package com.example.tablaperiodicanc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class VistaTabla extends Fragment implements
        View.OnClickListener{


    public VistaTabla() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.vista_tabla, container, false);
        Button h =(Button) view.findViewById(R.id.h);
        Button li =(Button) view.findViewById(R.id.li);
        Button na =(Button) view.findViewById(R.id.na);
        Button k =(Button) view.findViewById(R.id.k);
        Button rb =(Button) view.findViewById(R.id.rb);
        Button cs =(Button) view.findViewById(R.id.cs);
        Button fr =(Button) view.findViewById(R.id.fr);
        Button be =(Button) view.findViewById(R.id.be);
        Button mg =(Button) view.findViewById(R.id.mg);
        Button ca =(Button) view.findViewById(R.id.ca);
        Button sr =(Button) view.findViewById(R.id.sr);
        Button ba =(Button) view.findViewById(R.id.ba);
        h.setOnClickListener(this);
        li.setOnClickListener(this);
        na.setOnClickListener(this);
        k.setOnClickListener(this);
        rb.setOnClickListener(this);
        cs.setOnClickListener(this);
        fr.setOnClickListener(this);
        be.setOnClickListener(this);
        mg.setOnClickListener(this);
        ca.setOnClickListener(this);
        sr.setOnClickListener(this);
        ba.setOnClickListener(this);

        return view;
    }

    public void onClick(View v) {

        Toast.makeText(getContext(),"Click en ",Toast.LENGTH_SHORT).show();

    }

}
