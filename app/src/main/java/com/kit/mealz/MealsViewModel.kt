package com.kit.mealz

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kit.domain.model.CategoryResponse
import com.kit.domain.usecase.GetMealsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(
    private val getMealsUseCase: GetMealsUseCase
) : ViewModel() {

    private val _categories: MutableStateFlow<CategoryResponse?> = MutableStateFlow(null)
     val categories : StateFlow<CategoryResponse?> = _categories


    fun getMeals() {
        viewModelScope.launch {
            try {
                _categories.value = getMealsUseCase()
            } catch (e: Exception) {
                Log.e(Companion.TAG, "getMeals: " + e.message.toString())
            }

        }

    }

    companion object {
        private const val TAG = "MealsViewModel"
    }

}