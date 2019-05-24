package com.example.tablaperiodicanc;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class EMetaloide extends Activity {

    private String lenguajeProgramacion[]=new String[]
            {
                    "5 ,B ,Boro",
                    "14 ,Si ,Silicio",
                    "32 ,Ge ,Germanio",
                    "33 ,As ,Arsénico",
                    "51 ,Sb ,Antimonio",
                    "52 ,Te ,Telurio",
                    "85 ,At, Polonio"
            };




    private Integer[] imgid={
            R.drawable.bor,
            R.drawable.sili,
            R.drawable.germa,
            R.drawable.arse,
            R.drawable.antimon,
            R.drawable.telu,
            R.drawable.polonio,

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
                "Boro",
                "Silicio",
                "Germanio",
                "Arsénico",
                "Antimonio",
                "Telurio",
                "Polonio"



             */
