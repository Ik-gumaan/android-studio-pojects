package com.myadroidapp.story_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class FoolishStagActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foolish_stag3);

        WebView web;
        web=findViewById(R.id.web_foolish);

        web.loadUrl("file:///android_asset/foolish.html");
    }
}