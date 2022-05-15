package com.myadroidapp.covid19_registration_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StudentActivity2 extends AppCompatActivity {

    Button stdSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student2);


        stdSubmitButton=findViewById(R.id.btn_submitStdRecord);
        TextView stdName=findViewById(R.id.inp_stdName);
        TextView stdRollNo=findViewById(R.id.inp_stdRollNo);
        TextView stdDept=findViewById(R.id.inp_stdDept);
        TextView stdVaccinationData=findViewById(R.id.inp_stdVaccinationData);
        TextView stdVaccinationName=findViewById(R.id.inp_stdVaccinationName);

        stdSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stdNameStr=stdName.getText().toString();
                String stdRollNoStr=stdRollNo.getText().toString();
                String stdDeptStr=stdDept.getText().toString();
                String stdVaccinationDataStr=stdVaccinationData.getText().toString();
                String stdVaccinationNameStr=stdVaccinationName.getText().toString();

                Toast.makeText(getApplicationContext(), "Student Data:\n\nName: "+stdNameStr+"\nRoll No: "+stdRollNoStr+"\nDepartment: "+stdDeptStr+"\nVaccinated: "+stdVaccinationDataStr+"\nVacciniaation Name: "+stdVaccinationNameStr, Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(getApplicationContext(),ThanksActivity3.class);
                startActivity(intent);
            }
        });

    }
}