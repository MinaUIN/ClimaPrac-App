package com.example.climaprac_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class Ciudades : AppCompatActivity(){

    val TAG = "com.romiuin.appclima.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bFcp = findViewById<Button>(R.id.bFcp)
        val bTulum = findViewById<Button>(R.id.bChetumal)
        val bCancun = findViewById<Button>(R.id.bBacalar)
        val bCozumel = findViewById<Button>(R.id.bKantunilkin)

        bFcp.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-fcp")
            startActivity(intent)

        })
        bTulum.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-Chetumal")
            startActivity(intent)
        })
        bCancun.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-Bacalar")
            startActivity(intent)
        })
        bCozumel.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-Kantunilkin")
            startActivity(intent)
        })
    }
}