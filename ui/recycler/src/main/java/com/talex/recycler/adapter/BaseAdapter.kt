package com.talex.recycler.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


abstract class BaseAdapter<T : Item, VH : BaseViewHolder<T>, D : BaseDelegate<T, VH>> : RecyclerView.Adapter<VH>() {
    var list: List<T> = emptyList()
     private val delegates = mutableListOf<BaseDelegate<T, VH>>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val delegate = delegates.find { it.isForViewType(viewType) }
        return delegate?.createViewHolder(parent) ?: error("not found delegate for type $viewType")
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].getType()
    }

    override fun getItemCount() = list.size

    open fun addDelegates(vararg delegates: Any): BaseAdapter<T, VH, D> {
        delegates
            .filterIsInstance<BaseDelegate<T, VH>>()
            .forEach { delegate ->
                this.delegates.add(delegate)
            }

        return this
    }

}

