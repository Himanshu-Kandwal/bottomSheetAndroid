package com.example.bottomsheetandroid;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import org.jetbrains.annotations.NotNull;

public class bottomsheetModal extends BottomSheetDialogFragment {
    final String TAG = "BottomsheetModal";

    bottomSheetClickListner mbottomSheetClickListner; //instance for button callback

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @org.jetbrains.annotations.NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View bottomSheetView = inflater.inflate(R.layout.layout_bottomsheet_modal, container, false);

//button1 click listner
        bottomSheetView.findViewById(R.id.button1).setOnClickListener(v -> {
            mbottomSheetClickListner.onBottomSheetButtonClick("Button1 Clicked");
            dismiss();
        });
        //button1 click listner
        bottomSheetView.findViewById(R.id.button2).setOnClickListener(v -> {
            mbottomSheetClickListner.onBottomSheetButtonClick("Button2 Clicked");
            dismiss();
        });


        return bottomSheetView;
    }

    interface bottomSheetClickListner {
        void onBottomSheetButtonClick(String text);
    }

    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);
        try {
            mbottomSheetClickListner = (bottomSheetClickListner) context; //context is to reccieve method implementation of interface from activity
        } catch (ClassCastException c) {
            throw new ClassCastException("Must implement bottomSheetClickListner interface in host activity");
        }
    }
}


