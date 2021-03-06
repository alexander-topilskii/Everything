package com.talex.core

import android.app.Activity
import android.view.View
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView


fun <ViewT : View> Activity.bindView(@IdRes idRes: Int): Lazy<ViewT> {
    return lazyUnsychronized {
        findViewById<ViewT>(idRes)
    }
}

fun <ViewT : View> View.bindView(@IdRes idRes: Int): Lazy<ViewT> {
    return lazyUnsychronized {
        findViewById<ViewT>(idRes)
    }
}

fun <ViewT : View> Fragment.bindView(@IdRes idRes: Int): Lazy<ViewT> {
    return lazyUnsychronized {
        view!!.findViewById<ViewT>(idRes)
    }
}

fun <ViewT : View> RecyclerView.ViewHolder.bindView(@IdRes idRes: Int): Lazy<ViewT> {
    return lazyUnsychronized {
        itemView.findViewById(idRes)
    }
}

fun <T> lazyUnsychronized(initializer: () -> T): Lazy<T> =
    lazy(LazyThreadSafetyMode.NONE, initializer)