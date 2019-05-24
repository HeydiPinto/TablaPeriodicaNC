package com.example.tablaperiodicanc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


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

        //1
        Button h =(Button) view.findViewById(R.id.h);
        Button li =(Button) view.findViewById(R.id.li);
        Button na =(Button) view.findViewById(R.id.na);
        Button k =(Button) view.findViewById(R.id.k);
        Button rb =(Button) view.findViewById(R.id.rb);
        Button cs =(Button) view.findViewById(R.id.cs);
        Button fr =(Button) view.findViewById(R.id.fr);
        //2
        Button be =(Button) view.findViewById(R.id.be);
        Button mg =(Button) view.findViewById(R.id.mg);
        Button ca =(Button) view.findViewById(R.id.ca);
        Button sr =(Button) view.findViewById(R.id.sr);
        Button ba =(Button) view.findViewById(R.id.ba);
        Button ra =(Button) view.findViewById(R.id.ra);
        //3
        Button sc =(Button) view.findViewById(R.id.sc);
        Button y =(Button) view.findViewById(R.id.y);
        //4
        Button ti =(Button) view.findViewById(R.id.ti);
        Button zr =(Button) view.findViewById(R.id.zr);
        Button hf =(Button) view.findViewById(R.id.hf);
        Button rf =(Button) view.findViewById(R.id.rf);
        //5
        Button v =(Button) view.findViewById(R.id.v);
        Button nb =(Button) view.findViewById(R.id.nb);
        Button ta =(Button) view.findViewById(R.id.ta);
        Button db =(Button) view.findViewById(R.id.db);
        //6
        Button cr =(Button) view.findViewById(R.id.cr);
        Button mo =(Button) view.findViewById(R.id.mo);
        Button w =(Button) view.findViewById(R.id.w);
        Button sg =(Button) view.findViewById(R.id.sg);
        //7
        Button mn =(Button) view.findViewById(R.id.mn);
        Button tc =(Button) view.findViewById(R.id.tc);
        Button re =(Button) view.findViewById(R.id.re);
        Button bh =(Button) view.findViewById(R.id.bh);
        //8
        Button fe =(Button) view.findViewById(R.id.fe);
        Button ru =(Button) view.findViewById(R.id.ru);
        Button os =(Button) view.findViewById(R.id.os);
        Button hs =(Button) view.findViewById(R.id.hs);
        //9
        Button co =(Button) view.findViewById(R.id.co);
        Button rh =(Button) view.findViewById(R.id.rh);
        Button ir =(Button) view.findViewById(R.id.ir);
        Button mt =(Button) view.findViewById(R.id.mt);
        //10
        Button ni =(Button) view.findViewById(R.id.ni);
        Button pd =(Button) view.findViewById(R.id.pd);
        Button pt =(Button) view.findViewById(R.id.pt);
        Button ds =(Button) view.findViewById(R.id.ds);
        //11
        Button cu =(Button) view.findViewById(R.id.cu);
        Button ag =(Button) view.findViewById(R.id.ag);
        Button au =(Button) view.findViewById(R.id.au);
        Button rg =(Button) view.findViewById(R.id.rg);
        //12
        Button zn =(Button) view.findViewById(R.id.zn);
        Button cd =(Button) view.findViewById(R.id.cd);
        Button hg =(Button) view.findViewById(R.id.hg);
        Button da =(Button) view.findViewById(R.id.da);
        //13
        Button b =(Button) view.findViewById(R.id.b);
        Button al =(Button) view.findViewById(R.id.al);
        Button ga =(Button) view.findViewById(R.id.ga);
        Button in =(Button) view.findViewById(R.id.in);
        Button tl =(Button) view.findViewById(R.id.tl);
        Button tf =(Button) view.findViewById(R.id.tf);
        //14
        Button c =(Button) view.findViewById(R.id.c);
        Button sl =(Button) view.findViewById(R.id.j);
        Button ge =(Button) view.findViewById(R.id.ge);
        Button sn =(Button) view.findViewById(R.id.sn);
        Button pb =(Button) view.findViewById(R.id.pb);
        Button eo =(Button) view.findViewById(R.id.eo);
        //15
        Button n =(Button) view.findViewById(R.id.n);
        Button p =(Button) view.findViewById(R.id.p);
        Button as =(Button) view.findViewById(R.id.as);
        Button sb =(Button) view.findViewById(R.id.sb);
        Button bi =(Button) view.findViewById(R.id.bi);
        Button me =(Button) view.findViewById(R.id.me);
        //16
        Button o =(Button) view.findViewById(R.id.o);
        Button s =(Button) view.findViewById(R.id.s);
        Button se =(Button) view.findViewById(R.id.se);
        Button te =(Button) view.findViewById(R.id.te);
        Button po =(Button) view.findViewById(R.id.po);
        Button nc =(Button) view.findViewById(R.id.nc);
        //17
        Button f =(Button) view.findViewById(R.id.f);
        Button cl =(Button) view.findViewById(R.id.cl);
        Button br =(Button) view.findViewById(R.id.br);
        Button i =(Button) view.findViewById(R.id.i);
        Button at =(Button) view.findViewById(R.id.at);
        Button el =(Button) view.findViewById(R.id.el);
        //18
        Button he =(Button) view.findViewById(R.id.he);
        Button ne =(Button) view.findViewById(R.id.ne);
        Button ar =(Button) view.findViewById(R.id.ar);
        Button kr =(Button) view.findViewById(R.id.kr);
        Button xe =(Button) view.findViewById(R.id.xe);
        Button rn =(Button) view.findViewById(R.id.rn);
        Button on =(Button) view.findViewById(R.id.on);
        //f1
        Button la =(Button) view.findViewById(R.id.la);
        Button ce =(Button) view.findViewById(R.id.ce);
        Button pr =(Button) view.findViewById(R.id.pr);
        Button nd =(Button) view.findViewById(R.id.nd);
        Button pm =(Button) view.findViewById(R.id.pm);
        Button sm =(Button) view.findViewById(R.id.sm);
        Button eu =(Button) view.findViewById(R.id.eu);
        Button gd =(Button) view.findViewById(R.id.gd);
        Button tb =(Button) view.findViewById(R.id.tb);
        Button dy =(Button) view.findViewById(R.id.dy);
        Button ho =(Button) view.findViewById(R.id.ho);
        Button er =(Button) view.findViewById(R.id.er);
        Button tm =(Button) view.findViewById(R.id.tm);
        Button yb =(Button) view.findViewById(R.id.yb);
        Button lu =(Button) view.findViewById(R.id.lu);
        //f2
        Button ac =(Button) view.findViewById(R.id.ac);
        Button th =(Button) view.findViewById(R.id.th);
        Button pa =(Button) view.findViewById(R.id.pa);
        Button u =(Button) view.findViewById(R.id.u);
        Button np =(Button) view.findViewById(R.id.np);
        Button pu =(Button) view.findViewById(R.id.pu);
        Button am =(Button) view.findViewById(R.id.am);
        Button cm =(Button) view.findViewById(R.id.cm);
        Button bk =(Button) view.findViewById(R.id.bk);
        Button cf =(Button) view.findViewById(R.id.cf);
        Button es =(Button) view.findViewById(R.id.es);
        Button fm =(Button) view.findViewById(R.id.fm);
        Button md =(Button) view.findViewById(R.id.md);
        Button no =(Button) view.findViewById(R.id.no);
        Button lr =(Button) view.findViewById(R.id.lr);


        //1

        //2
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Berilio");
                startActivity(intent);
            }
        });
        mg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Magnesio");
                startActivity(intent);
            }
        });
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","calcio");
                startActivity(intent);
            }
        });
        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Estroncio");
                startActivity(intent);
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Bario");
                startActivity(intent);
            }
        });
        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Radio");
                startActivity(intent);
            }
        });
        //3
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Escandio");
                startActivity(intent);
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Itrio");
                startActivity(intent);
            }
        });
        //4
        ti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Titanio");
                startActivity(intent);
            }
        });
        zr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Circonio");
                startActivity(intent);
            }
        });
        hf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Hafnio");
                startActivity(intent);
            }
        });
        rf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Rutherfordio");
                startActivity(intent);
            }
        });
        //5
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Vanadio");
                startActivity(intent);
            }
        });
        nb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Niobio");
                startActivity(intent);
            }
        });
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Tántalo");
                startActivity(intent);
            }
        });
        db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Dubnio");
                startActivity(intent);
            }
        });
        //6
        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Cromo");
                startActivity(intent);
            }
        });
        mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Molibdeno");
                startActivity(intent);
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Wolframio");
                startActivity(intent);
            }
        });
        sg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Seaborgio");
                startActivity(intent);
            }
        });
        //7
        mn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Manganeso");
                startActivity(intent);
            }
        });
        tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Tecnecio");
                startActivity(intent);
            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Renio");
                startActivity(intent);
            }
        });
        bh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Bohrio");
                startActivity(intent);
            }
        });
        //8
        fe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Hierro");
                startActivity(intent);
            }
        });
        ru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Rutenio");
                startActivity(intent);
            }
        });
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Osmio");
                startActivity(intent);
            }
        });
        hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Hassio");
                startActivity(intent);
            }
        });
        //9
        co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Cobalto");
                startActivity(intent);
            }
        });
        rh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Rodio");
                startActivity(intent);
            }
        });
        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Iridio");
                startActivity(intent);
            }
        });
        mt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Meitnerio");
                startActivity(intent);
            }
        });
        //10
        ni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Níquel");
                startActivity(intent);
            }
        });
        pd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Paladio");
                startActivity(intent);
            }
        });
        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Platino");
                startActivity(intent);
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Darmstadtio");
                startActivity(intent);
            }
        });
        //11
        cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Cobre");
                startActivity(intent);
            }
        });
        ag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Plata");
                startActivity(intent);
            }
        });
        au.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Oro");
                startActivity(intent);
            }
        });
        rg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Roentgenio");
                startActivity(intent);
            }
        });
        //12
        zn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Zinc");
                startActivity(intent);
            }
        });
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Cadmio");
                startActivity(intent);
            }
        });
        hg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Mercurio");
                startActivity(intent);
            }
        });
        da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Copernicio");
                startActivity(intent);
            }
        });
        //13
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Boro");
                startActivity(intent);
            }
        });
        al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Aluminio");
                startActivity(intent);
            }
        });
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Galio");
                startActivity(intent);
            }
        });
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Indio");
                startActivity(intent);
            }
        });
        tl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Talio");
                startActivity(intent);
            }
        });
        tf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Nihonio");
                startActivity(intent);
            }
        });
        //14
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Carbono");
                startActivity(intent);
            }
        });
        sl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Silicio");
                startActivity(intent);
            }
        });
        ge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Germanio");
                startActivity(intent);
            }
        });
        sn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Estaño");
                startActivity(intent);
            }
        });
        pb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Plomo");
                startActivity(intent);
            }
        });
        eo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Flerovio");
                startActivity(intent);
            }
        });
        //15
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Nitrógeno");
                startActivity(intent);
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Fósforo");
                startActivity(intent);
            }
        });
        as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Arsenico");
                startActivity(intent);
            }
        });
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Antimonio");
                startActivity(intent);
            }
        });
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Bismuto");
                startActivity(intent);
            }
        });
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Moscovio");
                startActivity(intent);
            }
        });
        //16
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Oxígeno");
                startActivity(intent);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Azufre");
                startActivity(intent);
            }
        });
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Selenio");
                startActivity(intent);
            }
        });
        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Teluro");
                startActivity(intent);
            }
        });
        po.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Polonio");
                startActivity(intent);
            }
        });
        nc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Livermorio");
                startActivity(intent);
            }
        });
        //17
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Flúor");
                startActivity(intent);
            }
        });
        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Cloro");
                startActivity(intent);
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Bromo");
                startActivity(intent);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Yodo");
                startActivity(intent);
            }
        });
        at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Astato");
                startActivity(intent);
            }
        });
        el.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Teneso");
                startActivity(intent);
            }
        });
        //18
        he.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Helio");
                startActivity(intent);
            }
        });
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Neón");
                startActivity(intent);
            }
        });
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Argón");
                startActivity(intent);
            }
        });
        kr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Kriptón");
                startActivity(intent);
            }
        });
        xe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Xenón");
                startActivity(intent);
            }
        });
        rn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Radón");
                startActivity(intent);
            }
        });
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Oganeson");
                startActivity(intent);
            }
        });;

        //fila
        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Lantano");
                startActivity(intent);
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Cerio");
                startActivity(intent);
            }
        });
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Praseodimio");
                startActivity(intent);
            }
        });
        nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Neodimio");
                startActivity(intent);
            }
        });
        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Prometio");
                startActivity(intent);
            }
        });
        sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Samario");
                startActivity(intent);
            }
        });
        eu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Europio");
                startActivity(intent);
            }
        });
        gd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Gadolinio");
                startActivity(intent);
            }
        });
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Terbio");
                startActivity(intent);
            }
        });
        dy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Disprosio");
                startActivity(intent);
            }
        });
        ho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Holmio");
                startActivity(intent);
            }
        });
        er.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Erbio");
                startActivity(intent);
            }
        });
        tm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Tulio");
                startActivity(intent);
            }
        });
        yb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Iterbio");
                startActivity(intent);
            }
        });
        lu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Lutecio");
                startActivity(intent);
            }
        });

        //fila2
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Actinio");
                startActivity(intent);
            }
        });
        th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Torio");
                startActivity(intent);
            }
        });
        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Protactinio");
                startActivity(intent);
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Uranio");
                startActivity(intent);
            }
        });
        np.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Neptunio");
                startActivity(intent);
            }
        });
        pu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Plutonio");
                startActivity(intent);
            }
        });
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Americio");
                startActivity(intent);
            }
        });
        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Curio");
                startActivity(intent);
            }
        });
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Berkelio");
                startActivity(intent);
            }
        });
        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Californio");
                startActivity(intent);
            }
        });
        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Einstenio");
                startActivity(intent);
            }
        });
        fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Fermio");
                startActivity(intent);
            }
        });
        md.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Mendelevio");
                startActivity(intent);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Nobelio");
                startActivity(intent);
            }
        });
        lr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Lawrencio");
                startActivity(intent);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Hidrógeno");
                startActivity(intent);
            }
        });
        li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Litio");
                startActivity(intent);
            }
        });
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Sodio");
                startActivity(intent);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Potasio");
                startActivity(intent);
            }
        });
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Rubidio");
                startActivity(intent);
            }
        });
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Cesio");
                startActivity(intent);
            }
        });
        fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Detalle.class);
                intent.putExtra("elemento","Francio");
                startActivity(intent);
            }
        });


        return view;
    }

   public void onClick(View v) {


  /*      Intent intent = new Intent(getContext(), Detalle.class);
        startActivity(intent);
*/
    }

}
