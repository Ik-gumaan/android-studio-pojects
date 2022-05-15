package com.myandroidapp.java_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChaptersActivity2 extends AppCompatActivity {


    Button intro;
    Button var;
    Button dataTypes;
    Button operators;
    Button ifElse;
    Button loops;
    Button oop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters2);


        intro=findViewById(R.id.btn_introJava);
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),IntroJavaActivity2.class);
                startActivity(intent);
            }
        });

        var=findViewById(R.id.btn_varJava);
        var.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),VarJavaActivity2.class);
                startActivity(intent);
            }
        });

        dataTypes=findViewById(R.id.btn_data_typesJava);
        dataTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),DataJavaActivity2.class);
                startActivity(intent);
            }
        });

        operators=findViewById(R.id.btn_operatorsJava);
        operators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),OpJavaActivity2.class);
                startActivity(intent);
            }
        });

        ifElse=findViewById(R.id.btn_ifElse);
        ifElse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),IfJavaActivity2.class);
                startActivity(intent);
            }
        });

        loops=findViewById(R.id.btn_loops);
        loops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),LoopJavaActivity2.class);
                startActivity(intent);
            }
        });

        oop=findViewById(R.id.btn_oop);
        oop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),OopJavaActivity2.class);
                startActivity(intent);
            }
        });



    }
}