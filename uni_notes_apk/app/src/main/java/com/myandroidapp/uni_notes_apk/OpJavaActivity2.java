package com.myandroidapp.uni_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class OpJavaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op_java2);


        WebView web;
        web = findViewById(R.id.web_opJava);
        web.loadUrl("file:///android_asset/java_operators.html");

    }
}