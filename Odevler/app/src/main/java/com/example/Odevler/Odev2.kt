package com.example.Odevler

class Odev2 {

    fun icAcilariHesapla(kenarSayisi: Int): Int {
        if (kenarSayisi < 3) throw IllegalArgumentException("Bir çokgen en az 3 kenara sahip olmalıdır")
        return (kenarSayisi - 2) * 180
    }

    fun maasHesapla(calismaGunu: Int): Double {
        val gunlukSaat = 8
        val normalSaatUcreti = 10.0
        val mesaiSaatUcreti = 20.0
        val normalSaatSiniri = 160

        val toplamSaat = calismaGunu * gunlukSaat
        
        return if (toplamSaat <= normalSaatSiniri) {
            toplamSaat * normalSaatUcreti
        } else {
            (normalSaatSiniri * normalSaatUcreti) + 
            ((toplamSaat - normalSaatSiniri) * mesaiSaatUcreti)
        }
    }

    fun kotaUcretiHesapla(kullanilanGB: Int): Double {
        val temelKota = 50
        val temelUcret = 100.0
        val ekGBUcreti = 4.0

        return if (kullanilanGB <= temelKota) {
            temelUcret
        } else {
            temelUcret + ((kullanilanGB - temelKota) * ekGBUcreti)
        }
    }
}

fun main() {
    val odev = Odev2()
    
    println("İç açıların toplamını hesaplamak için kenar sayısını giriniz:")
    val kenarSayisi = readLine()?.toIntOrNull() ?: 0
    println("$kenarSayisi kenarlı çokgen için iç açılar toplamı: ${odev.icAcilariHesapla(kenarSayisi)}°")
    
    println("\nMaaş hesaplamak için çalışma günü sayısını giriniz:")
    val calismaGunu = readLine()?.toIntOrNull() ?: 0
    println("$calismaGunu gün çalışma için maaş: ${odev.maasHesapla(calismaGunu)}₺")
    
    println("\nİnternet ücreti hesaplamak için kullanılan GB miktarını giriniz:")
    val kullanilanGB = readLine()?.toIntOrNull() ?: 0
    println("$kullanilanGB GB kullanım için internet ücreti: ${odev.kotaUcretiHesapla(kullanilanGB)}₺")
} 