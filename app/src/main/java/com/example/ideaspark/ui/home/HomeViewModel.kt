package com.example.ideaspark.ui.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ideaspark.data.remote.KtorApiService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import com.example.ideaspark.data.remote.ActivityResponse

class HomeViewModel : ViewModel() {
    private val _state = MutableStateFlow<List<ActivityResponse>>(emptyList())
    val state: StateFlow<List<ActivityResponse>> = _state

    fun fetchActivities(type: String) {
        viewModelScope.launch {
            try {
                val response = KtorApiService.getFilteredActivity(type)
                Log.d("HomeViewModel", "Response size: ${response.size}")
                _state.value = response
            } catch (e: Exception) {
                e.printStackTrace()
                _state.value = emptyList()
            }
        }
    }
}

