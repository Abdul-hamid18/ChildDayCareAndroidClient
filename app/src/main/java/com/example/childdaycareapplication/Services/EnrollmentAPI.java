package com.example.childdaycareapplication.Services;

import com.example.childdaycareapplication.Model.Enrollment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface EnrollmentAPI {
    @POST("/api/v1/enrollments/")
    Call<Enrollment> save(@Body Enrollment enrollment);

    @GET("/")
    Call<List<Enrollment>> getAllEnrollment();
}
