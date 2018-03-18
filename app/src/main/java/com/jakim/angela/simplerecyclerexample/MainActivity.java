package com.jakim.angela.simplerecyclerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerAdapter recyclerAdapter;
    private ArrayList<RecyclerItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItems = new ArrayList<>();

        for(int i = 0; i<20; i++){
            listItems.add(new RecyclerItem("Item " + i));
        }

        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recyclerAdapter = new RecyclerAdapter(R.layout.item_list, listItems);
        recycler.setAdapter(recyclerAdapter);

    }
}