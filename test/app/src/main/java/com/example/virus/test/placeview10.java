package com.example.virus.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class placeview10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeview10);
    }

    public void Gallery10(View view) {
        Intent intent = new Intent(this,gallery10.class);
        startActivity(intent);
    }

    public void Hotel10(View view) {
        Intent intent = new Intent(this,hotel10.class);
        startActivity(intent);
    }

    public void description10(View view) {
        Intent intent = new Intent(this,karkala_des.class);
        startActivity(intent);
    }

    public void direction10(View view) {
        String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?saddr=%f,%f(%s)&daddr=%f,%f (%s)", 12.994640, 74.798271, "Home Sweet Home", 13.2151, 74.9962, "Where the party is at");
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}
