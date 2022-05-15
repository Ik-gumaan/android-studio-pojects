package com.myandroidapp.children_learning_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myandroidapp.children_learning_app.countingFragments.Counting1Fragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.AFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.BFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.CFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.DFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.EFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.FFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.GFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.HFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.IFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.JFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.KFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.LFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.MFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.NFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.OFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.PFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.QFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.RFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.SFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.TFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.UFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.VFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.WFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.XFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.YFragment;
import com.myandroidapp.children_learning_app.eAlphabetFragments.ZFragment;

public class EAlphabetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ealphabets);

        Button a=findViewById(R.id.btn_a);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, AFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button b=findViewById(R.id.btn_b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, BFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button c=findViewById(R.id.btn_c);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, CFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button d=findViewById(R.id.btn_d);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, DFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button e=findViewById(R.id.btn_e);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, EFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button f=findViewById(R.id.btn_f);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, FFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button g=findViewById(R.id.btn_g);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, GFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button h=findViewById(R.id.btn_h);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, HFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button i=findViewById(R.id.btn_i);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, IFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button j=findViewById(R.id.btn_j);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, JFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button k=findViewById(R.id.btn_k);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, KFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button l=findViewById(R.id.btn_l);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, LFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button m=findViewById(R.id.btn_m);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, MFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button n=findViewById(R.id.btn_n);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, NFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button o=findViewById(R.id.btn_o);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, OFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button p=findViewById(R.id.btn_p);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, PFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button q=findViewById(R.id.btn_q);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, QFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button r=findViewById(R.id.btn_r);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, RFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button s=findViewById(R.id.btn_s);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, SFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button t=findViewById(R.id.btn_t);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, TFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button u=findViewById(R.id.btn_u);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, UFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button v=findViewById(R.id.btn_v);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, VFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button w=findViewById(R.id.btn_w);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, WFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button x=findViewById(R.id.btn_x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, XFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button y=findViewById(R.id.btn_y);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, YFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button z=findViewById(R.id.btn_z);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.eAlphabetFragmentContainerView, ZFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });


    }
}