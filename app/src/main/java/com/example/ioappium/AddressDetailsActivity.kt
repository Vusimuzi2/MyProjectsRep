package com.example.ioappium

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AddressDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address_details)

    }

    fun navigate(view: View)
    {
        val intent = Intent(this,BankingDetailsActivity::class.java)

        startActivity(intent)
    }
}
