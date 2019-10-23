package com.lmf.appkoin.data

import com.lmf.appkoin.data.model.Movie
import retrofit2.http.GET
import retrofit2.http.Headers

interface MovieApi {
    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val API_KEY = "93aea0c77bc168d8bbce3918cefefa45"
    }

    @Headers("Content-Type: application/json;charset=utf-8")
    @GET("movie/111?api_key=$API_KEY")
    suspend fun getMovie(): Movie
}