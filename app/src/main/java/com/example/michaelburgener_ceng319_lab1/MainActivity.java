package com.example.michaelburgener_ceng319_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    bottom botFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botFrag = (bottom) getSupportFragmentManager().findFragmentById(R.id.botFrag);
        botFrag.appendTextView(getResources().getString(R.string.oncreate));

    }

    @Override
    protected void onStart() {
        super.onStart();
        botFrag.appendTextView(getResources().getString(R.string.onstart));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        botFrag.appendTextView(getResources().getString(R.string.onrestart));
    }

    @Override
    protected void onResume() {
        super.onResume();
        botFrag.appendTextView(getResources().getString(R.string.onresume));
    }

    @Override
    protected void onPause() {
        super.onPause();
        botFrag.appendTextView(getResources().getString(R.string.onpause));
    }

    @Override
    protected void onStop() {
        super.onStop();
        botFrag.appendTextView(getResources().getString(R.string.onstop));
    }
}