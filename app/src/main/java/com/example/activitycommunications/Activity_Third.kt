package com.example.activitycommunications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity__second.*
import kotlinx.android.synthetic.main.activity__third.*

class Activity_Third : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__third)

        val intent=intent
        var message = intent.getStringExtra("myMsgToThirdActivity")
        lblInfoActivityThird.text=message
    }
}
