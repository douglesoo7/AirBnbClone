package com.masai.airbnbappclone.recyclerviews

import com.masai.airbnbappclone.models.CityModel

interface CityItemInterface {
    fun onCityItemClick(cityModel: CityModel)
    fun getTheDriveTime(cityModel: CityModel): String
}