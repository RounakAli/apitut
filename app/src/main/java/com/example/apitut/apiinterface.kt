package com.example.apitut

import android.telecom.Call
import retrofit2.http.GET

interface apiinterface {

    @GET("products")
    fun  getproductdata():retrofit2.Call<MyData>

}