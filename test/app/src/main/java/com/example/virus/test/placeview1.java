package com.example.virus.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class placeview1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeview1);
    }

    public void Gallery1(View view) {
        Intent intent = new Intent(this,gallery1.class);
        startActivity(intent);
    }

    public void Hotel1(View view) {
        Intent intent = new Intent(this,hotel1.class);
        startActivity(intent);
    }

    public void description1(View view) {
        Intent intent = new Intent(this,coorg_des.class);
        startActivity(intent);
    }

    public void direction1(View view) {
        String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?saddr=%f,%f(%s)&daddr=%f,%f (%s)", 12.994640, 74.798271, "Home Sweet Home", 12.4142, 75.7370, "Where the party is at");
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}
