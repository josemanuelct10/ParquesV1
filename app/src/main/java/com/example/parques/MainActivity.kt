package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.parques.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val TAG="info"
        binding.botonGuardar.setOnClickListener{

            val miDialogo = MiDialogFragment()
            miDialogo.show(supportFragmentManager, "MiDialogo")
            /*if (binding.cbZonaMascotas.isChecked)
                Log.d(TAG, "Las actividades del parque son:, ${binding.cbZonaMascotas.text}")

            // Para el spinner
            Log.d(TAG, "La hora de apertura es ${binding.horaApertura.selectedItem} y la hora de cierre es ${binding.horaCierre.selectedItem}")*/
        }



    }
}