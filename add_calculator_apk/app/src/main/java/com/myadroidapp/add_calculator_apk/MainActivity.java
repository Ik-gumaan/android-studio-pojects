package com.myadroidapp.add_calculator_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){
        TextView value1=findViewById(R.id.inp_val1);
        String val1=value1.getText().toString();
        int num1=Integer.parseInt(val1);

        TextView value2=findViewById(R.id.inp_val2);
        String val2=value2.getText().toString();
        int num2=Integer.parseInt(val2);

        TextView ans=findViewById(R.id.txt_ans);
        ans.setText("Answer = "+(num1+num2));
    }

}