package com.myandroidapp.html_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class ParaHtmlActivity2 extends AppCompatActivity {

    Button back;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para_html2);

        WebView web;
        web=findViewById(R.id.web_paraHtml);
        web.loadUrl("file:///android_asset/para.html");

        back=findViewById(R.id.btn_backPara);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),HtmlNotesActivity2.class);
                startActivity(intent);
            }
        });

        next=findViewById(R.id.btn_nextPara);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),LinksHtmlActivity2.class);
                startActivity(intent);
            }
        });



    }
}