package com.myandroidapp.uni_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NotesActivity2 extends AppCompatActivity {

    ImageView java;
    ImageView python;
    ImageView sql;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes2);

        java=findViewById(R.id.img_java);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),JavaActivity2.class);
                startActivity(intent);
            }
        });

        python=findViewById(R.id.img_python);
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),PythonActivity2.class);
                startActivity(intent);
            }
        });

        sql=findViewById(R.id.img_sql);
        sql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),SqlActivity2.class);
                startActivity(intent);
            }
        });



    }
}