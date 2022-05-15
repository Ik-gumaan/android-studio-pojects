package com.myadroidapp.login_ui_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printEmailPassword(View view){
        TextView loginEmail=findViewById(R.id.inp_email);
        String email=loginEmail.getText().toString();

        TextView loginPass=findViewById(R.id.inp_pass);
        String pass=loginPass.getText().toString();

        Toast.makeText(this, "Email: "+email+"\nPassword:"+pass, Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, pass, Toast.LENGTH_SHORT).show();

    }

}