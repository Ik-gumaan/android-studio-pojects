package com.myandroidapp.uni_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SqlActivity2 extends AppCompatActivity {

    Button intro;
    Button commands;
    Button ddl;
    Button dml;
    Button dql;
    Button dcl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql2);

        intro=findViewById(R.id.btn_introSql);
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),IntroSqlActivity2.class);
                startActivity(intent);
            }
        });

        commands=findViewById(R.id.btn_commands);
        commands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),CommandsSqlActivity2.class);
                startActivity(intent);
            }
        });

        ddl=findViewById(R.id.btn_ddl);
        ddl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),DdlSqlActivity2.class);
                startActivity(intent);
            }
        });

        dml=findViewById(R.id.btn_dml);
        dml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),DmlSqlActivity2.class);
                startActivity(intent);
            }
        });

        dql=findViewById(R.id.btn_dql);
        dql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),DqlSqlActivity2.class);
                startActivity(intent);
            }
        });

        dcl=findViewById(R.id.btn_dcl);
        dcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),DclSqlActivity2.class);
                startActivity(intent);
            }
        });

    }
}