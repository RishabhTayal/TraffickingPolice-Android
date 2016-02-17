package com.rtayal.traffickingpolice;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by rtayal on 2/17/16.
 */
public class ServiceCaller {


    public static void getReportedList(Callback<Object> callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.stackexchange.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        StackOverflowAPI api = retrofit.create(StackOverflowAPI.class);
        Call<Object> call = api.loadQuestions("android");
        call.enqueue(callback);
    }
}