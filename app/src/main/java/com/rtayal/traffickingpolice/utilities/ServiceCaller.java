package com.rtayal.traffickingpolice.utilities;

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

    private static String BASE_URL = "http://10.0.2.2:2403";

    public static void getReportedList(Callback<List<Object>> callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        API api = retrofit.create(API.class);
        Call<List<Object>> call = api.getReports();
        call.enqueue(callback);
    }
}