package com.talex.simpletextholder

import com.talex.baseviewholder.Item


data class SimpleTextItem(
    val text: String = SimpleTextItem::javaClass.name
) : Item {
    override fun getType() = R.layout.holder_simple_text
}