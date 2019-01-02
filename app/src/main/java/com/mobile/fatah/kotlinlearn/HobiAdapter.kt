package com.mobile.fatah.kotlinlearn

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.list_item.view.*

class HobiAdapter(val context: Context, val hobi: List<Hobi>) : RecyclerView.Adapter<HobiAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(
            R.layout.list_item,
            p0, false
        )
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobi.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, posisi: Int) {
        val hobi = hobi[posisi]
        holder.setData(hobi, posisi)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var hobii: Hobi? = null
        var posisiSaatini: Int = 0

        init {
            itemView.setOnClickListener {
                Toast.makeText(context, hobii!!.nama + " terClick !", Toast.LENGTH_SHORT).show()
            }
        }

        fun setData(hobi: Hobi?, posisi: Int) {
            itemView.tvHobi.text = hobi!!.nama
            this.hobii = hobi
            this.posisiSaatini = posisi
        }
    }
}
