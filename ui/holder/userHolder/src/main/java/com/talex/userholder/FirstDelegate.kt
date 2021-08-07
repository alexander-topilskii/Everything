package com.talex.userholder

import android.view.ViewGroup
import com.talex.baseviewholder.BaseDelegate

class FirstDelegate : BaseDelegate<FirstItem, FirstViewHolder> {

    val id: Int = R.layout.page2_first_item_view_holder

    override fun isForViewType(viewType: Int) = id == viewType

    override fun createViewHolder(parent: ViewGroup) = FirstViewHolder(parent, id)


    override fun bindViewHolder(holder: FirstViewHolder, data: FirstItem) {
        holder.onBind(data)
    }

}