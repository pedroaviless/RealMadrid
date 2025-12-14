package com.example.realmadrid

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RealMadridViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val nombreJugador = view.findViewById<TextView>(R.id.nombreJugador)
    val numeroJugador = view.findViewById<TextView>(R.id.numeroJugador)
    val posicionJugador = view.findViewById<TextView>(R.id.posicionJugador)
    val imgJugador = view.findViewById<ImageView>(R.id.imgJugador)

    fun render(realMadridModel: Jugadores) {
        nombreJugador.text = realMadridModel.nombre
        numeroJugador.text = realMadridModel.numero.toString()
        posicionJugador.text = realMadridModel.posicion
        Glide.with(imgJugador.context).load(realMadridModel.foto).into(imgJugador)

    }
}