package com.myandroidapp.java_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class VarJavaActivity2 extends AppCompatActivity {

    Button back;
     Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_var_java2);

        WebView web;
        web=findViewById(R.id.web_varJava);
        web.loadUrl("file:///android_asset/java_variables.html");

        back=findViewById(R.id.btn_backVar);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ChaptersActivity2.class);
                startActivity(intent);
            }
        });

        next=findViewById(R.id.btn_nextVar);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),DataJavaActivity2.class);
                startActivity(intent);
            }
        });

    }
}