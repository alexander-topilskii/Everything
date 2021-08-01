package com.talex.page2.ui.main

import androidx.lifecycle.MutableLiveData
import com.talex.dataproducer.Source
import com.talex.recycler.adapter.Item
import com.talex.page2.ui.main.recycler.firstHolder.FirstItem
import com.talex.page2.ui.main.recycler.secondHolder.SecondItem
import com.talex.viewmodel.BaseViewModel
import com.talex.viewmodel.into
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class Page2ViewModel(private val source: Source = Source) : BaseViewModel() {

    val dataLiveData = MutableLiveData<List<Item>>().also { liveData ->
        launch {
            source.getFlowNumbers().map { list ->
                list.mapIndexed { index, item ->
                    if (index % 2 == 0) {
                        FirstItem(text = item.toString())
                    } else {
                        SecondItem(text = item.toString())
                    }
                }
            }.into(liveData)
        }
    }

}