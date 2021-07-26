package com.talex.page2.ui.main.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.annotation.NonNull

import android.view.LayoutInflater
import android.view.View

import androidx.annotation.LayoutRes


class MyAdapter : RecyclerView.Adapter<BaseViewHolder>() {
    var list: List<Any> = emptyList()


    val delegatesHolder = DelegatesHolder()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return delegatesHolder.createViewHolder(viewType, parent)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount() = list.size

}

class DelegatesHolder {

    val delegates = mutableListOf<ViewHolderDelegate>().also {
        it.add(ViewHolderDelegate())
    }

    fun createViewHolder(viewType: Int, parent: ViewGroup): BaseViewHolder {
        val id = delegates.find {
            it.getViewType() == viewType
        }
        error("ahaha")

//        return LayoutInflater
//            .from(parent.context)
//            .inflate(id, parent, false)
    }


}