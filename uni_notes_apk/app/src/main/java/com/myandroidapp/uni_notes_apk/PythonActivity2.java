package com.myandroidapp.uni_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PythonActivity2 extends AppCompatActivity {

    Button intro;
    Button var;
    Button dataTypes;
    Button operators;
    Button list;
    Button tuple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python2);

        intro=findViewById(R.id.btn_introPython);
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),IntroPythonActivity2.class);
                startActivity(intent);
            }
        });

        var=findViewById(R.id.btn_varPython);
        var.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),VarPythonActivity2.class);
                startActivity(intent);
            }
        });

        dataTypes=findViewById(R.id.btn_data_typesPython);
        dataTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),DataPythonActivity2.class);
                startActivity(intent);
            }
        });

        operators=findViewById(R.id.btn_operatorsPython);
        operators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),OpPythonActivity2.class);
                startActivity(intent);
            }
        });

        list=findViewById(R.id.btn_list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ListPythonActivity2.class);
                startActivity(intent);
            }
        });

        tuple=findViewById(R.id.btn_tuple);
        tuple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),TuplePythonActivity2.class);
                startActivity(intent);
            }
        });
    }
}