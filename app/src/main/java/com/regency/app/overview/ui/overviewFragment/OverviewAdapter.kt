package com.regency.app.overview.ui.overviewFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.regency.app.overview.R
import kotlinx.android.synthetic.main.over_each_item.view.*

class OverviewAdapter(
    private val list: List<String>,
    private val listener: (String) -> Unit) :
    RecyclerView.Adapter<OverviewAdapter.OverviewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OverviewViewHolder {
        return OverviewViewHolder(LayoutInflater.from(parent.context), parent)
    }

    override fun onBindViewHolder(holder: OverviewViewHolder, position: Int) {
        val month = list[position]
        holder.bind(month)
        holder.itemView.setOnClickListener{listener(month)}
    }

    override fun getItemCount(): Int =    list.size

    class OverviewViewHolder(inflater: LayoutInflater, parent: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate
            (R.layout.over_each_item, parent, false)){

        fun bind(month : String){
            itemView.over_each_month_name.text = month
        }

    }

}