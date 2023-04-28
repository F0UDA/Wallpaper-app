package com.mohsen.mvvm.repository


import com.mohsen.mvvm.model.networking.API
import com.mohsen.mvvm.model.networking.RetroService

class MainRepository {
    fun retroService(): RetroService = API.apiService
}