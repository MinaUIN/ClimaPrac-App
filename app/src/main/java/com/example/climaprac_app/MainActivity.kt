package com.example.climaprac_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
class MainActivity : AppCompatActivity() {

    var twCiudad:TextView? = null
    var tvGrados:TextView? = null
    var twEstatus:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        twCiudad = findViewById(R.id.twCiudad)
        tvGrados = findViewById(R.id.tvGrado)
        twEstatus = findViewById(R.id.twEstatus)





        val ciudad = intent.getStringExtra("com.romiuin.appclima.ciudades.CIUDAD")

        val ciudadfcp = Ciudad("Felipe Carrillo Puerto", 30, "Soleado")
        val ciudadtulum = Ciudad("Chetumal", 28, "Cielo Despejado")
        val ciudadcancun = Ciudad("Bacalar", 32, "Mayormente Soleado")
        val ciudadcozumel = Ciudad("Kantunilkin", 22, "Parcialmente Nublado")

        if(ciudad == "ciudad-fcp") {
            //mostrar informacion de fcp
            twCiudad?.text = ciudadfcp.nombre
            tvGrados?.text = ciudadfcp.grados.toString() + "°"
            twEstatus?.text = ciudadfcp.estatus

        }else if (ciudad == "ciudad-Chetumal") {
            //mostrar informacion de fcp
            twCiudad?.text = ciudadtulum.nombre
            tvGrados?.text = ciudadtulum.grados.toString() + "°"
            twEstatus?.text = ciudadtulum.estatus

        }else if (ciudad == "ciudad-Bacalar") {
            //mostrar informacion de fcp
            twCiudad?.text = ciudadcancun.nombre
            tvGrados?.text = ciudadcancun.grados.toString() + "°"
            twEstatus?.text = ciudadcancun.estatus
//Arreglado
        }else if (ciudad == "ciudad-Kantunilkin") {
            //mostrar informacion de fcp
            twCiudad?.text = ciudadcozumel.nombre
            tvGrados?.text = ciudadcozumel.grados.toString() + "°"
            twEstatus?.text = ciudadcozumel.estatus

        }else{
            Toast.makeText(this,"No se encuentra la información", Toast.LENGTH_SHORT).show()

        }
    }
}