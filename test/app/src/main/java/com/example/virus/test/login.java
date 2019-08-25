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

public class login extends AppCompatActivity {
    Button btnLogin;
    EditText edtPhone,edtPassword;

    DBHelper database;

    RelativeLayout rellay1, rellay2;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);
        rellay2 = (RelativeLayout) findViewById(R.id.rellay2);

        handler.postDelayed(runnable, 2000); //2000 is the timeout for the splash


        database = new DBHelper(this);

        btnLogin = findViewById(R.id.btnLogin);

        edtPhone= findViewById(R.id.edtPhone);
        edtPassword= findViewById(R.id.edtPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });

    }

    private void loginUser() {
        //get all the data from the edit text

        String phone = edtPhone.getText().toString();
        String password = edtPassword.getText().toString();

        if (TextUtils.isEmpty(phone)) {
            Toast.makeText(this,"phone can't be empty....", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(password)) {
            Toast.makeText(this,"password can't be empty....", Toast.LENGTH_SHORT).show();
        }
        else {
            boolean checkUser = database.checkUserExists(phone);
            boolean logUser = database.loginUser(phone, password);

            if (checkUser) {
                if (logUser) {
                    startActivity(new Intent(login.this, Home.class));
                    Toast.makeText(this,"Login Successfull..", Toast.LENGTH_SHORT).show();
                    finish();
                }
                else {
                    Toast.makeText(this, "Login Error....", Toast.LENGTH_SHORT).show();
                }
            }
            else {
                Toast.makeText(this, "User Don't Exist....", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void signup(View view)
    {
        Intent intent = new Intent(this,signup.class);
        startActivity(intent);
    }
}

