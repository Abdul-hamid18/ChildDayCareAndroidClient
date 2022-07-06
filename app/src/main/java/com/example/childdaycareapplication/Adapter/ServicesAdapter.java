package com.example.childdaycareapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.childdaycareapplication.Model.Services;
import com.example.childdaycareapplication.R;

import java.util.List;

public class ServicesAdapter extends  RecyclerView.Adapter<ServicesHolder> {
    private List<Services> servicesList;

    public ServicesAdapter(List<Services> servicesList) {
        this.servicesList = servicesList;
    }

    @NonNull
    @Override
    public ServicesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_service_item, parent, false);
        return new ServicesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ServicesHolder holder, int position) {
        Services services = servicesList.get(position);
        holder.name.setText(services.getName());
        holder.description.setText(services.getDescription());
        holder.status.setText(services.getStatus());
    }

    @Override
    public int getItemCount() {
        return servicesList.size();
    }
}
