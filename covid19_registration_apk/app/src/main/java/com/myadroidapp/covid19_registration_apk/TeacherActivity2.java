package com.myadroidapp.covid19_registration_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TeacherActivity2 extends AppCompatActivity {

    Button teacherSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher2);


        teacherSubmitButton=findViewById(R.id.btn_submitTeacherRecord);
        TextView teacherName=findViewById(R.id.inp_teacherName);
        TextView teacherDept=findViewById(R.id.inp_teacherDept);
        TextView teacherVaccinationData=findViewById(R.id.inp_teacherVaccinationData);
        TextView teacherVaccinationName=findViewById(R.id.inp_teacherVaccinationName);

        teacherSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String teacherNameStr=teacherName.getText().toString();
                String teacherDeptStr=teacherDept.getText().toString();
                String teacherVaccinationDataStr=teacherVaccinationData.getText().toString();
                String teacherVaccinationNameStr=teacherVaccinationName.getText().toString();

                Toast.makeText(getApplicationContext(), "Teacher Data:\n\nName: "+teacherNameStr+"\nDepartment: "+teacherDeptStr+"\nVaccinated: "+teacherVaccinationDataStr+"\nVacciniaation Name: "+teacherVaccinationNameStr, Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(getApplicationContext(),ThanksActivity3.class);
                startActivity(intent);
            }
        });

    }
}