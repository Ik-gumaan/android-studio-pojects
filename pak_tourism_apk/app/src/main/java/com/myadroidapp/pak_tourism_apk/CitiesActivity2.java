package com.myadroidapp.pak_tourism_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CitiesActivity2 extends AppCompatActivity {

    ImageView karachi;
    ImageView islamabad;
    ImageView peshawar;
    ImageView quetta;
    ImageView faisalbad;
    ImageView lahore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities2);


        karachi=findViewById(R.id.img_khi);
        karachi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),KarachiActivity3.class);
                startActivity(intent);
            }
        });

        islamabad=findViewById(R.id.img_isl);
        islamabad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),IslamabadActivity3.class);
                startActivity(intent);
            }
        });

        peshawar=findViewById(R.id.img_peshawar);
        peshawar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),PeshawarActivity3.class);
                startActivity(intent);
            }
        });

        quetta=findViewById(R.id.img_quetta);
       quetta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),QuettaActivity3.class);
                startActivity(intent);
            }
        });

        faisalbad=findViewById(R.id.img_faisalabad);
        faisalbad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),FaisalabadActivity3.class);
                startActivity(intent);
            }
        });

        karachi=findViewById(R.id.img_khi);
        karachi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),KarachiActivity3.class);
                startActivity(intent);
            }
        });


    }
}