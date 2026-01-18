package com.example.dictionaryapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dictionaryapp.model.DictionaryData
import com.example.dictionaryapp.model.RetrofitInstance
import kotlinx.coroutines.launch

class DictionaryViewModel: ViewModel() {

    var isLoading by mutableStateOf(false)
        private set           // UI can read it, not modify the state

    var wordData by mutableStateOf<DictionaryData?>(null)   // holds one dictionary entry
        private set

    fun searchWord(word: String) {
        if(word.isBlank()) return

        viewModelScope.launch {
            isLoading = true
            try {
                val response = RetrofitInstance.api.getWordDefinition(word)
                wordData = response.firstOrNull()
            } catch (e: Exception) {
                wordData = null
            }
            isLoading = false
        }
    }
}

//     val response = RetrofitInstance.api.getWordDefinition(word)
//     At this moment:
//     word goes into @Path, URL is built, Network request is sent, JSON comes back, Gson converts it, response becomes List<DictionaryData>