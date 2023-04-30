package com.kit.domain.usecase

import com.kit.domain.repo.MealsRepo

class GetMealsUseCase (private val  mealsRepo: MealsRepo) {
   suspend operator fun invoke() = mealsRepo.getMealsFromRemote()
}

