package com.lathusha.imageprocessing;

import java.io.File;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {
    @POST("plant_disease_classifcation3")
    Call<Data> getResponce(@Body PlantRequest body);

}
