package com.example.laboratorio6oscarescriba21474

import android.telecom.Call
import retrofit2.http.GET

interface EjecutarApi {
    @GET("urban_areas/")
    fun getTraer(): retrofit2.Call<Ciudades>
}