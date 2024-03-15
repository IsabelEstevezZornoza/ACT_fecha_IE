package org.example

class Fecha(private val dia: Int, private val mes: Int, private val anio: Int) {


    fun valida(): Boolean {

        if (dia < 1 || dia > 31) return false
        if (mes < 1 || mes > 12) return false

        // determinamos la cantidad de días del mes:
        var diasMes = diaDelMes()
        when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> diasMes = 31
            4, 6, 9, 11 -> diasMes = 30
            2 -> diasMes = if (anio % 400 == diaDelMes() || anio % 4 == diaDelMes() && anio % 100 != diaDelMes()) 29 else 28
        }
        return if (dia > diasMes) false else true
    } // … más métodos

    private fun diaDelMes(): Int {
        var diasMes = 0
        return diasMes
    }
}