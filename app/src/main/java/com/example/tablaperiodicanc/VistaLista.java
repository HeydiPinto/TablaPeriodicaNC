package com.example.tablaperiodicanc;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class VistaLista extends Fragment {


    public VistaLista() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_vista_lista, container, false);
                TabLayout tabLayout=(TabLayout) view.findViewById(R.id.tabs);
        ViewPager Pager=(ViewPager)view.findViewById(R.id.viewpager);

        tabPagerAdapter tabPagerAdapter= new tabPagerAdapter(getActivity().getSupportFragmentManager());
        Pager.setAdapter(tabPagerAdapter);
        tabLayout.setupWithViewPager(Pager);


        // Inflate the layout for this fragment
        return view;
    }

}
