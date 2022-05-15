package com.myadroidapp.story_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class FoxCrowActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fox_crow3);

        WebView web;
        web=findViewById(R.id.web_fox);

        web.loadUrl("file:///android_asset/fox.html");

    }
}