package com.example.bottomsheetandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.modelBottomsheetButton).setOnClickListener(view -> startActivity(new Intent(this, modalBottomSheet.class)));
        findViewById(R.id.persistantBottomsheet).setOnClickListener(view -> startActivity(new Intent(this, persistantBottomsheet.class)));

    }
}