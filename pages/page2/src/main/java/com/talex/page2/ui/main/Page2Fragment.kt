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
import com.talex.recycler.adapter.AwesomeLayoutManager
import com.talex.recycler.adapter.ItemAdapter
import com.talex.recycler.adapter.ViewHolderDecorator
import com.talex.simpletextholder.SimpleTextDelegate
import com.talex.userholder.UserDelegate


class Page2Fragment : Fragment(R.layout.main_fragment), Counter by FragmentFrameCounter() {

    init {
        register(this)
    }

    private lateinit var viewModel: Page2ViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)

        viewModel = ViewModelProvider(this).get(Page2ViewModel::class.java)
    }

    private val myAdapter: ItemAdapter = ItemAdapter().apply {
        addDelegates(
            SimpleTextDelegate(),
            UserDelegate()
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(view.findViewById<RecyclerView>(R.id.page2_recyclerview)) {
            adapter = myAdapter
            addItemDecoration(ViewHolderDecorator())
            layoutManager = AwesomeLayoutManager(context)
        }

        with(viewModel) {
            dataLiveData.observe(viewLifecycleOwner) {
                myAdapter.submitList(it)
            }
        }
    }

    companion object {
        fun newInstance() = Page2Fragment()
    }
}
