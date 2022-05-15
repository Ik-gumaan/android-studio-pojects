package com.myandroidapp.uni_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class CommandsSqlActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commands_sql2);

        WebView web;
        web = findViewById(R.id.web_commands);
        web.loadUrl("file:///android_asset/sql_commands.html");

    }
}