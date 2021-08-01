package com.talex.recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T : Item>(viewGroup: ViewGroup, @LayoutRes id: Int) : RecyclerView.ViewHolder(
    LayoutInflater.from(viewGroup.context).inflate(id, viewGroup, false)
) {
    abstract fun onBind(data: T)

}