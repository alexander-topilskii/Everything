package com.talex.page2.ui.main.recycler

import android.view.ViewGroup
import android.widget.TextView
import com.talex.page2.R

class MyViewHolder(
    viewGroup: ViewGroup,

    ) : BaseViewHolder<FirstItem>(viewGroup, id) {

    override fun onBind(data: FirstItem) {
        itemView.findViewById<TextView>(R.id.page2_recyclerview_view_holder_textview).text = data.text
    }

    override fun getType() = id

    companion object {
        val id: Int = R.layout.page2_item_first_view_holder
    }

}

