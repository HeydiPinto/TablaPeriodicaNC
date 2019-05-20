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
public class EMetaloide extends Fragment {




    public EMetaloide() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_emetaloide, container, false);

        String[] menuItems =

                {"Boro",
                        "Silicio",
                        "Germanio",
                        "Arsénico",
                "Antimonio",
                "Telurio",
                "Polonio"};
        ListView listView =  view.findViewById(R.id.mainMenu);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );

        listView.setAdapter(listViewAdapter);

        // Inflate the layout for this fragment
        return   view;
    }

}
