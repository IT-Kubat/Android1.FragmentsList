package com.example.fragmentslist;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public MainHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.holder_text_view);
    }
}
