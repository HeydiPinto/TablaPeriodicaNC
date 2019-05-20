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
public class EMetal extends Fragment {


    public EMetal() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_emetal, container, false);

        String[] menuItems3 = {
            "Litio",
            "Berilio",
            "Aluminio",
            "Sosio"

        } ;

        ListView listView =  view.findViewById(R.id.mainMenu3);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems3
        );

        listView.setAdapter(listViewAdapter);


        // Inflate the layout for this fragment
        return  view;
    }

}