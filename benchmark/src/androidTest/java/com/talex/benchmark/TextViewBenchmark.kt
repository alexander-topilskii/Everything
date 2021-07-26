package com.talex.benchmark

import android.content.Context
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Benchmark, which will execute on an Android device.
 *
 * The body of [BenchmarkRule.measureRepeated] is measured in a loop, and Studio will
 * output the result. Modify your code to see how it affects performance.
 */
@RunWith(AndroidJUnit4::class)
class TextViewBenchmark {

    @get:Rule
    val benchmarkRule = BenchmarkRule()

    @Test
    fun `frame_layout_text_view`() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val inflater = LayoutInflater.from(context)
        val root = FrameLayout(context)
        benchmarkRule.measureRepeated {
            inflater.inflate(R.layout.page1_frame_layout_text_view, root, false)
        }
    }

    @Test
    fun `text_view`() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val inflater = LayoutInflater.from(context)
        val root = FrameLayout(context)
        benchmarkRule.measureRepeated {
            inflater.inflate(R.layout.page1_frame_text_view, root, false)
        }
    }

    @Test
    fun `constrint_text_view_0dp`() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val inflater = LayoutInflater.from(context)
        val root = FrameLayout(context)
        benchmarkRule.measureRepeated {
            inflater.inflate(R.layout.page1_constraint_layout_with_text_0dp, root, false)
        }
    }

    @Test
    fun `constrint_text_view_match_parent`() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val inflater = LayoutInflater.from(context)
        val root = FrameLayout(context)
        benchmarkRule.measureRepeated {
            inflater.inflate(R.layout.page1_constraint_layout_with_text_match_parent, root, false)
        }
    }

    @Test
    fun `linear_text_view_wrap_content`() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val inflater = LayoutInflater.from(context)
        val root = FrameLayout(context)
        benchmarkRule.measureRepeated {
            inflater.inflate(R.layout.page1_linear_layout_text_view, root, false)
        }
    }

    @Test
    fun `linear_text_view_match_parent`() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val inflater = LayoutInflater.from(context)
        val root = FrameLayout(context)
        benchmarkRule.measureRepeated {
            inflater.inflate(R.layout.page1_linear_layout_text_view_match_parent, root, false)
        }
    }

}