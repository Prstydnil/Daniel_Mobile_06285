package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private var list: ArrayList<Animals> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        list.addAll(AnimalsData.listData)
        showRecycler()
    }

    private fun showRecycler() {
        val recyclerView = findViewById<RecyclerView>(R.id.rvAnimals)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val AnimalAdapter = AnimalAdapter(list)
        recyclerView.adapter = AnimalAdapter
        recyclerView.setHasFixedSize(true)
    }
}