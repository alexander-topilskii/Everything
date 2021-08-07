package com.talex.userholder


data class UserItem(
    val name: String,
    val surname: String,
    val imageUrl: String
) : com.talex.baseviewholder.Item {
    override fun getType() = R.layout.holder_user
}