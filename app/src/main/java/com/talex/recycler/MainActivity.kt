package com.talex.recycler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.talex.page2.Page2Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this, Page2Activity::class.java))
    }
}