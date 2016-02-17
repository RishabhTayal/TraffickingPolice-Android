package com.rtayal.traffickingpolice.utilities;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by rtayal on 2/17/16.
 */

public interface API {
    @GET("/reports")
    Call<List<Object>> getReports();
}



