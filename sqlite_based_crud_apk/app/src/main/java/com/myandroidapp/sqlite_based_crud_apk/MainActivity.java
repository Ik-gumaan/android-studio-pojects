package com.myandroidapp.sqlite_based_crud_apk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper DB=new DBHelper(this);

        EditText name=findViewById(R.id.inp_name);
        EditText contact=findViewById(R.id.inp_contact);
        EditText dob=findViewById(R.id.inp_dob);

        Button insert,update,delete,view;

        insert=findViewById(R.id.btn_insert);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameStr=name.getText().toString();
                String contactStr=contact.getText().toString();
                String dobStr=dob.getText().toString();


                Boolean checkDBInsertOp=DB.insertUserData(nameStr,contactStr,dobStr);
                if(checkDBInsertOp==true){
                Toast.makeText(getApplicationContext(),"Record Inserted Succesfully",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Unable to Insert Record",Toast.LENGTH_SHORT).show();
                }

            }
        });


        update=findViewById(R.id.btn_update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameStr=name.getText().toString();
                String contactStr=contact.getText().toString();
                String dobStr=dob.getText().toString();


                Boolean checkDBUpdateOp=DB.updateUserData(nameStr,contactStr,dobStr);
                if(checkDBUpdateOp==true){
                    Toast.makeText(getApplicationContext(),"Record Updated Succesfully",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Unable to Update Record",Toast.LENGTH_SHORT).show();
                }

            }
        });

        delete=findViewById(R.id.btn_delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameStr=name.getText().toString();

                Boolean checkDBDeleteOp=DB.deleteUserData(nameStr);
                if(checkDBDeleteOp==true){
                    Toast.makeText(getApplicationContext(),"Record Deleted Succesfully",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Unable to Delete Record",Toast.LENGTH_SHORT).show();
                }

            }
        });

        view=findViewById(R.id.btn_view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Cursor records=DB.viewUserData();
                if(records.getCount()==0){
                    Toast.makeText(getApplicationContext(),"No Data Found",Toast.LENGTH_SHORT).show();
                    return;
                }

                StringBuffer allRecords=new StringBuffer();
                while (records.moveToNext()){
                    allRecords.append("Name: "+records.getString(0)+"\n");
                    allRecords.append("Contact: "+records.getString(1)+"\n");
                    allRecords.append("DOB: "+records.getString(2)+"\n");
                }

                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("All Records");
                builder.setMessage(allRecords.toString());
                builder.show();

            }
        });

    }
}