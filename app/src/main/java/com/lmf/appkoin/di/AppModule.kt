package com.lmf.appkoin.di

import com.lmf.appkoin.MainViewModel
import com.lmf.appkoin.MovieApi
import com.lmf.appkoin.MovieApi.Companion.BASE_URL
import com.lmf.appkoin.Repository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val mainModule = module {

    single { createWebService() }
    factory { Repository(get()) }
    viewModel { MainViewModel(get()) }
}

fun createWebService(): MovieApi {
    val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    return retrofit.create(MovieApi::class.java)
}