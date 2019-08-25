package com.example.virus.test.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DBHelper extends SQLiteAssetHelper {

    private static final String DB_NAME = "database.db";
    private static final int DB_VER = 1;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VER);
    }

    //creating database


    //check user exits.....

    public boolean checkUserExists(String phone) {
        boolean check;

        SQLiteDatabase database = getReadableDatabase();
        String query = String.format("SELECT * FROM users WHERE phone = '%s'", phone);
          Cursor cursor = database.rawQuery(query,null);

        if(cursor.getCount()> 0) {
            check = true;
        }
        else {
            check = false;
        }
        cursor.close();
        return check;
    }

    // register new user...

    public boolean registerNewUser(String name, String email, String phone, String password) {
        SQLiteDatabase database = getReadableDatabase();
        String query = String.format("INSERT INTO users(Name,Email,Phone,Password) VALUES('%S','%S','%S','%S');",name,email,phone,password);

        database.execSQL(query);
        return true;

    }

    // login user

    public boolean loginUser(String phone, String password)  {
        boolean check;
        SQLiteDatabase database = getReadableDatabase();
        String query = String.format("SELECT * FROM users WHERE Phone = '%S' AND Password = '%s'",phone,password);

        Cursor cursor = database.rawQuery(query,null);

        if(cursor.getCount() > 0)  {
            check = true;
        }
        else {
            check = false;
        }
        cursor.close();
        return check;
    }




}
