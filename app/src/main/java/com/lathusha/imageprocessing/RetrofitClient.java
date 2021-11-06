package com.lathusha.imageprocessing;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static Retrofit retrofit;

    public static Retrofit getRetrofitInstance(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
            .baseUrl("https://asia-south1-aifunctions.cloudfunctions.net")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        }

        return retrofit;
    }
}
