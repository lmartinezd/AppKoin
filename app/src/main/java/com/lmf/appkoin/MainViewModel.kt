package com.lmf.appkoin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val repository: Repository): ViewModel(){

    private var messageData: MutableLiveData<Any>? =null

    fun fetchMovie(): LiveData<Any>?{
        if(messageData == null){
            messageData = MutableLiveData()
        }

        messageData!!.postValue( repository.getListMovies())
        return messageData
    }

}