package com.example.guia

class Dado(var numero:Int) {

    fun Arrojar(){
        var numeroF = 0

        if(numero >=1 && numero <=6){
            var aleatorio = (1..20).random()
            numeroF = aleatorio
            println("El numero aleatorio es: $numeroF")

        }
        else{
            numeroF = 1
            println("Usted ha Arrojado un valor mayor que 6 por lo su numero final es de: $numeroF")
        }

    }
}