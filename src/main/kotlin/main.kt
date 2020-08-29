package Challenge

import java.util.*
import Challenge.VolBalok.main

fun main() {
    val input = Scanner(System.`in`)

    print("Name : ")
    input.nextLine()

    print("kelas : ")
    input.nextLine()

    print("No absen : ")
    input.nextInt()

    println("==========================")
    println("Kamu ingin Menghitung apa?")
    println("1. Volume Balok")
    println("2. Volume Bola")
    println("0. Batal")
    println("==========================")
    println("Pilihanmu : ")

    when (input.nextInt()) {
    1 -> {
        main()
    }
    2 -> {
        Challenge.VolBola.main()
    }
    0 -> {

    }
    }
}