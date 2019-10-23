package com.lmf.appkoin.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lmf.appkoin.data.model.Movie
import com.lmf.appkoin.data.Repository
import kotlinx.coroutines.launch
import java.io.IOException

class MainViewModel(private val repository: Repository) : ViewModel() {

    private val _movie: MutableLiveData<Movie> = MutableLiveData()
    val movie: LiveData<Movie> = _movie

    fun fetchMovie() {
        viewModelScope.launch {
            try {
                _movie.value = repository.getMovie()
            } catch (e: IOException) {
                Log.i("test", e.message)
            }

        }
    }

}