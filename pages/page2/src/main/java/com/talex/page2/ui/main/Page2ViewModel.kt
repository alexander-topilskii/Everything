package com.talex.page2.ui.main

import androidx.lifecycle.MutableLiveData
import com.talex.baseviewholder.Item
import com.talex.dataproducer.Source
import com.talex.simpletextholder.SimpleTextItem
import com.talex.userholder.UserItem
import com.talex.viewmodel.BaseViewModel
import com.talex.viewmodel.into
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlin.random.Random

class Page2ViewModel(private val source: Source = Source) : BaseViewModel() {

    val dataLiveData = MutableLiveData<List<Item>>().also { liveData ->
        launch {
            source.getFlowNumbers(50)
                .map(::toUiModel)
                .into(liveData)
        }
    }

    private fun toUiModel(list: List<Int>): List<Item> = list.mapIndexed { index, item ->
        if (Random.nextBoolean()) {
            SimpleTextItem(text = "index:$index")
        } else {
            UserItem(
                name = "index:$index",
                surname = "sur:$item",
                imageUrl = "https://image.flaticon.com/icons/png/512/21/21104.png"
            )
        }
    }

}