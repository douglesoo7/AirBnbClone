package com.masai.airbnbappclone.recyclerviews

import com.masai.airbnbappclone.models.RoomModel

interface PlacesListInterface {
    fun onHrItemClick(roomModel: RoomModel, pos: Int)
    fun setMarkOnMap(roomModel: RoomModel,pos: Int)
    fun onItemClick(model: RoomModel, adapterPosition: Int)
    fun getTotal(price: String): Int
}