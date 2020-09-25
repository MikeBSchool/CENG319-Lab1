package com.example.michaelburgener_ceng319_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class aiActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);
        textView = (TextView)findViewById(R.id.ai_textView);
        appendTextView(getResources().getString(R.string.aiactivity));
        appendTextView(getResources().getString(R.string.oncreate));
    }

    @Override
    protected void onStart() {
        super.onStart();
        appendTextView(getResources().getString(R.string.onstart));
    }

    @Override
    protected void onStop() {
        super.onStop();
        appendTextView(getResources().getString(R.string.onstop));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        appendTextView(getResources().getString(R.string.ondestroy));
    }
    public void appendTextView(String text) {
        textView.append(text + "\n");
    }
}