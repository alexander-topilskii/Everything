package com.talex.page2.ui.main

import androidx.lifecycle.MutableLiveData
import com.talex.baseviewholder.Item
import com.talex.dataproducer.Source
import com.talex.simpletextholder.SimpleTextItem
import com.talex.viewmodel.BaseViewModel
import com.talex.viewmodel.into
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class Page2ViewModel(private val source: Source = Source) : BaseViewModel() {

    val dataLiveData = MutableLiveData<List<Item>>().also { liveData ->
        launch {
            source.getChangeableFlowNumbers(50, 5 * 60_000)
                .map(::toUiModel)
                .into(liveData)
        }
    }

    private fun toUiModel(list: List<Int>): List<Item> = list.mapIndexed { index, item ->
        SimpleTextItem(text = "item:$item")
    }

}