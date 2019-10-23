package com.lmf.appkoin.data

import com.lmf.appkoin.data.model.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository(private val movieApi: MovieApi) {

    suspend fun getMovie(): Movie {
        return withContext(Dispatchers.IO) {
            return@withContext movieApi.getMovie()
        }
    }
}