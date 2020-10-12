package com.regency.app.overview.ui.overviewFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.regency.app.overview.R
import kotlinx.android.synthetic.main.fragment_overview.*

class OverviewFragment : Fragment(), (String) -> Unit {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_overview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        overview_recycler.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = OverviewAdapter(months, this@OverviewFragment)
        }

    }

    companion object {
        private val months = listOf("JANUARY",
            "FEBRUARY",
            "MARCH",
            "APRIL",
            "MAY",
            "JUNE",
            "JULY",
            "AUGUST",
            "SEPTEMBER",
            "OCTOBER",
            "NOVEMBER",
            "DECEMBER"
        )

    }

    override fun invoke(p1: String) {
        val action = OverviewFragmentDirections
            .actionOverviewFragmentToEntryFragment(p1)
        findNavController().navigate(action)
    }

}