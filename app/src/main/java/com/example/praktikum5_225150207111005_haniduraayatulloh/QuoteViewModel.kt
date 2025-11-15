package com.example.praktikum5_225150207111005_haniduraayatulloh

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuoteViewModel: ViewModel() {
    private val repository = QuoteRepository()
    private val _quote = MutableStateFlow("Tap the button to get a quote")
    val quote: StateFlow<String> get() = _quote
    fun fetchQuote() {
        viewModelScope.launch {

            try {
                _quote.value = "Loading..."


                throw Exception("Simulasi Gagal Koneksi Jaringan")

                val result = repository.getRandomQuote()
                _quote.value = result

            } catch (e: Exception) {


                _quote.value = "ERROR: Gagal mengambil kutipan. ${e.message}"


            }
        }
    }
}