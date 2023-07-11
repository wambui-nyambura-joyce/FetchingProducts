package com.example.myshop

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiInterface {
    @GET("/product")
    fun getProducts():Call<ProductResponse>

    @GET("/product/{id}")
    fun  getProductById(@Path("id")productId:Int):Call<Product>

    @GET ("/product")
    fun postProduct ():Call<List<POST>>
}