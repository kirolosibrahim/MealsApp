package com.kit.data.remote

import com.kit.domain.model.CategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    suspend fun getMeals() : CategoryResponse
}