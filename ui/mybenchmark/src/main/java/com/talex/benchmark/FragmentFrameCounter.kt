package com.talex.benchmark

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class FragmentFrameCounter : LifecycleObserver, Counter {

    private val frameCounter = FrameCounter()

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        frameCounter.onStart()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        frameCounter.onStop()
    }

    override fun register(lifecycleOwner: LifecycleOwner) {
        lifecycleOwner.lifecycle.addObserver(this)
    }

}