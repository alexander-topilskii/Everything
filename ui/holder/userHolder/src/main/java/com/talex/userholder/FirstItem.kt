package com.talex.userholder


class FirstItem(val text: String = FirstItem::javaClass.name) : com.talex.baseviewholder.Item {
    override fun getType() = R.layout.page2_first_item_view_holder
}