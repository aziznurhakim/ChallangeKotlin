package Challenge.VolBola
import java.util.*

fun main() {
    var jari: Float
    var volumephi: Float
    var reader = Scanner(System.`in`)
    print("Masukkan Jari Jari : ")
    jari = reader.nextFloat()
    volumephi =  ((jari * jari * jari * 22 * 4 / 7)/ 3)
    val s = String.format("%.2f", volumephi)
    println("=====================")
    print("Jadi Volume Bola : $s")
}
