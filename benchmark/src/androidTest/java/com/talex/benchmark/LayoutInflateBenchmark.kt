package com.talex.benchmark

import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import androidx.test.annotation.UiThreadTest
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.javent.benchmark.ActivityTestContract
import com.javent.benchmark.BenchmarkTestContract
import com.talex.page2.Page2Activity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class LayoutInflateBenchmark: BenchmarkTestContract, ActivityTestContract<Page2Activity> {
    @get:Rule
    override val benchmarkRule: BenchmarkRule = BenchmarkRule()

    @get:Rule
    override val activityRule = ActivityTestRule(Page2Activity::class.java)

    @UiThreadTest
    @Test
    fun renderConstraintLayout() {
        activityRule.activity.let {
            benchmarkRule.measureRepeated {
                it.setContentView(R.layout.page2_activity)
            }
        }
    }

    @UiThreadTest
    @Test
    fun renderLinearLayout() {
        activityRule.activity.let {
            benchmarkRule.measureRepeated {
                it.setContentView(R.layout.page2_activity)
            }
        }
    }

    @UiThreadTest
    @Test
    fun renderRelativeLayout() {
        activityRule.activity.let {
            benchmarkRule.measureRepeated {
                it.setContentView(R.layout.page2_activity)
            }
        }
    }
}
