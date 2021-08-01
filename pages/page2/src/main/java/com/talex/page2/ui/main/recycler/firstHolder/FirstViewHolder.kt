package com.talex.page2.ui.main.recycler.firstHolder

import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.LayoutRes
import com.talex.page2.R
import com.talex.recycler.adapter.BaseViewHolder

class FirstViewHolder(
    viewGroup: ViewGroup,
    @LayoutRes val id: Int
) : BaseViewHolder<FirstItem>(
    viewGroup,
    id
) {

    override fun onBind(data: FirstItem) {
        itemView.findViewById<TextView>(R.id.page2_recyclerview_view_holder_textview)?.text = data.text
    }

}

