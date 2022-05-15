package com.myadroidapp.story_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class StoriesActivity2 extends AppCompatActivity {

    ImageView foxCrow;
    ImageView honestWoodcutter;
    ImageView thirstyCrow;
    ImageView foolishStag;
    ImageView greedyDog;
    ImageView hareTortoise;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories2);

        foxCrow=findViewById(R.id.img_foxCrow);
        honestWoodcutter=findViewById(R.id.img_honestWoodcutter);
        thirstyCrow=findViewById(R.id.img_thirstyCrow);
        foolishStag=findViewById(R.id.img_foolishStag);
        greedyDog=findViewById(R.id.img_greedyDog);
        hareTortoise=findViewById(R.id.img_hareTortoise);

        foxCrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),FoxCrowActivity3.class);
                startActivity(intent);
            }
        });

        honestWoodcutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),HonestWoodcutterActivity3.class);
                startActivity(intent);
            }
        });

        thirstyCrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ThirstyCrowActivity3.class);
                startActivity(intent);
            }
        });


        foolishStag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),FoolishStagActivity3.class);
                startActivity(intent);
            }
        });


        greedyDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),GreedyDogActivity3.class);
                startActivity(intent);
            }
        });



        hareTortoise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),HareTortoiseActivity3.class);
                startActivity(intent);
            }
        });

    }
}