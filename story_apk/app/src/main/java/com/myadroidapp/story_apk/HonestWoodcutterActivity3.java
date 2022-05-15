package com.myadroidapp.story_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class HonestWoodcutterActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honest_woodcutter3);

        WebView web;
        web=findViewById(R.id.web_honest);

        web.loadUrl("file:///android_asset/honest.html");

    }
}