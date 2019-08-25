package com.example.virus.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import java.util.ArrayList;

public class places extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RViewAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private boolean isLinear = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        init();

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isLinear){

                    recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,
                            StaggeredGridLayoutManager.VERTICAL));
                    recyclerView.setAdapter(adapter);
                    isLinear = false;
                }else{
                    recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
                    recyclerView.setAdapter(adapter);
                    isLinear = true;
                }

            }
        });
    }

    private void init() {
        this.recyclerView = findViewById(R.id.recycler_view);
        this.layoutManager = new LinearLayoutManager(getBaseContext());
        this.adapter = new RViewAdapter(getBaseContext(), getListCoche());
    }
    private ArrayList<Coche> getListCoche() {
        ArrayList<Coche> arrayListCoches = new ArrayList<>();

        arrayListCoches.add(new Coche(R.drawable.coorg,"COORG" ));
        arrayListCoches.add(new Coche(R.drawable.pilikula,"PILIKULA" ));
        arrayListCoches.add(new Coche(R.drawable.sasihithlu,"SASIHITHLU" ));
        arrayListCoches.add(new Coche(R.drawable.hanging,"UDANE HANGING BRIDGE" ));
        arrayListCoches.add(new Coche(R.drawable.shringeri,"SHRINGERI" ));
        arrayListCoches.add(new Coche(R.drawable.dharmasthala,"DHARMASTHALA" ));
        arrayListCoches.add(new Coche(R.drawable.coffee_museum,"COFFEE MUSEUM" ));
        arrayListCoches.add(new Coche(R.drawable.kudremukh,"KUDREMUKH" ));
        arrayListCoches.add(new Coche(R.drawable.moodbidri,"MOODBIDRI" ));
        arrayListCoches.add(new Coche(R.drawable.karkala,"KARKALA" ));

        return arrayListCoches;
    }

}
