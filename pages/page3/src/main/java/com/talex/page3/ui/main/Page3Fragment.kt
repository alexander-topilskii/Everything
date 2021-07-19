package com.talex.page3.ui.main

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.talex.page3.R

class Page3Fragment : Fragment(R.layout.page3_fragment) {

    companion object {
        fun newInstance() = Page3Fragment()
    }

    private lateinit var viewModel: Page3ViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = ViewModelProvider(this).get(Page3ViewModel::class.java)

    }

}