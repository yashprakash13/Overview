package com.regency.app.overview.ui.entryFragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.regency.app.overview.R

class EntryFragment : Fragment() {

    val args : EntryFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_entry, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val month = args.monthValue
        setUpViews(month)
    }

    private fun setUpViews(month: String) {
        if (month != "None"){
            setUpViewsWithMonth(month)
        }else{
            setUpNewEntryViews()
        }
    }

    private fun setUpViewsWithMonth(month: String) {

    }

    private fun setUpNewEntryViews() {

    }

}