package com.talex.page2.ui.main

import androidx.lifecycle.MutableLiveData
import com.talex.dataproducer.Source
import com.talex.viewmodel.BaseViewModel
import com.talex.viewmodel.into
import kotlinx.coroutines.launch

class Page2ViewModel(val source: Source = Source) : BaseViewModel() {


    val dataLiveData = MutableLiveData<List<Int>>().also { liveData ->
        launch {
            source.getFlowNumbers().into(liveData)
        }
    }

}