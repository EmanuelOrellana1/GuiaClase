package com.example.guia

class Empleado (var nombre:String, var sueldo:Double, var area:String, var cargo:String, var tiempoT:Int){

    fun SueldoF(){
        if(sueldo < 0){
            println("SU SUELDO NO PUEDE SER MENOR A 0")
        }
        else if (area.isEmpty() || cargo.isEmpty()){
            println("RELLENE TODO LOS CAMPOS")
        }
        else{
            var sueldoextra:Int=25*(tiempoT/5)
            var sueldodeveng = sueldoextra + sueldo

            println("Nombre: $nombre, Su tiempo de trabajo es: $tiempoT años, Su sueldo base es de: $sueldo, El total por sus años de trabajo es de: $sueldodeveng")
        }
    }

}