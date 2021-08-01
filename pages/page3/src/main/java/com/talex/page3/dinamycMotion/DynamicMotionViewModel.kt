package com.talex.page3.dinamycMotion

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.talex.dataproducer.Source
import com.talex.viewmodel.BaseViewModel
import com.talex.viewmodel.into
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class DynamicMotionViewModel (private val source: Source = Source) : BaseViewModel() {

    val dataLiveData = MutableLiveData<List<String>>().also { liveData ->
        launch {
            source.getFlowNumbers().map { list ->
                list.mapIndexed { index, item ->
                    "$index: -> $item some text"
                }
            }.into(liveData)
        }
    }

}