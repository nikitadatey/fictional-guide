package com.example.virus.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class gallery3 extends AppCompatActivity {

    TextView pname;
    TextView pdtail;
    ImageView pimg;
    int count = 0;

    String[] pname_article = new String[]{
            "coorg1",
            "coorg3",
            "coorg4",
            "coorg5",
            "coorg6",
            "coorg7"
    };

    String[] pdetail_article = new String[]{
            "coorg 1  ttttt",
            "coorg 3  ttttt",
            "coorg 4  tttt",
            "coorg 5  tttt",
            "coorg 6  tttt",
            "coorg 7  tttt"
    };

    int[] pimg_article = new int[]{
            R.drawable.sasihithlu1,
            R.drawable.sasihithlu2,
            R.drawable.sasihithlu3,
            R.drawable.sasihithlu4,
            R.drawable.sasihithlu5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery3);

        pname = (TextView)findViewById(R.id.pname);
        pdtail = (TextView)findViewById(R.id.pdetail);
        pimg = (ImageView)findViewById(R.id.pimg);

        pname.setText(pname_article[count]);
        pdtail.setText(pdetail_article[count]);
        pimg.setImageResource(pimg_article[count]);

    }

    public void next(View view) {
        if (count < 4) {
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
