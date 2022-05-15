package com.myandroidapp.java_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class IntroJavaActivity2 extends AppCompatActivity {

    Button back;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_java2);

        WebView web;
        web=findViewById(R.id.web_introJava);
        web.loadUrl("file:///android_asset/java_intro.html");

        back=findViewById(R.id.btn_backIntro);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ChaptersActivity2.class);
                startActivity(intent);
            }
        });

        next=findViewById(R.id.btn_nextIntro);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),VarJavaActivity2.class);
                startActivity(intent);
            }
        });

    }
}