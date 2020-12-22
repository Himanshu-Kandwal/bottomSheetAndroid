package com.example.bottomsheetandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class modalBottomSheet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modal_bottom_sheet);

        Button button= findViewById(R.id.modalBottomSheetShow);
        button.setOnClickListener(v -> {
            bottomsheetModal bottomsheetModal= new bottomsheetModal();
            bottomsheetModal.show(getSupportFragmentManager(),bottomsheetModal.TAG);
        });
    }
}