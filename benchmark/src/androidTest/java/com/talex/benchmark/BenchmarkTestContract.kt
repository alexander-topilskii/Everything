package com.javent.benchmark

import androidx.benchmark.junit4.BenchmarkRule
import org.junit.Before

interface BenchmarkTestContract {
    /**
     * Annotate with [@get:Rule] on implementation
     */
    val benchmarkRule: BenchmarkRule

    @Before
    fun systemGC() {
        System.gc()
    }
}
