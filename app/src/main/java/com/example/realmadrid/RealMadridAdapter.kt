package com.example.realmadrid

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RealMadridAdapter(
    private val realMadridList: MutableList<Jugadores>,
    private val onClickListener: (Jugadores) -> Unit
) : RecyclerView.Adapter<RealMadridViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RealMadridViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return RealMadridViewHolder(layoutInflater.inflate(R.layout.item_realmadrid, parent, false))
    }

    override fun onBindViewHolder(holder: RealMadridViewHolder, position: Int) {
        val item = realMadridList[position]
        holder.render(item)
        holder.itemView.setOnClickListener { onClickListener(item) }
    }

    override fun getItemCount(): Int = realMadridList.size

    fun removeAt(position: Int) {
        realMadridList.removeAt(position)
        notifyItemRemoved(position)
    }

    fun addJugador(jugador: Jugadores) {
        realMadridList.add(jugador)
        notifyItemInserted(realMadridList.size - 1)
    }
}
