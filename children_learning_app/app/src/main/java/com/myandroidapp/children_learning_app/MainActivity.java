package com.myandroidapp.children_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgEAlphabets=findViewById(R.id.img_eAlphabets);
        imgEAlphabets.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(getApplicationContext(),EAlphabetsActivity.class);
            startActivity(intent);

        }
    });

        ImageView imgUAlphabets=findViewById(R.id.img_uAlphabets);
        imgUAlphabets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),UAlphabetsActivity.class);
                startActivity(intent);

            }
        });

        ImageView imgCounting=findViewById(R.id.img_counting);
        imgCounting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),CountingActivity.class);
                startActivity(intent);

            }
        });

        ImageView imgShapes=findViewById(R.id.img_shapes);
        imgShapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ShapesActivity.class);
                startActivity(intent);

            }
        });

        ImageView imgColors=findViewById(R.id.img_colors);
        imgColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ColorsActivity.class);
                startActivity(intent);

            }
        });
    }
}