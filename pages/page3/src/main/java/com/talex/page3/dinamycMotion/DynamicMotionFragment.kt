package com.talex.page3.dinamycMotion

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import androidx.fragment.app.Fragment
import com.talex.page3.R

class DynamicMotionFragment : Fragment(R.layout.page3_dynamic_motion_fragment) {

    companion object {
        fun newInstance() = DynamicMotionFragment()
    }

    private lateinit var viewModel: DynamicMotionViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = ViewModelProvider(this).get(DynamicMotionViewModel::class.java)

    }

}