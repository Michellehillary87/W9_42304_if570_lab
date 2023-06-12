package com.example.android.trackmysleepquality.sleeptracker

import android.view.LayoutInflater
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.R
import com.example.android.trackmysleepquality.TextItemViewHolder
import com.example.android.trackmysleepquality.database.SleepNight

class SleepNightAdapter: RecyclerView.Adapter<TextItemViewHolder>() {

    var data =  listOf<SleepNight>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    var data = listOf<SleepNight>()

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: TextItemViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }


    val layoutInflater = LayoutInflater.from(parent.context)
    val view = layoutInflater
        .inflate(R.layout.text_item_view, parent, false) as TextView
}