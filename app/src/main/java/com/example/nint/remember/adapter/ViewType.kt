package com.example.nint.recyclerview.adapter

import android.support.v7.widget.RecyclerView

interface ViewType {

  fun getItemViewType():Int

  fun onBindViewHolder(holder: RecyclerView.ViewHolder){}
}