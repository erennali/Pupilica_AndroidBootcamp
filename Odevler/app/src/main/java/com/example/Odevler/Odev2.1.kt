package com.example.Odevler

class Odev2Set {
    fun celsiusFahrenheitCevir(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    fun dikdortgenCevresi(uzunluk: Double, genislik: Double): Double {
        return 2 * (uzunluk + genislik)
    }

    fun faktoriyelHesapla(sayi: Int): Long {
        if (sayi < 0) throw IllegalArgumentException("Sayı sıfırdan küçük olamaz")
        var sonuc: Long = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    fun aHarfiSay(kelime: String): Int {
        return kelime.count { it == 'a' || it == 'A' }
    }
}

fun main() {
    val odev = Odev2Set()
    
    println("Celsius değerini giriniz:")
    val celsius = readLine()?.toDoubleOrNull() ?: 0.0
    println("$celsius°C = ${odev.celsiusFahrenheitCevir(celsius)}°F")
    
    println("\nDikdörtgenin uzunluğunu giriniz:")
    val uzunluk = readLine()?.toDoubleOrNull() ?: 0.0
    println("Dikdörtgenin genişliğini giriniz:")
    val genislik = readLine()?.toDoubleOrNull() ?: 0.0
    println("Dikdörtgenin çevresi: ${odev.dikdortgenCevresi(uzunluk, genislik)}")
    
    println("\nFaktöriyel hesaplamak için bir sayı giriniz:")
    val sayi = readLine()?.toIntOrNull() ?: 0
    println("$sayi! = ${odev.faktoriyelHesapla(sayi)}")
    
    println("\nİçinde kaç 'a' harfi olduğunu öğrenmek istediğiniz kelimeyi giriniz:")
    val kelime = readLine() ?: ""
    println("'$kelime' kelimesinde ${odev.aHarfiSay(kelime)} adet 'a' harfi vardır.")
} 