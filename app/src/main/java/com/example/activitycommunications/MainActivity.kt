package com.example.activitycommunications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSecondActivity.setOnClickListener() {
            val intentSecond = Intent(this, Activity_Second::class.java)
            intentSecond.putExtra("myMsgToSecondActivity", txtMessageToSecondActivity.text.toString())
            startActivity(intentSecond)
        }
        btnThirdActivity.setOnClickListener() {
            val intentThird = Intent(this, Activity_Third::class.java)
            intentThird.putExtra("MyMsgToThirdActivity", txtMessageToThirdActivity.text.toString())
            startActivity(intentThird)
        }


    }
}
