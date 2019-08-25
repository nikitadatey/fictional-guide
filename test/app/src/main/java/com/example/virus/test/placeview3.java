package com.example.virus.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class placeview3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeview3);
    }

    public void gallery3(View view) {
        Intent intent = new Intent(this,gallery3.class);
        startActivity(intent);
    }

    public void Hotel1(View view) {
        Intent intent = new Intent(this,hotel3.class);
        startActivity(intent);
    }

    public void description3(View view) {
        Intent intent = new Intent(this,Shashi_des.class);
        startActivity(intent);
    }

    public void direction3(View view) {
        String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?saddr=%f,%f(%s)&daddr=%f,%f (%s)", 12.994640, 74.798271, "Home Sweet Home", 13.0702, 74.7772, "Where the party is at");
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}
