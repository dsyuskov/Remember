package com.example.nint.recyclerview.data

import android.support.v7.widget.RecyclerView
import com.example.nint.recyclerview.adapter.AdapterConstants
import com.example.nint.recyclerview.adapter.ViewHolderFactory
import com.example.nint.recyclerview.adapter.ViewType
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required

open class DataBirthday(): RealmObject(), ViewType{
    @Required
    @PrimaryKey
    private var id: String = ""

    private var dayBorn: String =""
    private var firstName: String =""
    private var lastName:String =""

    constructor(id:String, dayBorn:String,firstName:String, lastName:String):this(){
        this.id = id
        this.dayBorn = dayBorn
        this.firstName = firstName
        this.lastName = lastName
    }

    override fun getItemViewType() = AdapterConstants.BIRTH

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder) {
        val birthViewHolder = holder as ViewHolderFactory.BirthViewHolder
        birthViewHolder.dayBorn.text=dayBorn
        birthViewHolder.firstName.text=firstName
        birthViewHolder.lastName.text=lastName
    }
}