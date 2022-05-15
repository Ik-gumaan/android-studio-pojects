package com.myandroidapp.sqlite_based_crud_apk;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(@Nullable Context context) {
        super(context,"MyCrudAppDatabase.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE UserRecord(NAME Text PRIMARY KEY,CONTACT Text,DOB Text)");
        db.execSQL("INSERT INTO UserRecord  ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS UserRecord");
    }

    public boolean insertUserData(String name,String contact,String dob){
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues contentValues=new ContentValues();
        contentValues.put("NAME",name);
        contentValues.put("CONTACT",contact);
        contentValues.put("DOB",dob);

        Long result=db.insert("UserRecord",null,contentValues);

        if(result==-1){
            return false;
        }
        else{
            return true;
        }

    }


    public boolean updateUserData(String name,String contact,String dob){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("CONTACT",contact);
        contentValues.put("DOB",dob);

        Cursor currentRecord=db.rawQuery("SELECT * FROM UserRecord WHERE NAME=?",new String[]{name});
        if(currentRecord.getCount()>0){
            int result=db.update("UserRecord",contentValues,"NAME=?",new String[]{name});
            if(result==-1){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }




    public boolean deleteUserData(String name){
        SQLiteDatabase db=this.getWritableDatabase();

        Cursor findRecord=db.rawQuery("SELECT * FROM UserRecord WHERE NAME=?",new String[]{name});
        if(findRecord.getCount()>0){
            int result=db.delete("UserRecord","NAME=?",new String[]{name});
            if(result==-1){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }




    public Cursor viewUserData(){

        SQLiteDatabase db=this.getWritableDatabase();

        Cursor findAllRecords=db.rawQuery("SELECT * FROM UserRecord",null);
        return findAllRecords;
    }



}
