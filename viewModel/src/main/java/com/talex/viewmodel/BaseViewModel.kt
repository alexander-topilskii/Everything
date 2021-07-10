package com.talex.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.transform
import kotlin.coroutines.CoroutineContext

open class BaseViewModel: ViewModel(), CoroutineScope by CoroutineImpl() {

}

suspend fun <T> Flow<T>.into(liveData: MutableLiveData<T>) = collect {
    liveData.postValue(it)
}


public inline fun <T, R> Flow<T>.convert(crossinline transform: suspend T.() -> R): Flow<R> = transform { value ->
    return@transform emit(value.transform())
}

// TODO: Extract me to common module
class CoroutineImpl : CoroutineScope {
    override val coroutineContext: CoroutineContext = Dispatchers.IO + SupervisorJob()
}