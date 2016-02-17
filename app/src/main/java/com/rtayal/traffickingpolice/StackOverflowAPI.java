package com.rtayal.traffickingpolice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by rtayal on 2/17/16.
 */

public interface StackOverflowAPI {
    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
    Call<Object> loadQuestions(@Query("tagged") String tags);
}



