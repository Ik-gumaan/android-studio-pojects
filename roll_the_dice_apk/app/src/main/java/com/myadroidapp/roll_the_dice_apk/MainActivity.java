package com.myadroidapp.roll_the_dice_apk;

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

    public void rollDice(View view){
        TextView diceText=findViewById(R.id.txt_diceNum);
        double randomNum=Math.random()*6+1;
        int randomNumInt=(int)Math.round(randomNum);
        diceText.setText(""+randomNumInt);


    }

}