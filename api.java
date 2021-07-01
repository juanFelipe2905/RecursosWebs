package com.example.practica4.interfaces;

import java.util.List;
import retrofit2.call;
import retrofit2.http.GET;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface api {
    @GET("user")
    call<List<User>> getAllUsers();

    @GET("user/{id}")
    call<User> getUser(@Path("id")int id);
}
