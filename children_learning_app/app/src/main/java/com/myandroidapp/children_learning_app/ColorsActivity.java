package com.myandroidapp.children_learning_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myandroidapp.children_learning_app.colorFragments.ColorBlackFragment;
import com.myandroidapp.children_learning_app.colorFragments.ColorBlueFragment;
import com.myandroidapp.children_learning_app.colorFragments.ColorBrownFragment;
import com.myandroidapp.children_learning_app.colorFragments.ColorGrayFragment;
import com.myandroidapp.children_learning_app.colorFragments.ColorGreenFragment;
import com.myandroidapp.children_learning_app.colorFragments.ColorOrangeFragment;
import com.myandroidapp.children_learning_app.colorFragments.ColorRedFragment;
import com.myandroidapp.children_learning_app.colorFragments.ColorWhiteFragment;
import com.myandroidapp.children_learning_app.colorFragments.ColorYellowFragment;
import com.myandroidapp.children_learning_app.countingFragments.Counting9Fragment;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        Button black=findViewById(R.id.btn_black);
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.colorFragmentContainerView, ColorBlackFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button blue=findViewById(R.id.btn_blue);
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.colorFragmentContainerView, ColorBlueFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button red=findViewById(R.id.btn_red);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.colorFragmentContainerView, ColorRedFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button green=findViewById(R.id.btn_green);
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.colorFragmentContainerView, ColorGreenFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button gray=findViewById(R.id.btn_gray);
        gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.colorFragmentContainerView, ColorGrayFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button orange=findViewById(R.id.btn_orange);
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.colorFragmentContainerView, ColorOrangeFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button yellow=findViewById(R.id.btn_yellow);
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.colorFragmentContainerView, ColorYellowFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button white=findViewById(R.id.btn_white);
        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.colorFragmentContainerView, ColorWhiteFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button brown=findViewById(R.id.btn_brown);
        brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.colorFragmentContainerView, ColorBrownFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });


    }
}