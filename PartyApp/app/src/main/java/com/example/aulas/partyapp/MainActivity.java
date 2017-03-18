package com.example.aulas.partyapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.aulas.partyapp.partyapp.Home.PartyHomePresenter;

/**
 * Created by Aulas on 18/03/2017.
 */

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button buttonSearch;
    Button buttonAdd;
    PartyHomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter= new PartyHomePresenter();
        text = (TextView) findViewById(android.R.id.text1);


        buttonSearch = (Button) findViewById(android.R.id.button1);
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             presenter.onButtonSearchPressed();
            }
        });

        buttonAdd = (Button) findViewById(android.R.id.button2);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             presenter.onButtonAddPressed();
            }
        });


    }



}
