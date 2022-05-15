package com.myandroidapp.html_notes_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HtmlNotesActivity2 extends AppCompatActivity {

Button intro;
Button ele;
Button para;
Button links;
Button heading;
Button attr;
Button block_inline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_notes2);

        intro=findViewById(R.id.btn_introHtml);
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),IntroHtmlActivity2.class);
                startActivity(intent);
            }
        });

        ele=findViewById(R.id.btn_ele);
        ele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ElementsHtmlActivity2.class);
                startActivity(intent);
            }
        });

        attr=findViewById(R.id.btn_attr);
        attr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AttrHtmlActivity2.class);
                startActivity(intent);
            }
        });

        heading=findViewById(R.id.btn_headings);
        heading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),HeadingsHtmlActivity2.class);
                startActivity(intent);
            }
        });

        para=findViewById(R.id.btn_para);
        para.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ParaHtmlActivity2.class);
                startActivity(intent);
            }
        });

        links=findViewById(R.id.btn_links);
        links.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),LinksHtmlActivity2.class);
                startActivity(intent);
            }
        });

        block_inline=findViewById(R.id.btn_block_inline);
        block_inline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BlockInlineHtmlActivity2.class);
                startActivity(intent);
            }
        });

    }
}