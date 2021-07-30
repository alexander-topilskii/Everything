package com.talex.page2.ui.main.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T : Item>(viewGroup: ViewGroup, id: Int) : RecyclerView.ViewHolder(
    LayoutInflater.from(viewGroup.context).inflate(id, viewGroup, false)
) {
    abstract fun onBind(data: T)

    abstract fun getType(): Int
}