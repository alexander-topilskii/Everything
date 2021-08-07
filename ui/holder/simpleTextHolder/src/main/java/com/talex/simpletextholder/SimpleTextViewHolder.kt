package com.talex.simpletextholder

import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.LayoutRes

class SimpleTextViewHolder(
    viewGroup: ViewGroup,
    @LayoutRes val id: Int
) : com.talex.baseviewholder.BaseViewHolder<SimpleTextItem>(
    viewGroup,
    id
) {

    override fun onBind(data: SimpleTextItem) {
        itemView.findViewById<TextView>(R.id.holder_simple_text_title)?.text = data.text
    }

}

