package com.example.tablaperiodicanc;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ENometal extends Activity {

    private String lenguajeProgramacion[]=new String[]
            {       "1 ,H ,Hidrogeno",
                    "2 ,He ,Helio",
                    "6 ,C ,Carbono",
                    "7 ,N ,Nitrogeno",
                    "8 ,O ,Oxígeno",
                    "9 ,F ,Flúor",
                    "10 ,Ne ,Neón",
                    "15, P,Fósforo",
                    "16,S ,Azúfre",
                    "17 ,Cl ,Cloro",
                    "18 ,Ar  ,Argón",
                    "34 ,Se ,Selenio",
                    "45 ,Br ,Bromo",
                    "18 ,Kr ,Kriptón",
                    "53 ,I ,Yodo",
                    "54 ,Xe, Xenón",
                    "86 ,Rn ,Radón"};




    private Integer[] imgid={
            R.drawable.hidrogeno,
            R.drawable.helio,
            R.drawable.carbono,
            R.drawable.nitrogeno,
            R.drawable.oxigeno,
            R.drawable.fluors,
            R.drawable.neon,
            R.drawable.fosforos,
            R.drawable.azufre,
            R.drawable.cloro,
            R.drawable.argon,
            R.drawable.selenio,
            R.drawable.bromo,
            R.drawable.kripton,
            R.drawable.yodo,
            R.drawable.xenon,
            R.drawable.ra
    };

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdaptadorMetaloide adapter=new AdaptadorMetaloide(this,lenguajeProgramacion,imgid);
        lista=(ListView)findViewById(R.id.mainMenu);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Slecteditem= lenguajeProgramacion[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}









/*
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
        */


