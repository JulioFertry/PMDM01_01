fun ej01() {
    val vida = 100
    val personaje = "Naruto"
    println("El personaje $personaje tiene $vida puntos de vida")
}


fun ej03() {
    val cofre: Array<String> = arrayOf("Espada", "Escudo", "Poción")
    cofre.forEach { println("Has encontrado: $it") }
}


/** ej05 */
class Personaje(val nombre: String, val vida: Int, val ataque: Int) {

    fun mostrarInfo() {
        println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
    }

}

fun ej05() {
    val goku = Personaje("Goku", 100, 50)
    goku.mostrarInfo()
}


fun main() {
    ej01()
    ej03()
    ej05()
}