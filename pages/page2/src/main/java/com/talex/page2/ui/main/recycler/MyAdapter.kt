package com.talex.page2.ui.main.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.talex.page2.R

class MyAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var list: List<Any> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.page2_item_view_holder, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.page2_recyclerview_view_holder_textview).text = "ahahha $position"
    }

    override fun getItemCount() = list.size

}