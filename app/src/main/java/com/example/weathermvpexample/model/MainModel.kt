package com.example.weathermvpexample.model

import com.example.weathermvpexample.contract.ContractInterface

class MainModel : ContractInterface.Model {

    private var weatherObjects = listOf<WeatherObject>(
        WeatherObject("7", "2", "8", "Scattered clouds"),
        WeatherObject("3", "-2", "3", "Rain"),
        WeatherObject("14", "8", "16", "Clear"),
        WeatherObject("8", "1", "8", "Clouds"),
        WeatherObject("4", "0", "6", "Sunny"),
        WeatherObject("-3", "-5", "0", "Snow")
    )

    override fun fetchWeather(): WeatherObject {
        return weatherObjects[0]
    }

    override fun shuffleWeatherObjects() {
        weatherObjects = weatherObjects.shuffled()
    }
}

data class WeatherObject(
    val temp: String,
    val minTemp: String,
    val maxTemp: String,
    val status: String
)