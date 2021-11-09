package com.example.weathermvpexample.contract

import com.example.weathermvpexample.model.WeatherObject

interface ContractInterface {
    interface Model {
        fun fetchWeather(): WeatherObject
        fun shuffleWeatherObjects()
    }

    interface View {
        fun initializeView()
        fun updateViewWithData()
    }

    interface Presenter {
        fun fetchWeather(): WeatherObject
        fun shuffleWeatherObjects()
    }
}