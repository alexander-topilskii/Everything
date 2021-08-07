package com.talex.baseviewholder

import android.graphics.Rect
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T : Item>(
    viewGroup: ViewGroup,
    @LayoutRes id: Int
) : RecyclerView.ViewHolder(
    LayoutInflater.from(viewGroup.context).inflate(id, viewGroup, false)
) {

    fun <ViewT : View> bindView(@IdRes idRes: Int): Lazy<ViewT> {
        return lazy {
            itemView.findViewById(idRes)
        }
    }

    open fun decorate(outRect: Rect, data: Item) = Unit

    abstract fun onBind(data: T)

}