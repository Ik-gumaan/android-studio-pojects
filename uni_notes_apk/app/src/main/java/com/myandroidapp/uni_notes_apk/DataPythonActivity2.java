package com.myandroidapp.uni_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DataPythonActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_python2);

        WebView web;
        web = findViewById(R.id.web_dataPython);
        web.loadUrl("file:///android_asset/python_data_types.html");

    }
}