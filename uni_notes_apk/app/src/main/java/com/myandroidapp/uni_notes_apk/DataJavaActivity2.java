package com.myandroidapp.uni_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DataJavaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_java2);


        WebView web;
        web = findViewById(R.id.web_dataJava);
        web.loadUrl("file:///android_asset/java_data_type.html");

    }
}