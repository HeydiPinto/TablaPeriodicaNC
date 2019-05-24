package com.example.tablaperiodicanc;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class tabPagerAdapter extends FragmentStatePagerAdapter {


    String[] tabarray= new String[]{"Metales" ,"No metales","Metaloides"};
    Integer tabNumber=3;

    public tabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                ListaPersonajesFragment Lista= new ListaPersonajesFragment();
                return Lista;
            case 1:
                ListaPersonajesFragment2 Lista2= new ListaPersonajesFragment2();
                return Lista2;
            case 2:
                ListaPersonajesFragment3 Lista3= new ListaPersonajesFragment3();
                return Lista3;

        }

        return null;
    }

    @Override
    public int getCount() {
        return tabNumber;
    }
}
