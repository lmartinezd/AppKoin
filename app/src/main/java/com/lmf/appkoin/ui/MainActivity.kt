package com.lmf.appkoin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.lmf.appkoin.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    // we get our viewModel from Koin
    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.fetchMovie()

        mainViewModel.movie.observe(this, Observer {
            it?.let {
                tvMessage.text = it.title
                tvOverview.text = it.overview
            }
        })

    }
}
