package com.talex.page2.ui.main

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.talex.benchmark.Counter
import com.talex.benchmark.FragmentFrameCounter
import com.talex.page2.R
import com.talex.page2.ui.main.recycler.BaseDelegate
import com.talex.page2.ui.main.recycler.BaseAdapter
import com.talex.page2.ui.main.recycler.ItemAdapter
import com.talex.page2.ui.main.recycler.adapter.BaseViewHolder
import com.talex.page2.ui.main.recycler.adapter.Item
import com.talex.page2.ui.main.recycler.firstHolder.FirstDelegate
import com.talex.page2.ui.main.recycler.secondHolder.SecondDelegate

class Page2Fragment : Fragment(R.layout.main_fragment), Counter by FragmentFrameCounter() {

    init {
        register(this)
    }

    private lateinit var viewModel: Page2ViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)

        viewModel = ViewModelProvider(this).get(Page2ViewModel::class.java)
    }

    private val myAdapter = ItemAdapter().addDelegates(
        FirstDelegate(),
        SecondDelegate()
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(view.findViewById<RecyclerView>(R.id.page2_recyclerview)) {
            adapter = myAdapter
            layoutManager = LinearLayoutManager(context)
        }

        with(viewModel) {
            dataLiveData.observe(viewLifecycleOwner) {
                myAdapter.list = it
                myAdapter.notifyDataSetChanged()
            }
        }
    }

    companion object {
        fun newInstance() = Page2Fragment()
    }
}