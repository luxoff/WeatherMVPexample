package com.example.weathermvpexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weathermvpexample.R
import com.example.weathermvpexample.contract.ContractInterface
import com.example.weathermvpexample.databinding.ActivityMainBinding
import com.example.weathermvpexample.presenter.MainActivityPresenter

class MainActivity : AppCompatActivity(), ContractInterface.View {
    private var presenter: MainActivityPresenter? = null
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        presenter = MainActivityPresenter(this)
        initializeView()
    }

    override fun initializeView() {
        val weatherObject = presenter?.fetchWeather()
        binding.apply {
            weatherObject.let {
                tvTemp.text = weatherObject?.temp
                tvMinTemp.text = weatherObject?.minTemp
                tvMaxTemp.text = weatherObject?.maxTemp
                tvStatus.text = weatherObject?.status
            }
            btnUpdateWeather.setOnClickListener{
                presenter?.shuffleWeatherObjects()
            }
        }
    }

    override fun updateViewWithData() {
        val weatherObject = presenter?.fetchWeather()
        binding.apply {
            weatherObject.let {
                tvTemp.text = weatherObject?.temp
                tvMinTemp.text = weatherObject?.minTemp
                tvMaxTemp.text = weatherObject?.maxTemp
                tvStatus.text = weatherObject?.status
            }
        }
    }
}