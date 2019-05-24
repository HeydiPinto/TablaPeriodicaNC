package com.example.tablaperiodicanc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import devazt.devazt.networking.HttpClient;
import devazt.devazt.networking.OnHttpRequestComplete;
import devazt.devazt.networking.Response;

public class Detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);



        final TextView nombre=(TextView) findViewById(R.id.nombre);//.setText("Cobre");
        final TextView numero=(TextView) findViewById(R.id.dato1);//.setText("No.Atomico x");
        final TextView masa=(TextView) findViewById(R.id.dato2);//.setText("Fam. in");
        final TextView densidad=(TextView) findViewById(R.id.dato3);//.setText("Otro dato");
        final TextView simbolo=(TextView) findViewById(R.id.simboloG);
         final TextView detalles=(TextView) findViewById(R.id.detalles);//.setText("Detale dhfkrbfjkbdfjhvgbkjbdfvb vfkb vuj v rrj bvhb cvj j vj fjj ngf jgk gk gjk gj gj gfj dfgj dfg jdfdgrioyeriañn  ññalsk añlkjh aaña ñandlorem mloe re erljrenmeor ka akaia akai kia kai kai kaia kdbhfvdhgvfujsvdfjsbuhvdgfdhgfvhdjfbsdjbnklsndcd j slhioyeuhje s snushueinsb bae k9ibnikeeeeeeeeeeeeeeeeee hb hbhyjg h   shdhch   bhbhibd vbhi d isi   dsuhiughb jn  kk  akee cixenoxe  xeo  xo x3o 3x ox3 3");


        LinearLayout stackContent;


            //stackContent =(LinearLayout) findViewById(R.id.StackContent);

            HttpClient client = new HttpClient(new OnHttpRequestComplete() {
                @Override
                public void onComplete(Response status) {
                    if(status.isSuccess()){
                        Gson gson = new GsonBuilder().create();
                        String valor=getIntent().getStringExtra("elemento");
                                try {
                                    JSONObject jsono = new JSONObject(status.getResult());
                                    JSONArray jsonarray = jsono.getJSONArray(valor);
                                    ArrayList<Person> personas = new ArrayList<Person>();
                                    for (int i = 0; i < jsonarray.length(); i++) {
                                        String person = jsonarray.getString(i);
                                        Person p = gson.fromJson(person, Person.class);
                                        personas.add(p);
                                        TextView t = new TextView(getBaseContext());
                                        nombre.setText(p.getNombre());
                                        detalles.setText(p.getInfo());
                                        masa.setText(p.getMasa());
                                        numero.setText(p.getN_elemento());
                                        densidad.setText(p.getDensidad());
                                        simbolo.setText(p.getSimbolo());



                                    }
                                } catch (Exception e) {

                                }
                    }
                }
            });
            client.excecute("https://gist.githubusercontent.com/LuisYama/ee8ead37c81de3134714bb0ccac84521/raw/5d184c31b6e5415d84f3c7d27cad94a7d5861248/elementosGeneral.json");




        }
    }

