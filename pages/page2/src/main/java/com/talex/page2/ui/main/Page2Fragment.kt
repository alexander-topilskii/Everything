package com.talex.page2.ui.main

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.fragment.app.Fragment
import com.talex.page2.R

class Page2Fragment : Fragment(R.layout.main_fragment) {

    companion object {
        fun newInstance() = Page2Fragment()
    }

    private lateinit var viewModel: Page2ViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = ViewModelProvider(this).get(Page2ViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(viewModel) {
            dataLiveData.observe(viewLifecycleOwner) {
                println("GGGG $it")
            }
        }
    }

}