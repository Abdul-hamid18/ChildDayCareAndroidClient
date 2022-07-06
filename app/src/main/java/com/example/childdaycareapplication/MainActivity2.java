package com.example.childdaycareapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.childdaycareapplication.Adapter.ServicesAdapter;
import com.example.childdaycareapplication.Model.Services;
import com.example.childdaycareapplication.Services.RetrofitService;
import com.example.childdaycareapplication.Services.ServicesAPI;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        recyclerView = findViewById(R.id.employeeList_recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
        FloatingActionButton floatingActionButton = findViewById(R.id.employeeList_fab);
        floatingActionButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        });


    }

//    private void loadServices() {
//        RetrofitService retrofitService = new RetrofitService();
//        ServicesAPI servicesAPI = retrofitService.getRetrofit().create(ServicesAPI.class);
//        servicesAPI.getAllServices()
//                .enqueue(new Callback<List<Services>>() {
//                    @Override
//                    public void onResponse(Call<List<Services>> call, Response<List<Services>> response) {
//                        populateListView(response.body());
//                    }
//
//                    @Override
//                    public void onFailure(Call<List<Services>> call, Throwable t) {
//                        Toast.makeText(MainActivity2.this, "Failed to load employees", Toast.LENGTH_SHORT).show();
//                    }
//                });
//    }
//
//    private void populateListView(List<Services> servicesList) {
//        ServicesAdapter servicesAdapter = new ServicesAdapter(servicesList);
//        recyclerView.setAdapter(servicesAdapter);
//    }
//    @Override
//    protected void onResume() {
//        super.onResume();
//        loadServices();
//    }


}