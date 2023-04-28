package com.mohsen.mvvm.model.domain


import com.google.gson.annotations.SerializedName

data class R(
    @SerializedName("coordinates")
    val coordinates: List<Double?>?,
    @SerializedName("type")
    val type: String?
)