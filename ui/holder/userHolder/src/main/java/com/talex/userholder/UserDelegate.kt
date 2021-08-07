package com.talex.userholder

import android.view.ViewGroup
import com.talex.baseviewholder.BaseDelegate

class UserDelegate : BaseDelegate<UserItem, UserViewHolder> {

    val id: Int = R.layout.holder_user

    override fun isForViewType(viewType: Int) = id == viewType

    override fun createViewHolder(parent: ViewGroup) = UserViewHolder(parent, id)

    override fun bindViewHolder(holder: UserViewHolder, data: UserItem) {
        holder.onBind(data)
    }
}