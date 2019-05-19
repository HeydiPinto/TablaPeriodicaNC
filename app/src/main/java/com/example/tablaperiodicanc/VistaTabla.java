package com.example.tablaperiodicanc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


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
        Button sl =(Button) view.findViewById(R.id.sl);
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
        h.setOnClickListener(this);
        li.setOnClickListener(this);
        na.setOnClickListener(this);
        k.setOnClickListener(this);
        rb.setOnClickListener(this);
        cs.setOnClickListener(this);
        fr.setOnClickListener(this);
        //2
        be.setOnClickListener(this);
        mg.setOnClickListener(this);
        ca.setOnClickListener(this);
        sr.setOnClickListener(this);
        ba.setOnClickListener(this);
        ra.setOnClickListener(this);
        //3
        sc.setOnClickListener(this);
        y.setOnClickListener(this);
        //4
        ti.setOnClickListener(this);
        zr.setOnClickListener(this);
        hf.setOnClickListener(this);
        rf.setOnClickListener(this);
        //5
        v.setOnClickListener(this);
        nb.setOnClickListener(this);
        ta.setOnClickListener(this);
        db.setOnClickListener(this);
        //6
        cr.setOnClickListener(this);
        mo.setOnClickListener(this);
        w.setOnClickListener(this);
        sg.setOnClickListener(this);
        //7
        mn.setOnClickListener(this);
        tc.setOnClickListener(this);
        re.setOnClickListener(this);
        bh.setOnClickListener(this);
        //8
        fe.setOnClickListener(this);
        ru.setOnClickListener(this);
        os.setOnClickListener(this);
        hs.setOnClickListener(this);
        //9
        co.setOnClickListener(this);
        rh.setOnClickListener(this);
        ir.setOnClickListener(this);
        mt.setOnClickListener(this);
        //10
        ni.setOnClickListener(this);
        pd.setOnClickListener(this);
        pt.setOnClickListener(this);
        ds.setOnClickListener(this);
        //11
        cu.setOnClickListener(this);
        ag.setOnClickListener(this);
        au.setOnClickListener(this);
        rg.setOnClickListener(this);
        //12
        zn.setOnClickListener(this);
        cd.setOnClickListener(this);
        hg.setOnClickListener(this);
        da.setOnClickListener(this);
        //13
        b.setOnClickListener(this);
        al.setOnClickListener(this);
        ga.setOnClickListener(this);
        in.setOnClickListener(this);
        tl.setOnClickListener(this);
        tf.setOnClickListener(this);
        //14
        c.setOnClickListener(this);
        sl.setOnClickListener(this);
        ge.setOnClickListener(this);
        sn.setOnClickListener(this);
        pb.setOnClickListener(this);
        eo.setOnClickListener(this);
        //15
        n.setOnClickListener(this);
        p.setOnClickListener(this);
        as.setOnClickListener(this);
        sb.setOnClickListener(this);
        bi.setOnClickListener(this);
        me.setOnClickListener(this);
        //16
        o.setOnClickListener(this);
        s.setOnClickListener(this);
        se.setOnClickListener(this);
        te.setOnClickListener(this);
        po.setOnClickListener(this);
        nc.setOnClickListener(this);
        //17
        f.setOnClickListener(this);
        cl.setOnClickListener(this);
        br.setOnClickListener(this);
        i.setOnClickListener(this);
        at.setOnClickListener(this);
        el.setOnClickListener(this);
        //18
        he.setOnClickListener(this);
        ne.setOnClickListener(this);
        ar.setOnClickListener(this);
        kr.setOnClickListener(this);
        xe.setOnClickListener(this);
        rn.setOnClickListener(this);
        on.setOnClickListener(this);

        //fila
        la.setOnClickListener(this);
        ce.setOnClickListener(this);
        pr.setOnClickListener(this);
        nd.setOnClickListener(this);
        pm.setOnClickListener(this);
        sm.setOnClickListener(this);
        eu.setOnClickListener(this);
        gd.setOnClickListener(this);
        tb.setOnClickListener(this);
        dy.setOnClickListener(this);
        ho.setOnClickListener(this);
        er.setOnClickListener(this);
        tm.setOnClickListener(this);
        yb.setOnClickListener(this);
        lu.setOnClickListener(this);

        //fila2
        ac.setOnClickListener(this);
        th.setOnClickListener(this);
        pa.setOnClickListener(this);
        u.setOnClickListener(this);
        np.setOnClickListener(this);
        pu.setOnClickListener(this);
        am.setOnClickListener(this);
        cm.setOnClickListener(this);
        bk.setOnClickListener(this);
        cf.setOnClickListener(this);
        es.setOnClickListener(this);
        fm.setOnClickListener(this);
        md.setOnClickListener(this);
        no.setOnClickListener(this);
        lr.setOnClickListener(this);


        return view;
    }

    public void onClick(View v) {

        Toast.makeText(getContext(),"Click en ",Toast.LENGTH_SHORT).show();

    }

}
