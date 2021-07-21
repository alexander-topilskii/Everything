package com.talex.benchmark

class FrameCounter {
    private var lastTimestamp = 0L

    private val droppedFrameThreshold = 17_666_666L
    private var droppedFramesTotal = 0L

    private val renderer = SyncedRenderer { currentTimestamp: Long ->
        val frameTime = currentTimestamp - lastTimestamp

        if (frameTime > droppedFrameThreshold && lastTimestamp != 0L) {
            val droppedFramesNow = frameTime / droppedFrameThreshold
            droppedFramesTotal += droppedFramesNow
            println("FrameDrops @ now: $droppedFramesNow | total: $droppedFramesTotal")
        }

        lastTimestamp = currentTimestamp
    }

    fun onStart() = renderer.start()
    fun onStop() = renderer.stop()
}

