package com.talex.simpletextholder

import android.view.ViewGroup
import com.talex.baseviewholder.BaseDelegate

class SimpleTextDelegate : BaseDelegate<SimpleTextItem, SimpleTextViewHolder> {

    val id: Int = R.layout.holder_simple_text

    override fun isForViewType(viewType: Int) = id == viewType

    override fun createViewHolder(parent: ViewGroup) = SimpleTextViewHolder(parent, id)


    override fun bindViewHolder(holder: SimpleTextViewHolder, data: SimpleTextItem) {
        holder.onBind(data)
    }

}