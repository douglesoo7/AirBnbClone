package com.masai.airbnbappclone.recyclerviews

import com.google.android.gms.maps.model.LatLng
import com.masai.airbnbappclone.models.RoomModel

interface SearchListInterface {
    fun onSearchItemClick(roomModel: RoomModel,pos:Int)
    fun getLagLang(): LatLng
}