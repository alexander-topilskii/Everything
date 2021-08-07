package com.talex.baseviewholder

import android.view.ViewGroup

interface BaseDelegate<T : Item, VH : BaseViewHolder<T>> {
    fun isForViewType(viewType: Int): Boolean
    fun createViewHolder(parent: ViewGroup): VH
    fun bindViewHolder(holder: VH, data: T)
}