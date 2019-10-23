package com.lmf.appkoin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository): ViewModel(){
 
    private val _title: MutableLiveData<String> = MutableLiveData()
    val title: LiveData<String>  = MutableLiveData()

    fun fetchMovie(){
        viewModelScope.launch {
            // get your work done
            _title.value = repository.getMovie().title
        }
    }

}