package com.example.childdaycareapplication.Adapter;

import android.view.View;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.childdaycareapplication.R;


public class ServicesHolder extends RecyclerView.ViewHolder {
    TextView name, description, status;

    public ServicesHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        description = itemView.findViewById(R.id.description);
        status = itemView.findViewById(R.id.status);
    }
}
