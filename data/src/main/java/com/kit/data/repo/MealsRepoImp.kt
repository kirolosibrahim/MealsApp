package com.kit.data.repo

import com.kit.data.remote.ApiService
import com.kit.domain.model.CategoryResponse
import com.kit.domain.repo.MealsRepo

class MealsRepoImp(private val apiService: ApiService) : MealsRepo {

    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()

}