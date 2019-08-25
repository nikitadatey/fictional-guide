package com.example.virus.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class gallery9 extends AppCompatActivity {

    TextView pname;
    TextView pdtail;
    ImageView pimg;
    int count = 0;

    String[] pname_article = new String[]{
            "coffee museum1",
            "coffee museum2",
            "coffee museum3",
            "coffee museum4",
            "coffee museum5",
            "coffee museum6",
            "coffee museum7"
    };

    String[] pdetail_article = new String[]{
            "coorg 1  ttttt",
            "coorg 3  ttttt",
            "coorg 4  tttt",
            "coorg 5  tttt",
            "coorg 6  tttt",
            "coorg 7  tttt",
            "coorg 6  tttt"
    };

    int[] pimg_article = new int[]{
            R.drawable.moodbidri1,
            R.drawable.moodbidri2,
            R.drawable.moodbidri3,
            R.drawable.moodbidri4,
            R.drawable.moodbidri5,
            R.drawable.moodbidri6,
            R.drawable.moodbidri7
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery9);

        pname = (TextView)findViewById(R.id.pname);
        pdtail = (TextView)findViewById(R.id.pdetail);
        pimg = (ImageView)findViewById(R.id.pimg);

        pname.setText(pname_article[count]);
        pdtail.setText(pdetail_article[count]);
        pimg.setImageResource(pimg_article[count]);

    }

    public void next(View view) {
        if (count < 6) {
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
