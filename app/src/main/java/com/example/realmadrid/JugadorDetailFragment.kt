package com.example.realmadrid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.realmadrid.databinding.FragmentJugadorDetailBinding

class JugadorDetailFragment : Fragment() {

    private var _binding: FragmentJugadorDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentJugadorDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val nombre = it.getString("nombre")
            val numero = it.getInt("numero")
            val posicion = it.getString("posicion")
            val foto = it.getString("foto")
            val info = it.getString("info")

            binding.nombreJugador.text = nombre
            binding.numeroJugador.text = numero.toString()
            binding.posicionJugador.text = posicion
            binding.infoJugador.text = info
            Glide.with(this).load(foto).into(binding.imgJugador)

            binding.btnVolver.setOnClickListener {
                volverAtras()
            }

        }

    }

    private fun volverAtras() {
        requireActivity().supportFragmentManager.popBackStack()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
