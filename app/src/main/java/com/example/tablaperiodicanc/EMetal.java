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
public class EMetal extends Activity {

    private String lenguajeProgramacion[]=new String[]
            {       "3 ,Li, Litio",
                    "4 ,Be, Berilio",
                    "11 ,Na, Sodio",
                    "12 ,Mg, Magnesio" ,
                    "13 ,Al, Aluminio",
                    "19 ,K ,Potasio",
                    "20 ,Ca ,Calcio",
                    "21 ,Sc ,Escandio",
                    "22 ,Ti, Titanio",
                    "23 ,V ,Vanadio",

                    "24 ,Cr ,Cromo",
                    "25 ,Mm ,Manganeso",
                    "26 ,Fe ,Hierro",
                    "27 ,Co ,Colbato",
                    "28 ,Ni ,Níquel",
                    "29 ,Cu ,Cobre",
                    "30 ,Zn ,Cinc",
                    "31 ,Ga ,Galio",
                    "37 ,Rb ,Rubidio",
                    "38 ,Sr ,Estroncio",

                    "39 ,Y ,Itrio",
                    "40 ,Zr ,Circonio",
                    "41 ,Nb ,Niobio",
                    "42 ,Mo ,Molibdeno",
                    "43 ,Tc ,Tecnecio",
                    "44 ,RU ,Rutecio",
                    "45 ,Rh ,Rodio",
                    "46 ,Pd ,Paladio",
                    "47 ,Ag ,Plata",
                    "48 ,Cd ,Cadmio",

                    "49 ,In ,Indio",
                    "50 ,Sn ,Estaño",
                    "55 ,Cs ,Cesio",
                    "56 ,Ba ,Bario",
                    "57 ,La ,Lantano",
                    "58 ,Ce ,Cerio",
                    "59 ,Pr , Praseodiomio",
                    "60 ,Nd ,Neodimio",
                    "61 ,Pm ,Prometio",
                    "62 ,Sm ,Samario",

                    "63 ,Eu ,Europio",
                    "64 ,Gd ,Gadolio",
                    "65 ,Tb ,Terbio",
                    "66 ,Dy ,Disprosio",
                    "67 ,Ho ,Holmio",
                    "68 ,Er ,Erbio",
                    "69 ,Tm ,Tulio",
                    "70 ,Yb ,Iterbio",
                    "71 ,Lu ,Lutecio",
                    "72 ,Hf ,Hafnio",

                    "73 ,Ta ,Tantalio",
                    "74 ,W ,Wolframio",
                    "75 ,Re, Renio",
                    "76 ,Os ,Osmio",
                    "77 ,Ir ,Iridio",
                    "78 ,Pt ,Platino",
                    "79 ,Au ,Oro",
                    "80 ,Hg ,Mercurio",
                    "81 ,Ti ,Talio",
                    "82 ,Pb ,Plomo",

                    "83 ,Bi ,Bismuto",
                    "84 ,Po ,Polonio",
                    "87 ,Fr ,Francio",
                    "88 ,Ra ,Radio",
                    "89 ,Ac ,Actinio",
                    "90 ,Th ,Torio",
                    "91 ,Pa ,Protactinio",
                    "92 ,U ,Uranio",
                    "93 ,Np, Neptunio",
                    "94 ,Pu ,Plutonio",

                    "95 ,Am ,Amercio",
                    "96 ,Cm ,Curio",
                    "97 ,Bk ,Berkelio",
                    "98 ,Cf ,Californio",
                    "99 ,Es ,Einstenio",
                    "100 ,Fm ,Fermio",
                    "101 ,Md ,Mendelevio",
                    "102 ,No ,Nobelio",
                    "103 ,Lr ,Lawrencio",
                    "104 ,Rf ,Rutherfordio",
                    "105 ,Db ,Dubnio",
                    "106 ,Sg ,Seaborgio",
                    "107 ,Bh ,Bohrio",
                    "108 ,Hs ,Hassio",
                    "109 ,Mt ,Meitnerio",
                    "110 ,Ds ,Darmstatio",
                    "111 ,Rg ,Roentgenio",
                    "112 ,Cn ,Copernicio",
                    "113 ,Nh ,Nihonium",
                    "114 ,Fl ,Flerovio",
                    "115 ,Mc ,Moscovium",
                    "116 ,Lv ,Livermorio",
                    "117 ,Ts ,Tennessine",
                    "118, Og ,Oganesson"};




    private Integer[] imgid={
            R.drawable.litio,
            R.drawable.berilio,
            R.drawable.sodio,
            R.drawable.magnesio,
            R.drawable.aluminio,
            R.drawable.potasio,
            R.drawable.calcio,
            R.drawable.escandio,
            R.drawable.titanio,
            R.drawable.vanadio,

            R.drawable.cromo,
            R.drawable.manganeso,
            R.drawable.hierro,
            R.drawable.cobalto,
            R.drawable.niquels,
            R.drawable.cobre,
            R.drawable.zinc,
            R.drawable.galio,
            R.drawable.rubidio,
            R.drawable.estroncio,

            R.drawable.itrio,
            R.drawable.circonio,
            R.drawable.niobio,
            R.drawable.molibdeno,
            R.drawable.tecnecio,
            R.drawable.rutenio,
            R.drawable.radio,
            R.drawable.paladio,
            R.drawable.plata,
            R.drawable.cadmio,

            R.drawable.indio,
            R.drawable.estanos,
            R.drawable.cesio,
            R.drawable.barios,
            R.drawable.lantano,
            R.drawable.cerio,
            R.drawable.praseodimio,
            R.drawable.neodimio,
            R.drawable.prometio,
            R.drawable.samario,

            R.drawable.europio,
            R.drawable.gadolinio,
            R.drawable.terbio,
            R.drawable.ds,
            R.drawable.ho,
            R.drawable.er,
            R.drawable.tm,
            R.drawable.ir,
            R.drawable.lu,
            R.drawable.hf,

            R.drawable.titanio,
            R.drawable.w,
            R.drawable.re,
            R.drawable.os,
            R.drawable.ir,
            R.drawable.pt,
            R.drawable.au,
            R.drawable.mc,
            R.drawable.ta,
            R.drawable.pb,

            R.drawable.bi,
            R.drawable.polonio,
            R.drawable.fr,
            R.drawable.radio,
            R.drawable.ac,
            R.drawable.th,
            R.drawable.pa,
            R.drawable.u,
            R.drawable.np,
            R.drawable.titanio,

            R.drawable.pu,
            R.drawable.am,
            R.drawable.cm,
            R.drawable.bk,
            R.drawable.cf,
            R.drawable.cf,
            R.drawable.es,
            R.drawable.fm,
            R.drawable.md,
            R.drawable.no,

            R.drawable.lr,
            R.drawable.rf,
            R.drawable.dubnio,
            R.drawable.sg,
            R.drawable.bh,
            R.drawable.hs,
            R.drawable.mt,
            R.drawable.ds,
            R.drawable.rg,
            R.drawable.cn,

            R.drawable.nh,
            R.drawable.fl,
            R.drawable.mc,
            R.drawable.lv,
            R.drawable.ts,
            R.drawable.og,
            R.drawable.es,
            R.drawable.fm,
            R.drawable.md,
            R.drawable.no,


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
            "Litio",
            "Berilio",
            "Aluminio",
            "Sodio",
                "Magnesio" ,
                "Aluminio",
                "Potasio",
                "Calcio",
                "Escandio",
                "Titanio",
                "Vanadio",
                "Cromo",
                "Manganeso",
                "Hierro",
                "Colbato",
                "Níquel",
                "Cobre",
                "Cinc",
                "Galio",
                "Rubidio",
                "Estroncio",
                "Itrio",
                "Circonio",
                "Niobio",
                "Molibdeno",
                "Tecnecio",
                "Rutecio",
                "Rodio",
                "Paladio",
                "Plata",
                "Cadmio",
                "Indio",
                "Estaño",
                "Cesio",
                "Bario",
                "Lantano",
                "Cerio",
                "Praseodiomio",
                "Neodimio",
                "Prometio",
                "Samario",
                "Europio",
                "Gadolio",
                "Terbio",
                "Disprosio",
                "Holmio",
                "Erbio",
                "Tulio",
                "Iterbio",
                "Lutecio",
                "Hafnio",
                "Tantalio",
                "Wolframio",
                "Renio",
                "Osmio",
                "Iridio",
                "Platino",
                "Oro",
                "Mercurio",
                "Talio",
                "Plomo",
                "Bismuto",
                "Polonio",
                "Francio",
                "Radio",
                "Actinio",
                "Torio",
                "Protactinio",
                "Uranio",
                "Neptunio",
                "Plutonio",
                "Amercio",
                "Curio",
                "Berkelio",
                "Californio",
                "Einstenio",
                "Fermio",
                "Mendelevio",
                "Nobelio",
                "Lawrencio",
                "Rutherfordio",
                "Dubnio",
                "Seaborgio",
                "Bohrio",
                "Hassio",
                "Meitnerio",
                "Darmstatio",
                "Roentgenio",
                "Copernicio",
                "Nihonium",
                "Flerovio",
                "Moscovium",
                "Livermorio",
                "Tennessine",
                "Oganesson"

       */


