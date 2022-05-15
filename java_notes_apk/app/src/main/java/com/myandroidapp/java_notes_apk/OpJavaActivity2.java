package com.myandroidapp.java_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class OpJavaActivity2 extends AppCompatActivity {

    Button back;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op_java2);


        WebView web;
        web=findViewById(R.id.web_opJava);
        web.loadUrl("file:///android_asset/java_operators.html");

        back=findViewById(R.id.btn_backOp);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ChaptersActivity2.class);
                startActivity(intent);
            }
        });

        next=findViewById(R.id.btn_nextOp);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),IfJavaActivity2.class);
                startActivity(intent);
            }
        });


    }
}