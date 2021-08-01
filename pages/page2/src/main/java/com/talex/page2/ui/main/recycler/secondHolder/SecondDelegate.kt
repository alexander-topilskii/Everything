package com.talex.page2.ui.main.recycler.secondHolder

import android.view.ViewGroup
import com.talex.page2.R
import com.talex.recycler.adapter.BaseDelegate

class SecondDelegate : BaseDelegate<SecondItem, SecondViewHolder> {

    val id: Int = R.layout.page2_second_item_view_holder

    override fun isForViewType(viewType: Int) = id == viewType

    override fun createViewHolder(parent: ViewGroup) = SecondViewHolder(parent, id)

    override fun bindViewHolder(holder: SecondViewHolder, data: SecondItem) {
        holder.onBind(data)
    }

}