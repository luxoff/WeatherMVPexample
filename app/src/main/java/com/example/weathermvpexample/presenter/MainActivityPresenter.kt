package com.example.weathermvpexample.presenter

import com.example.weathermvpexample.contract.ContractInterface
import com.example.weathermvpexample.model.MainModel
import com.example.weathermvpexample.model.WeatherObject

class MainActivityPresenter(_view: ContractInterface.View): ContractInterface.Presenter{
    private var view = _view
    private var model = MainModel()

    /*init {
        view.initializeView()
    }*/

    override fun fetchWeather() = model.fetchWeather()

    override fun shuffleWeatherObjects() {
        model.shuffleWeatherObjects()
        view.updateViewWithData()
    }

}