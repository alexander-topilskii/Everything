package com.talex.page2.ui.main.recycler.firstHolder

import com.talex.page2.R
import com.talex.page2.ui.main.recycler.adapter.Item

class FirstItem(val text: String = FirstItem::javaClass.name) : Item {
    override fun getType() = R.layout.page2_first_item_view_holder
}