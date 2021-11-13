package com.masai.airbnbappclone.recyclerviews

import com.masai.airbnbappclone.models.ServiceListModel

interface ServiceListInterface {
    fun onServiceSelected(model: ServiceListModel)
}