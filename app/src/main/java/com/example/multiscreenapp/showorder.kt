package com.example.multiscreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_showorder.*

class showorder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showorder)

        val ordersOfCustomer=intent.getStringExtra(MainActivity.KEY)

        tvorder.text="Order Placed:" +ordersOfCustomer.toString()
    }
}