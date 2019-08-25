package com.example.virus.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class gallery2 extends AppCompatActivity {

    TextView pname;
    TextView pdtail;
    ImageView pimg;
    int count = 0;

    String[] pname_article = new String[]{
            "BIOLOGICAL PARK",
            "BIOLOGICAL PARK",
            "BIOLOGICAL PARK",
            "Manasa Amusement and Water Park",
            "Pilikula Lake",
            "Pilikula Lake"
    };

    String[] pdetail_article = new String[]{
            "A significant Biological Park is established in Pilikula Nisarga Dhama has major focus on the wildlife species of Western Ghats. The park is named as Dr. Shivaram Karnath Biological Park. The park consists of an area of 82 hectaresIn accordance with prevailing laws, the central Zoo Authority of India has recognized the park. As per modern Zoological practices, the animal enclosures have been designed to closely resemble its natural habitat.",
            "Pilikula Zoo has been classified as a Major Zoo by the Central Zoo Authority of India.  It is the only zoo recognized as a breeding centre for King Cobras.  It is also functioning as a rescue centre for wounded wild life.  Today Pilikula Zoo has 400 animals, reptiles and birds and most of the species are breeding.",
            "Pilikula Zoo has been classified as a Major Zoo by the Central Zoo Authority of India.  It is the only zoo recognized as a breeding centre for King Cobras.  It is also functioning as a rescue centre for wounded wild life.  Today Pilikula Zoo has 400 animals, reptiles and birds and most of the species are breeding.",
            "Manasa Amusement and Water Park is South Kanara’s and Coastal Karnataka’s only amusement and water park was inaugurated on 1st January 2003 and has become an ideal picnic spot. It is situated within the 370 Acres tourism project of District administration “Pilikula Nisargadhama”, an eco-educational tourist park.",
            "Pilikula literally means Tiger's lake. In olden days, tigers used to come to this lake to drink water. Henceforth, this lake came to be known as Pilikula.",
            "Pilikula literally means Tiger's lake. In olden days, tigers used to come to this lake to drink water. Henceforth, this lake came to be known as Pilikula."
    };

    int[] pimg_article = new int[]{
            R.drawable.pilikula1,
            R.drawable.pilikula2,
            R.drawable.pilikula3,
            R.drawable.pilikula5,
            R.drawable.pilikula6,
            R.drawable.pilikula7
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery2);

        pname = (TextView)findViewById(R.id.pname);
        pdtail = (TextView)findViewById(R.id.pdetail);
        pimg = (ImageView)findViewById(R.id.pimg);

        pname.setText(pname_article[count]);
        pdtail.setText(pdetail_article[count]);
        pimg.setImageResource(pimg_article[count]);

    }

    public void next(View view) {
        if (count < 5) {
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
