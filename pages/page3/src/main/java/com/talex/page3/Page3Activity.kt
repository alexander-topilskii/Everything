package com.talex.page3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.talex.page3.ui.main.Page3Fragment

class Page3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page3_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, Page3Fragment.newInstance())
                .commitNow()
        }
    }
}