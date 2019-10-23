package com.lmf.appkoin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository(private val movieApi: MovieApi) {

    suspend fun getMovie(): Movie {
        return withContext(Dispatchers.IO) {
            return@withContext  movieApi.getMovie( )
        }
    }
}