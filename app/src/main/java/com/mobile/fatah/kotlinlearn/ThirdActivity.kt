package com.mobile.fatah.kotlinlearn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val layoutM = LinearLayoutManager(this)
        layoutM.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutM

        val adapter = HobiAdapter(this, hobi.jenisHobi)
        recyclerView.adapter = adapter

    }
}
