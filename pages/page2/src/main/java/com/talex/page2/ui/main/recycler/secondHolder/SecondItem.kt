package com.talex.page2.ui.main.recycler.secondHolder

import com.talex.page2.R
import com.talex.page2.ui.main.recycler.adapter.Item

class SecondItem(val text: String = SecondItem::javaClass.name) : Item {
    override fun getType() = R.layout.page2_second_item_view_holder
}