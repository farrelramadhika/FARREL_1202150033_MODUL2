package com.example.android.farrel_1202150033_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();

    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            foods.add("Nasi Goreng");
            foods.add("Mie Kuah Spesial");
            foods.add("Indomie Goreng");
            foods.add("Nasi Wagyu");
            foods.add("Sate Madura");
            foods.add("Mie Kuah Upnormal");
            foods.add("Nasi Goreng Bawang");

            priceses.add(15000);
            priceses.add(10000);
            priceses.add(10000);
            priceses.add(30000);
            priceses.add(25000);
            priceses.add(15000);
            priceses.add(25000);


            photos.add(R.drawable.nasi_goreng);
            photos.add(R.drawable.mie_kuah_spesial);
            photos.add(R.drawable.indomie_goreng);
            photos.add(R.drawable.nasi_wagyu);
            photos.add(R.drawable.sate_madura);
            photos.add(R.drawable.mie_kuah_upnormal);
            photos.add(R.drawable.nasi_goreng_bawang);

        }
    }
}
