package com.kit.mealz.di

import com.kit.data.remote.ApiService
import com.kit.data.repo.MealsRepoImp
import com.kit.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService): MealsRepo {
        return MealsRepoImp(apiService)
    }


}