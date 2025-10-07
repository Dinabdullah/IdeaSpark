package com.example.ideaspark.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface BoredApiService {
    @GET("filter")
    suspend fun getFilteredActivity(
        @Query("type") type: String? = null,
    ): List<ActivityResponse>

}