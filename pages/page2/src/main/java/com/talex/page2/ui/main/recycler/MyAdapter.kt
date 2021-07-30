package com.talex.page2.ui.main.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.talex.page2.ui.main.recycler.secondHolder.SecondViewHolder


class MyAdapter : RecyclerView.Adapter<BaseViewHolder<Item>>() {
    var list: List<Item> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Item> {
        when(viewType) {
            MyViewHolder.id -> {
                return MyViewHolder(parent) as BaseViewHolder<Item>
            }
            SecondViewHolder.id -> {
                return SecondViewHolder(parent) as BaseViewHolder<Item>
            }
        }
        return MyViewHolder(parent) as BaseViewHolder<Item>
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Item>, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].getType()
    }

    override fun getItemCount() = list.size

}
