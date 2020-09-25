package com.example.michaelburgener_ceng319_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top topFrag = new top();
        bottom botFrag = new bottom();

        getSupportFragmentManager().beginTransaction().add(R.id.mainLayout, topFrag).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.mainLayout, botFrag).commit();
    }
}