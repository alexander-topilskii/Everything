package com.talex.userholder

import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.LayoutRes

class FirstViewHolder(
    viewGroup: ViewGroup,
    @LayoutRes val id: Int
) : com.talex.baseviewholder.BaseViewHolder<FirstItem>(
    viewGroup,
    id
) {

    override fun onBind(data: FirstItem) {
        itemView.findViewById<TextView>(R.id.page2_recyclerview_view_holder_textview)?.text = data.text
    }

}

