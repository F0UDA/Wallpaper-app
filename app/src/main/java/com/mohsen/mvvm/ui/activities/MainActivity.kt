package com.mohsen.mvvm.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.mohsen.mvvm.R
import com.mohsen.mvvm.database.localData.dao.WallDatabase
import com.mohsen.mvvm.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_RetroMVVM_NoActionbar)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContentView(binding.root)

        WallDatabase.getInstance(applicationContext)

    }


}