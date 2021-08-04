package com.example.expandablelistview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.expandablelistview2.Adapters.ExpandableAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var map: HashMap<String, List<String>>
    lateinit var titleList: ArrayList<String>
    lateinit var expandableAdapter: ExpandableAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        expandableAdapter = ExpandableAdapter(titleList, map)

        expandable_list_view.setAdapter(expandableAdapter)


    }

    private fun loadData() {
        map = HashMap()

        val list = arrayListOf<String>("Real Madrid", "Barcelona")
        map["Spain"] = list

        val englend = arrayListOf<String>("Chelsea", "Arsenal")
        map["England"] = englend

        val italiya = arrayListOf<String>("Roma", "Juventus")
        map["Italy"] = italiya

        titleList = ArrayList()
        titleList = ArrayList()
        titleList = ArrayList()

        titleList.add("Spain")
        titleList.add("England")
        titleList.add("Italy")

    }
}