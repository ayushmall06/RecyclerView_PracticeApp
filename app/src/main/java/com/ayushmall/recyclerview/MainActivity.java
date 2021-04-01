package com.ayushmall.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyRecyclerAdapter myRecyclerAdapter;
    List<String> movieList;

    SwipeRefreshLayout swipeRefreshLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        movieList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
         myRecyclerAdapter = new MyRecyclerAdapter(movieList);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(myRecyclerAdapter);

        movieList.add("Playmobil: The Movie");
        movieList.add("Aquarela");
        movieList.add("Aladdin");
        movieList.add("Frozen II");
        movieList.add("Good bOys");
        movieList.add("Avengers : End Game");
        movieList.add("7 Guardians of the Tomb ");
        movieList.add("Beast of Burden ");
        movieList.add("Curvature ");
        movieList.add("A Country Called Home ");
        movieList.add("Accidentally Engaged");
        movieList.add("Girlfriends of Christmas Past");
        movieList.add("Heart of the Country");
        movieList.add("Stop the Wedding");
        movieList.add("Battlecreek");
        movieList.add("Becks");
        movieList.add("Defective");
        movieList.add("Fixed");
        movieList.add("Newness");
        movieList.add("Valentine's Again");
        movieList.add("Painted Woman");
        movieList.add("Permission");
        movieList.add("Signature Move");
        movieList.add("The Wife Wedding");
        movieList.add("Your Move");
        movieList.add("CatchFire");
        movieList.add("Dreamer");



        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                movieList.add("Shergar");
                movieList.add("Relentless");
                movieList.add("Darkest Hour");
                movieList.add("Justice League");
                movieList.add("Suburbicon");
                movieList.add("The Stray");
                movieList.add("Hellraiser");

                myRecyclerAdapter.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(false);
            }
        });

    }



}