package com.talex.simpletextholder


class SimpleTextItem(val text: String = SimpleTextItem::javaClass.name) : com.talex.baseviewholder.Item {
    override fun getType() = R.layout.holder_simple_text
}