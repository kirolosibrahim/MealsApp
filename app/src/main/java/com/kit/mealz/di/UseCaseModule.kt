package com.kit.mealz.di

import com.kit.domain.repo.MealsRepo
import com.kit.domain.usecase.GetMealsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {


    @Provides
    fun provideUseCase(mealsRepo: MealsRepo): GetMealsUseCase {
        return GetMealsUseCase(mealsRepo)
    }
}