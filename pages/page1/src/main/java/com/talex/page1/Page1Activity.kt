package com.talex.page1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.talex.page1.ui.main.Page1Fragment

class Page1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page1_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, Page1Fragment.newInstance())
                .commitNow()
        }
    }
}