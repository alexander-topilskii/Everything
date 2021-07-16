package com.javent.benchmark

import androidx.appcompat.app.AppCompatActivity
import androidx.test.rule.ActivityTestRule
import org.junit.After

interface ActivityTestContract<T: AppCompatActivity> {
    /**
     * Annotate with [@get:Rule] on implementation
     */
    val activityRule: ActivityTestRule<T>

    @After
    fun finishActivity() {
        activityRule.activity.finish()
    }
}
