package com.talex.page2.ui.main.recycler.secondHolder

import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.LayoutRes
import com.talex.page2.R
import com.talex.page2.ui.main.recycler.adapter.BaseViewHolder

class SecondViewHolder(viewGroup: ViewGroup, @LayoutRes id: Int) : BaseViewHolder<SecondItem>(viewGroup, id) {

    override fun onBind(data: SecondItem) {
        itemView.findViewById<TextView>(R.id.page2_second_item_view_holder_text_view).text = data.text
    }

}