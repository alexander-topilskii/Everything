package com.talex.imageloader

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

object ImageLoader {


    fun load(url: String, imageView: ImageView, @DrawableRes placeHolderId: Int? = null) {
        println("GGGG ImageLoader.load")
        if (placeHolderId != null) {
            Glide
                .with(imageView)
                .load(url)
                .centerCrop()
                .placeholder(placeHolderId)
                .into(imageView)
        } else {
            Glide
                .with(imageView)
                .load(url)
                .centerCrop()
                .into(imageView)
        }
    }
}

val listener = object : RequestListener<Drawable> {
    override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Drawable>?, isFirstResource: Boolean): Boolean {
        println("GGGG ImageLoader.onLoadFailed $e")
        return true
    }

    override fun onResourceReady(resource: Drawable?, model: Any?, target: Target<Drawable>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
        println("GGGG ImageLoader.onResourceReady")
        return true
    }

}