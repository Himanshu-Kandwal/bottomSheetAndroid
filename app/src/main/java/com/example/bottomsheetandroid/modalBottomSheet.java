package com.example.bottomsheetandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class modalBottomSheet extends AppCompatActivity implements bottomsheetModal.bottomSheetClickListner {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modal_bottom_sheet);
        textView = findViewById(R.id.textViewOutputModalBottomsheet);

        Button button = findViewById(R.id.modalBottomSheetShow);
        button.setOnClickListener(v -> {
            bottomsheetModal bottomsheetModal = new bottomsheetModal();
            bottomsheetModal.show(getSupportFragmentManager(), bottomsheetModal.TAG);
        });
    }

    @Override
    public void onBottomSheetButtonClick(String text) {
        textView.setText(text);
    }
}