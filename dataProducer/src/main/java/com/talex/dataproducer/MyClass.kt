package com.talex.dataproducer

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

object Source {

    fun getNumbers(count: Int = 100): List<Int> = (0..count).shuffled()

    fun getFlowNumber(count: Int = 100): Flow<Int> {
        return flow<Int> {
            (0..count).shuffled().forEach {
                emit(it)
                delay(200)
            }
        }
    }

    fun getFlowNumbers(count: Int = 100): Flow<List<Int>> {
        return flow<List<Int>> {
            emit((0..count).shuffled())
        }
    }

}