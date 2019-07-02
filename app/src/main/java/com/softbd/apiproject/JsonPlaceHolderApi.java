package com.softbd.apiproject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {

    @GET("/dyd/api/v1/applicant/applicant/{phoneNumber}")
    Call<GetResponse> getData(@Path("phoneNumber") String phoneNumber);

}
