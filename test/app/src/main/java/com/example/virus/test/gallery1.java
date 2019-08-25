package com.example.virus.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class gallery1 extends AppCompatActivity {

    TextView pname;
    TextView pdtail;
    ImageView pimg;
    int count = 0;

    String[] pname_article = new String[]{
            "White River rafting",
            "Mallalli Falls",
            "Abbey Falls",
            "Dubare Elephant Camp",
            "Golden Temple",
            "Tadiandamol Peak"
    };

    String[] pdetail_article = new String[]{
            "Barapole river is a famous white river rafting destination in Coorg. The white frothy river with speedy waters and rapids, flowing through beautiful landscapes, makes for an ideal river rafting experience. Set against the backdrop of the Western Ghats and bordering the Deccan Plateau, Coorg is a popular destination among travelers. White water rafting is organized in Upper Barapole are called Kithu-Kakkatu River which is a strong catchment area for the monsoons, thus providing a some of the most challenging stretch of rapids.",
            "Mallalli Falls, the stunning milky white waterfalls, lies in the northern region of Kodagu district in the south-western Indian State of Karnataka. These falls lie 26 kilometres away from the town of Somwarpet, at the foot of the Pushpagiri Hills. The falls originate where River Kumaradhara takes a deep plunge of over 1000 metres and then follow a natural route that ends into the Arabian Sea.",
            "Abbey Falls, also known as Abbi Falls, is located around 10 kilometres away from the town of Madikeri and is one of the most popular tourist attractions in and around Coorg. The water cascade coming down from the cliff from a height of 70 feet provides a spectacular scene to behold. Nestled within the lush greenery which is typical to the sceneries of Western Ghats, the waterfalls attract hundreds and thousands of people throughout the year - especially nature lovers and photographers.",
            "Once a training site for elephants of the famous Dasara procession in Mysore, the Dubare Elephant camp offers a unique adventure to visitors by allowing them the experience of living in coexistence with the trained elephants on-site.",
            "Namdroling Monastery, situated at a distance of 60 km from the Kaveri Nisargadhama, is the largest teaching centre of the school of Tibetan Buddhism known as Nyingmapa. Thegchog Namdrol Shedrub Daryeling is the full name of the Namdroling Monastery. It is spread over an area of 80 square feet and was built from Bamboo which was donated by the Indian Government to the Tibetans in exile. ",
            "Tadiandamol is the highest mountain peak in Coorg, at an elevation of 1748m. Most tourists interested in trekking are drawn to this place as the journey is difficult, but the view from the top, unparalleled.While being the second highest peak in all of Karnataka, Tadiandamol trek is also a very good option for nature lovers who desire scenic surroundings and are beginners in the trekking scene."
    };

    int[] pimg_article = new int[]{
            R.drawable.coorg1,
            R.drawable.coorg3,
            R.drawable.coorg4,
            R.drawable.coorg5,
            R.drawable.coorg6,
            R.drawable.coorg7
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery1);

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
