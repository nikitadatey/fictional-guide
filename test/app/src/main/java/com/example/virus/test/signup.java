package com.example.virus.test;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.virus.test.database.DBHelper;

public class signup extends AppCompatActivity {
    Button btnRegister;
    EditText edtName,edtEmail,edtPhone,edtPassword,edtCnfPassword;

    DBHelper database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        database = new DBHelper(this);

        btnRegister = findViewById(R.id.btnRegister);

        edtName = findViewById(R.id.edtName);
        edtEmail= findViewById(R.id.edtEmail);
        edtPhone= findViewById(R.id.edtPhone);
        edtPassword= findViewById(R.id.edtPassword);
        edtCnfPassword = findViewById(R.id.edtCnfPassword);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });

    }
    private void registerUser() {
        //get all the data from the edit text

        String name = edtName.getText().toString();
        String email = edtEmail.getText().toString();
        String phone = edtPhone.getText().toString();
        String password = edtPassword.getText().toString();
        String confirmpassword = edtCnfPassword.getText().toString();

        //check for empty text fields

        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this,"Name can't be empty....", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(email)) {
            Toast.makeText(this,"email can't be empty....", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(phone)) {
            Toast.makeText(this,"phone can't be empty....", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(password)) {
            Toast.makeText(this,"password can't be empty....", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(confirmpassword)) {
            Toast.makeText(this,"confirm password can't be empty....", Toast.LENGTH_SHORT).show();
        }
        else {
            // register user

            boolean checkUser = database.checkUserExists(phone);
            boolean registerUser = database.registerNewUser(name,email,phone,password);

            if(password.equals(confirmpassword)) {
                if(checkUser) {
                    Toast.makeText(this,"User Already Exists....",Toast.LENGTH_SHORT).show();
                }
                else {
                    if (registerUser) {
                        Toast.makeText(this,"User Registered Successfully....",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(this,Home.class);
                        startActivity(intent);
                        finish();
                    }
                    else {
                        Toast.makeText(this,"Error In Registration....",Toast.LENGTH_SHORT).show();
                    }
                }
            }
            else {
                Toast.makeText(this,"Both Password Don't Match....",Toast.LENGTH_SHORT).show();
            }
        }
    }
}

