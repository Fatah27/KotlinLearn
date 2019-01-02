package com.mobile.fatah.kotlinlearn

data class Hobi(var nama: String)
object hobi {
    val jenisHobi = listOf<Hobi>(
        Hobi("berenang"),
        Hobi("Membaca"),
        Hobi("Berjalan"),
        Hobi("Tidur"),
        Hobi("Bermain Bola")

    )
}



