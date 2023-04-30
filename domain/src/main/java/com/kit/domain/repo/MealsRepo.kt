package com.kit.domain.repo

import com.kit.domain.model.CategoryResponse

interface MealsRepo {
   suspend fun getMealsFromRemote() : CategoryResponse


}