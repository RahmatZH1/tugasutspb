package com.example.tugasutspb.retrofit;

import com.example.tugasutspb.SearchResponse;
import com.example.tugasutspb.SearchUser;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @Headers({"Authorization: token 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"})
    @GET("search/users")
    Call<SearchResponse> searchUsers(@Query("q") String query);

    @Headers({"Authorization: token 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"})
    @GET("users/{username}")
    Call<SearchUser> getUser(@Path("username") String username);

}