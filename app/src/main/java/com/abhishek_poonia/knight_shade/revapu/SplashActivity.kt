package com.abhishek_poonia.knight_shade.revapu

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity( Intent(this, MainActivity::class.java))
        finish()
    }
}
