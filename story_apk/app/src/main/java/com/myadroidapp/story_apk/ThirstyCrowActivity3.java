package com.myadroidapp.story_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ThirstyCrowActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirsty_crow3);

        WebView web;
        web=findViewById(R.id.web_thirsty);

        web.loadUrl("file:///android_asset/thirstycrown.html");

    }
}