package com.example.praktikum5_225150207111005_haniduraayatulloh

import kotlinx.coroutines.delay
import kotlin.random.Random

class QuoteRepository {
    private val quotes =
        listOf(
            "The best way to get started is to quit talking and begin doing.",
            "Don't let yesterday take up too much of today.",
            "It's not whether you get knocked down, it's whether you get up.",
            "If you are working on something exciting, it will keep you motivated.",
            "Success is not in what you have, but who you are."
        )

    suspend fun getRandomQuote(): String {
        Thread.sleep(2000)
        return quotes[Random.nextInt(quotes.size)]
    }
}