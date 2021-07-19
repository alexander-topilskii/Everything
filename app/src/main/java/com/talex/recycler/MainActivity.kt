package com.talex.recycler

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.talex.page1.Page1Activity
import com.talex.page2.Page2Activity
import com.talex.page3.Page3Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listPages = listOf(
            "Page 1 Benchmarks" to Intent(this, Page1Activity::class.java),
            "Page 2 Recycler" to Intent(this, Page2Activity::class.java),
            "Page 3 Motion" to Intent(this, Page3Activity::class.java)
        )

        with(findViewById<ListView>(R.id.navigation_list)) {
            val adapter = ArrayAdapter(context, android.R.layout.simple_list_item_1, listPages.map { it.first })

            setAdapter(adapter)
            setOnItemClickListener { _, _, position, _ ->
                startActivity(listPages[position].second)

            }
        }
    }
}