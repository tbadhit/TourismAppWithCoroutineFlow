package com.dicoding.tourismapp.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ListTourismResponse(
    @field:SerializedName("error")
    var error: Boolean,

    @field:SerializedName("message")
    var message: String,

    @field:SerializedName("places")
    var places: List<TourismResponse>
)
