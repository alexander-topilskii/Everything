package com.talex.page3.ui.main

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import androidx.fragment.app.Fragment
import com.talex.page3.R

class Page3Fragment : Fragment(R.layout.page3_motion_layout_2) {

    companion object {
        fun newInstance() = Page3Fragment()
    }

    private lateinit var viewModel: Page3ViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = ViewModelProvider(this).get(Page3ViewModel::class.java)

    }

}