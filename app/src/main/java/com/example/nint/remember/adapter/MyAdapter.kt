package com.example.nint.recyclerview.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup


class MyAdapter(private var list: List<ViewType>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int) = list[position].getItemViewType()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolderFactory.create(parent,viewType)

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) = list[position].onBindViewHolder(holder)

}
