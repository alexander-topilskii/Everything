package com.talex.recycler.adapter

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.talex.baseviewholder.BaseViewHolder

class ViewHolderDecorator
    : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)

        val currentPosition = parent.getChildAdapterPosition(view)
        val viewHolder = parent.findViewHolderForAdapterPosition(currentPosition)


        val data = (parent.adapter as BaseAdapter<*, *, *>).list.getOrNull(currentPosition)

        if (viewHolder is BaseViewHolder<*>) {
            viewHolder.decorate(outRect, data)
        }
    }

}