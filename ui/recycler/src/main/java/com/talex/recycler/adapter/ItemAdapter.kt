package com.talex.recycler.adapter

import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import com.talex.baseviewholder.BaseDelegate
import com.talex.baseviewholder.BaseViewHolder
import com.talex.baseviewholder.Item

class ItemAdapter(
    private val diffUtil: ItemCallback<Item> = defaultDiffer
) : BaseAdapter<Item, BaseViewHolder<Item>, BaseDelegate<Item, BaseViewHolder<Item>>>() {

    override fun getItemCount(): Int {
        return mDiffer.currentList.size
    }

    fun submitList(list: List<Item>) {
        mDiffer.submitList(list)
    }

    override fun getItemViewType(position: Int): Int {
        return mDiffer.currentList[position].getType()
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Item>, position: Int) {
        holder.onBind(mDiffer.currentList[position])
    }

    private val mDiffer: AsyncListDiffer<Item> = AsyncListDiffer<Item>(this, diffUtil)

}

val defaultDiffer = object : ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean = oldItem == newItem
    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean = oldItem == newItem
}