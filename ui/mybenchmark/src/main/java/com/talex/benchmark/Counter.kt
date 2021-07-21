package com.talex.benchmark

import androidx.lifecycle.LifecycleOwner

interface Counter {
    fun register(lifecycleOwner: LifecycleOwner)
}