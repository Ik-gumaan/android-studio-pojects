package com.myandroidapp.uni_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class OopJavaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_java2);


        WebView web;
        web = findViewById(R.id.web_oopJava);
        web.loadUrl("file:///android_asset/java_oop.html");

    }
}