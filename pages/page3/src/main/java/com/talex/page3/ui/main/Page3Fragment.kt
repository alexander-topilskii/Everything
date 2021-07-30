package com.talex.page3.ui.main

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources
import androidx.lifecycle.ViewModelProvider
import androidx.fragment.app.Fragment
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ImageView>(R.id.image).setImageDrawable(AppCompatResources.getDrawable(requireContext(), R.color.red))
    }

}