package com.myandroidapp.html_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class BlockInlineHtmlActivity2 extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block_inline_html2);

        WebView web;
        web=findViewById(R.id.web_blockInlineHtml);
        web.loadUrl("file:///android_asset/block and inline.html");

        back=findViewById(R.id.btn_backBlockInline);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),HtmlNotesActivity2.class);
                startActivity(intent);
            }
        });


    }
}