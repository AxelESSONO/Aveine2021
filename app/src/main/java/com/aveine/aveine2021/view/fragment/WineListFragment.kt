package com.aveine.aveine2021.view.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aveine.aveine2021.R
import com.aveine.aveine2021.view_model.WineListViewModel

class WineListFragment : Fragment() {

    companion object {
        fun newInstance() = WineListFragment()
    }

    private lateinit var viewModel: WineListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView : View = inflater.inflate(R.layout.wine_list_fragment, container, false)

        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WineListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}