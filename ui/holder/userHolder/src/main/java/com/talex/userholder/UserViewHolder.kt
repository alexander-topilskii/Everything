package com.talex.userholder

import android.graphics.Rect
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.LayoutRes
import com.talex.baseviewholder.BaseViewHolder
import com.talex.baseviewholder.Item
import com.talex.core.bindView
import com.talex.imageloader.ImageLoader

class UserViewHolder(
    viewGroup: ViewGroup,
    @LayoutRes val id: Int
) : BaseViewHolder<UserItem>(
    viewGroup,
    id
) {

    private val title by bindView<TextView>(R.id.holder_user_title)
    private val subtitle by bindView<TextView>(R.id.holder_user_subtitle)
    private val image by bindView<ImageView>(R.id.holder_user_image)

    override fun onBind(data: UserItem) {
        title.text = data.name
        subtitle.text = data.surname
        ImageLoader.load(data.imageUrl, image)
    }

    override fun decorate(outRect: Rect, data: Item?) {
        super.decorate(outRect, data)

        outRect.bottom = 20
        outRect.top = 20
        outRect.left = 20
        outRect.right = 20
    }
}

