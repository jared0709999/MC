package com.example.mc

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.mc.databinding.ActivitySplashScreenBinding
import com.example.mc.ui.cultura.CulturaFragment


class SplashScreen : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, CulturaFragment::class.java))
        finish()
    }
}