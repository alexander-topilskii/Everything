package com.talex.page2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.talex.page2.ui.main.Page2Fragment

class Page2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page2_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, Page2Fragment.newInstance())
                .commitNow()
        }
    }
}