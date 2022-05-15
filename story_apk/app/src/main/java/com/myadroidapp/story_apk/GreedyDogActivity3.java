package com.myadroidapp.story_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class GreedyDogActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greedy_dog3);

        WebView web;
        web=findViewById(R.id.web_greedy);

        web.loadUrl("file:///android_asset/greedy.html");

    }
}