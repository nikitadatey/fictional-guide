package com.example.virus.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class gallery10 extends AppCompatActivity {

    TextView pname;
    TextView pdtail;
    ImageView pimg;
    int count = 0;

    String[] pname_article = new String[]{
            "karkala1",
            "karkala2",
            "karkala3",
            "karkala4",
            "karkala5",
            "karkala6",
            "karkala7",
            "karkala8"
    };

    String[] pdetail_article = new String[]{
            "coorg 1  ttttt",
            "coorg 3  ttttt",
            "coorg 4  tttt",
            "coorg 5  tttt",
            "coorg 6  tttt",
            "coorg 7  tttt",
            "coorg 6  tttt",
            "coorg 7  tttt"
    };

    int[] pimg_article = new int[]{
            R.drawable.coffee1,
            R.drawable.coffee2,
            R.drawable.coffee3,
            R.drawable.coffee4,
            R.drawable.coffee5,
            R.drawable.coffee6,
            R.drawable.coffee7,
            R.drawable.coffee8
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery10);

        pname = (TextView)findViewById(R.id.pname);
        pdtail = (TextView)findViewById(R.id.pdetail);
        pimg = (ImageView)findViewById(R.id.pimg);

        pname.setText(pname_article[count]);
        pdtail.setText(pdetail_article[count]);
        pimg.setImageResource(pimg_article[count]);

    }

    public void next(View view) {
        if (count < 7) {
            count++;
            pname.setText(pname_article[count]);
            pdtail.setText(pdetail_article[count]);
            pimg.setImageResource(pimg_article[count]);
        }
        else{
            Toast.makeText(this,"NO MORE IMAGES",Toast.LENGTH_SHORT).show();
        }
    }

    public void prev(View view) {

        if (count > 0) {
            count--;
            pname.setText(pname_article[count]);
            pdtail.setText(pdetail_article[count]);
            pimg.setImageResource(pimg_article[count]);
        }
        else{
            Toast.makeText(this,"NO MORE IMAGES",Toast.LENGTH_SHORT).show();
        }
    }
}
