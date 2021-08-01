package com.talex.page2.ui.main.recycler

import android.view.ViewGroup
import com.talex.page2.ui.main.recycler.adapter.BaseViewHolder
import com.talex.page2.ui.main.recycler.adapter.Item

interface BaseDelegate<T : Item, VH : BaseViewHolder<T>> {
    fun isForViewType(viewType: Int): Boolean
    fun createViewHolder(parent: ViewGroup): VH
    fun bindViewHolder(holder: VH, data: T)
}