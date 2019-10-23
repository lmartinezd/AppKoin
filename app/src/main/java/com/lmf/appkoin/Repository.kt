package com.lmf.appkoin

class Repository(private val movieApi: MovieApi) {

    fun getListMovies(): Any {
        return movieApi.getListMovies()
    }
}