package com.example.nint.recyclerview.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.nint.remember.R

class ViewHolderFactory {

    class WeddingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val dayWedding = itemView.findViewById<TextView>(R.id.tv_date_wedding)
        val firstNameMan = itemView.findViewById<TextView>(R.id.tv_first_name_man)
        val lastNameMan = itemView.findViewById<TextView>(R.id.tv_last_name_man)
        val firstNameWoman = itemView.findViewById<TextView>(R.id.tv_first_name_woman)
        val lastNameWoman = itemView.findViewById<TextView>(R.id.tv_last_name_woman)
    }

    class BirthViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val dayBorn = itemView.findViewById<TextView>(R.id.tv_date_born)
        val firstName = itemView.findViewById<TextView>(R.id.tv_first_name)
        val lastName = itemView.findViewById<TextView>(R.id.tv_last_name)
    }


    companion object {
        fun create(parent: ViewGroup, ViewType: Int): RecyclerView.ViewHolder {
            return when (ViewType) {
                AdapterConstants.BIRTH -> {
                    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_birth, parent, false)
                    BirthViewHolder(view)
                }
                AdapterConstants.WEDDING -> {
                    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_wedding, parent, false)
                    WeddingViewHolder(view)
                }
                else -> null!!
            }
        }
    }
}