package com.lmf.appkoin

import retrofit2.http.GET

interface MovieApi  {
    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val API_KEY = "93aea0c77bc168d8bbce3918cefefa45"
    }

    @GET( "movie/111/${API_KEY}")
    suspend fun getMovie(): Movie
}