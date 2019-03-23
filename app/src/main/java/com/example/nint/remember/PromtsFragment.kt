package com.example.nint.remember

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nint.recyclerview.adapter.MyAdapter
import com.example.nint.recyclerview.adapter.ViewType
import com.example.nint.recyclerview.data.DataBirthday
import com.example.nint.recyclerview.data.DataWedding
import kotlinx.android.synthetic.main.prompts_fragment.*
import java.util.*

class PromtsFragment:Fragment(){

    private val List = listOf(
        DataBirthday(UUID.randomUUID().toString(),"08.05.1987", "Юскова","Венера"),
        DataWedding(UUID.randomUUID().toString(),"06.06.2016","Петров","Антон","Петрова","Елена"),
        DataBirthday(UUID.randomUUID().toString(), "30.11.1988","Баранова","Анна"),
        DataBirthday(UUID.randomUUID().toString(),"28.09.1986", "Мальцев","Владислав"),
        DataBirthday(UUID.randomUUID().toString(),"08.05.1987","Юскова","Венера"),
        DataWedding(UUID.randomUUID().toString(),"15.08.2016","Стрельцов","Михаил","Хирнова","Виктория")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.prompts_fragment, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here
        initRecyclerView()
    }

    fun initRecyclerView(){
        rv_list_items.layoutManager = LinearLayoutManager(activity)
        rv_list_items.adapter = MyAdapter(List as List<ViewType>)

    }

}