package com.talex.page2.ui.main.recycler

import com.talex.page2.R

class FirstItem(val text: String = FirstItem::javaClass.name) : Item {
    override fun getType() = R.layout.page2_item_first_view_holder
}