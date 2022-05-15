package com.myadroidapp.story_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class HareTortoiseActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hare_tortoise3);

        WebView web;
        web=findViewById(R.id.web_hareTortoise);

        web.loadUrl("file:///android_asset/tortoise.html");

    }
}