package com.talex.benchmark

class FrameCounter {
    private var lastTimestamp = 0L

    private val droppedFrameThreshold = 17_666_666L
    private var droppedFrames = 0L

    private val renderer = SyncedRenderer { currentTimestamp: Long ->
        val frameTime = currentTimestamp - lastTimestamp

        if (frameTime > droppedFrameThreshold) {
            droppedFrames += frameTime / droppedFrameThreshold
            println("GGGG dropped frames: $droppedFrames")
        }

        lastTimestamp = currentTimestamp
    }

    fun onStart() =  renderer.start()
    fun onStop() =  renderer.stop()
}