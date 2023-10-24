package com.example.kisileruygulamasi.retrofit

import com.example.kisileruygulamasi.data.entity.KisilerAnswer
import retrofit2.http.GET

interface KisilerDao {
    @GET("kisiler/tum_kisiler.php")
    suspend fun loadKisiler() : KisilerAnswer
}