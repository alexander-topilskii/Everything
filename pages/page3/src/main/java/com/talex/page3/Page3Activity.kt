package com.talex.page3

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.talex.page3.dinamycMotion.DynamicMotionFragment
import com.talex.page3.ui.main.Page3Fragment

class Page3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page3_activity)

        val listPages = listOf(
            "Simple Motion" to Page3Fragment.newInstance(),
            "Dynamic Motion" to DynamicMotionFragment.newInstance()
        )

        with(findViewById<ListView>(R.id.navigation_list)) {
            val adapter = ArrayAdapter(context, android.R.layout.simple_list_item_1, listPages.map { it.first })

            setAdapter(adapter)
            setOnItemClickListener { _, _, position, _ ->
                supportFragmentManager.beginTransaction()
                    .add(R.id.container, listPages[position].second, listPages[position].first)
                    .commitNow()
            }
        }
    }
}