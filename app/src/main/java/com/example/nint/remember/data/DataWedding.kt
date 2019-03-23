package com.example.nint.recyclerview.data

import android.support.v7.widget.RecyclerView
import com.example.nint.recyclerview.adapter.AdapterConstants
import com.example.nint.recyclerview.adapter.ViewHolderFactory
import com.example.nint.recyclerview.adapter.ViewType
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required

open class DataWedding():RealmObject(), ViewType {
    @Required
    @PrimaryKey
    private var id:String = ""

    private var dayWedding: String = ""
    private var firstNameMan: String = ""
    private var lastNameMan: String = ""
    private var firstNameWoman: String = ""
    private var lastNameWoman: String = ""

    constructor(id:String,
                dayWedding: String,
                firstNameMan: String,
                lastNameMan: String,
                firstNameWoman: String,
                lastNameWoman: String):this(){
        this.id = id
        this.dayWedding = dayWedding
        this.firstNameMan = firstNameMan
        this.lastNameMan = lastNameMan
        this.firstNameWoman = firstNameWoman
        this.lastNameWoman = lastNameWoman
    }

    override fun getItemViewType() = AdapterConstants.WEDDING

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder) {
        val weddingViewHolder = holder as ViewHolderFactory.WeddingViewHolder
        weddingViewHolder.dayWedding.text = dayWedding
        weddingViewHolder.firstNameMan.text = firstNameMan
        weddingViewHolder.lastNameMan.text = lastNameMan
        weddingViewHolder.firstNameWoman.text = firstNameWoman
        weddingViewHolder.lastNameWoman.text = lastNameWoman
        }
}