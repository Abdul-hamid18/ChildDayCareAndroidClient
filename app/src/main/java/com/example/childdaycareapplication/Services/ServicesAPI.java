package com.example.childdaycareapplication.Services;

import com.example.childdaycareapplication.Model.Services;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ServicesAPI {

    @POST("/api/v1/services/")
    Call<Services> save(@Body Services services);

    @GET("/")
    Call<List<Services>> getAllServices();
}
