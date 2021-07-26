package com.talex.page2.ui.main.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.talex.page2.R

class MyViewHolder : BaseViewHolder(
    R.layout.page2_item_view_holder, null
) {

    override fun onBind(get: Any) {
        super.onBind(get)
        itemView.findViewById<TextView>(R.id.page2_recyclerview_view_holder_textview).text = "ahahha $adapterPosition"
    }

}

open class BaseViewHolder(@LayoutRes layoutId: Int, viewGroup: ViewGroup?) : RecyclerView.ViewHolder(
    LayoutInflater.from(viewGroup!!.context).inflate(layoutId, viewGroup, false)
) {

    open fun onBind(get: Any) {

    }

}

open class ViewHolderDelegate() {
    fun getViewType() = 0

    fun getViewId() = 0

}