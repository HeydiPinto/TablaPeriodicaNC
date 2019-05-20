package com.example.tablaperiodicanc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ENometal extends Fragment {


    public ENometal() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =   inflater.inflate(R.layout.fragment_enometal, container, false);
        String[] menuItems2 = {
                "Hidrogeno",
                "Helio",
                "Carbono",
                "Nitrogeno",
                "Oxígeno",
                "Flúor",
                "Neón",
                "Fósforo",
                "Azúfre",
                "Cloro",
                "Argón",
                "Selenio",
                "Bromo",
                "Kriptón",
                "Yodo",
                "Xenón",
                "Radón"
        }  ;

        ListView listView =  view.findViewById(R.id.mainMenu2);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems2
        );

        listView.setAdapter(listViewAdapter);

        // Inflate the layout for this fragment
        return view;
    }

}
