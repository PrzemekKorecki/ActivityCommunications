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
            val intent = Intent(this, Activity_Second::class.java)
            intent.putExtra("myMsgToSecondActivity", txtMessageToSecondActivity.text.toString())
            startActivity(intent)
        }
        btnThirdActivity.setOnClickListener() {
            val intent2 = Intent(this, Activity_Third::class.java)
            intent2.putExtra("MyMsgToThirdActivity", txtMessageToThirdActivity.text.toString())
            startActivity(intent2)
        }
    }
}
