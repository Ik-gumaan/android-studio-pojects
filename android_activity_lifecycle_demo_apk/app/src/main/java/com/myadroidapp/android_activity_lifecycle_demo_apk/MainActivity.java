package com.myadroidapp.android_activity_lifecycle_demo_apk;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"onCreate Activity Started",Toast.LENGTH_LONG).show();
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart Activity Started",Toast.LENGTH_LONG).show();
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume Activity Started",Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause Activity Started",Toast.LENGTH_LONG).show();
    }

    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop Activity Started",Toast.LENGTH_LONG).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy Activity Started",Toast.LENGTH_LONG).show();
    }

}