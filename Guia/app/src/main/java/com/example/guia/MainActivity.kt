package com.example.guia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ejercicio1("Enmanuel Orellana", 12.75, 300,10)
        ejercicio2(5)
        Empleado("Enmanuel Orellana",600.0,"Administrativo", "Jefe", 20 ).SueldoF()
        Dado(2).Arrojar()
    }

    fun ejercicio1( nombre:String, pagoxhora:Double, horastrabajadas:Int, horasextra:Int){
        var sueldofinal: Double = (pagoxhora * horastrabajadas)
        var horas = (horasextra * pagoxhora)*2
        var sueldomashoras = sueldofinal + horas

        println("Nombre Empleado: $nombre," +
                " Sueldo Base: $sueldofinal, " +
                "Sueldo Base+ Horas Extra:  $sueldomashoras")

    }

    fun ejercicio2(numero:Int){
        val valor: Int = 10;

        for (x  in 1..10){
            println("$numero  x $x = ${numero*x}")
        }
    }
}