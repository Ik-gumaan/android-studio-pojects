package com.myandroidapp.children_learning_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myandroidapp.children_learning_app.uAlphabetFragments.AinFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.AlifFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.AlifMaddaFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.BayFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.ChayFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.DaalFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.DdaalFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.FayFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.GafFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.GainFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.HahFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.HamzaFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.HayFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.JeemFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.KafFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.KhayFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.LamFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.MeemFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.NoonFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.PayFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.QafFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.RayFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.RrayFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.SayFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.SeenFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.SheenFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.SwadFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.TayFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.ToenFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.TtayFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.WowFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.YayFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.ZaalFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.ZayFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.ZoenFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.ZuadFragment;
import com.myandroidapp.children_learning_app.uAlphabetFragments.ZzayFragment;

public class UAlphabetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ualphabets);

        Button alif=findViewById(R.id.btn_alif);
        alif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, AlifFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button alifMadda=findViewById(R.id.btn_alifMadda);
        alifMadda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, AlifMaddaFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button bay=findViewById(R.id.btn_bay);
        bay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, BayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button pay=findViewById(R.id.btn_pay);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, PayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button tay=findViewById(R.id.btn_tay);
        tay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, TayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button ttay=findViewById(R.id.btn_ttay);
        ttay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, TtayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button say=findViewById(R.id.btn_say);
        say.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, SayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button jeem=findViewById(R.id.btn_jeem);
        jeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, JeemFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button chay=findViewById(R.id.btn_chay);
        chay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, ChayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button hay=findViewById(R.id.btn_hay);
        hay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, HayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button khay=findViewById(R.id.btn_khay);
        khay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, KhayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button daal=findViewById(R.id.btn_daal);
        daal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, DaalFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button ddaal=findViewById(R.id.btn_ddaal);
        ddaal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, DdaalFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button zaal=findViewById(R.id.btn_zaal);
        zaal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, ZaalFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button ray=findViewById(R.id.btn_ray);
        ray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, RayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button rray=findViewById(R.id.btn_rray);
        rray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, RrayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button zay=findViewById(R.id.btn_zay);
        zay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, ZayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button zzay=findViewById(R.id.btn_zzay);
        zzay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, ZzayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button seen=findViewById(R.id.btn_seen);
        seen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, SeenFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button sheen=findViewById(R.id.btn_sheen);
        sheen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, SheenFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button swad=findViewById(R.id.btn_swad);
        swad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, SwadFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button zuad=findViewById(R.id.btn_zuad);
        zuad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, ZuadFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button toen=findViewById(R.id.btn_toen);
        toen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, ToenFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button zoen=findViewById(R.id.btn_zoen);
        zoen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, ZoenFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button ain=findViewById(R.id.btn_ain);
        ain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, AinFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button gain=findViewById(R.id.btn_gain);
        gain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, GainFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button fay=findViewById(R.id.btn_fay);
        fay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, FayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button qaf=findViewById(R.id.btn_qaf);
        qaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, QafFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button kaf=findViewById(R.id.btn_kaf);
        kaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, KafFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button gaf=findViewById(R.id.btn_gaf);
        gaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, GafFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button lam=findViewById(R.id.btn_lam);
        lam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, LamFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button meem=findViewById(R.id.btn_meem);
        meem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, MeemFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button noon=findViewById(R.id.btn_noon);
        noon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, NoonFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button wow=findViewById(R.id.btn_wow);
        wow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, WowFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button hah=findViewById(R.id.btn_hah);
        hah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, HahFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button hamza=findViewById(R.id.btn_hamza);
        hamza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, HamzaFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button yay=findViewById(R.id.btn_yay);
        yay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.uAlphabetFragmentContainerView, YayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });



    }
}