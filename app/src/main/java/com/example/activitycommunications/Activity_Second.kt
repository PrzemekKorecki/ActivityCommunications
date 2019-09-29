package com.example.activitycommunications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity__second.*

class Activity_Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__second)

        val intent=intent
        var message = intent.getStringExtra("myMsg")
        lblInfo.text=message
    }
}
