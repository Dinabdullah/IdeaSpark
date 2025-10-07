package com.example.ideaspark.data.remote

import com.example.ideaspark.utills.Constants.BASE_URL
import io.ktor.client.call.body
import io.ktor.client.request.get

object KtorApiService {
    suspend fun getFilteredActivity(type: String): List<ActivityResponse> {
        return KtorClientInstance.client.get("${BASE_URL}filter") {
            url {
                parameters.append("type", type)
            }
        }.body()
    }
}