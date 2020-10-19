package com.example.ioappium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BankingDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banking_details)
    }

    fun navigate(view: View)
    {
        val intent = Intent(this,HomeActivity::class.java)

        startActivity(intent)
    }
}
