package com.example.realmadrid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.realmadrid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(this)
        val adapter =
            RealMadridAdapter(JugadoresProvider.jugadoresList.toMutableList()) { jugador ->
                onItemSelected(jugador)
            }

        binding.recyclerRealMadrid.layoutManager = manager
        binding.recyclerRealMadrid.adapter = adapter

        val swipeToDeleteCallback =
            object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
                override fun onMove(
                    recyclerView: RecyclerView,
                    viewHolder: RecyclerView.ViewHolder,
                    target: RecyclerView.ViewHolder
                ): Boolean {
                    return false
                }

                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                    val position = viewHolder.bindingAdapterPosition
                    adapter.removeAt(position)
                }
            }

        val itemTouchHelper = ItemTouchHelper(swipeToDeleteCallback)
        itemTouchHelper.attachToRecyclerView(binding.recyclerRealMadrid)
    }

    fun onItemSelected(jugador: Jugadores) {
        val fragment = JugadorDetailFragment().apply {
            arguments = Bundle().apply {
                putString("nombre", jugador.nombre)
                putInt("numero", jugador.numero)
                putString("posicion", jugador.posicion)
                putString("foto", jugador.foto)
                putString("info", jugador.info)
            }
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .addToBackStack(null)
            .commit()
    }


}
