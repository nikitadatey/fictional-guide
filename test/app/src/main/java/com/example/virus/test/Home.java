package com.example.virus.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Home extends AppCompatActivity {


    int[] images=new int[]{R.drawable.slide1,R.drawable.slide2,R.drawable.slide3,R.drawable.slide4,R.drawable.slide5,R.drawable.slide6,R.drawable.slide7,R.drawable.slide8,R.drawable.slide9,R.drawable.slide10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ViewPager viewPager=findViewById(R.id.view_pager);
        ViewPagerAdapter adapter=new ViewPagerAdapter(this,images);
        viewPager.setAdapter(adapter);
    }

    public void works(View view) {
        Intent intent=new Intent(this,places.class);
        startActivity(intent);
    }
}
