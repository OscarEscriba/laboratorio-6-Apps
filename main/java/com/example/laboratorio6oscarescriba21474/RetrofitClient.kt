package com.example.laboratorio6oscarescriba21474

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private  val retrofit = Retrofit.Builder()
        .baseUrl("https://api.teleport.org/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    val  EjecutarApi = retrofit.create(EjecutarApi:: class.java)
}