package com.masai.airbnbappclone.recyclerviews

import com.masai.airbnbappclone.models.RoomModel

interface HorizontalPlaceListListenerInterface {
    fun onHrItemClick(roomModel: RoomModel, pos: Int)
    fun onItemClick(roomModel: RoomModel, adapterPosition: Int)
    fun onAddedToWishlist(roomModel: RoomModel)
}