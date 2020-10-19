package com.example.ioappium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


    }

    fun navigate(view: View)
    {
       val intent = Intent(this,AddressDetailsActivity::class.java)

        startActivity(intent)
    }
}
