package com.example.whatsapclone.ViewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.whatsapclone.Network.fetchCountry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class UserRegistrationVM: ViewModel(){
    private val _countries = MutableStateFlow<List<Pair<String, String>>>(emptyList())
    val countries: StateFlow<List<Pair<String, String>>> = _countries

    fun getCountries(){
        viewModelScope.launch {
            val result = fetchCountry()
            Log.d("API", "Countries fetched: ${result.size}")
            _countries.value = result
        }
    }
}