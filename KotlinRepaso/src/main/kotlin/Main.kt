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
class Personaje(val nombre: String, var vida: Int, val ataque: Int) {

    fun mostrarInfo() {
        println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
    }

}

fun ej05() {
    val goku = Personaje("Goku", 100, 50)
    goku.mostrarInfo()
}


fun ej07() {
    val operacion: (Int, Int) -> Int = { num1, num2 -> num1 + num2 }
    println(operacion(3, 4))

    fun multiplicar(num: Int): Int {
        return num * 2
    }
    println(multiplicar(5))

}


fun ejFinal() {
    val goku = Personaje("Goku", 100, 20)
    val vegeta = Personaje("Vegeta", 80, 25)

    while (goku.vida > 0 && vegeta.vida > 0) {
        goku.vida -= vegeta.ataque
        vegeta.vida -= goku.ataque
        println("Vida de ${goku.nombre}: ${goku.vida}")
        println("Vida de ${vegeta.nombre}: ${vegeta.vida}")
    }

    if (goku.vida <= 0) {
        println("Vegeta ha ganado el combate")
    } else {
        println("Goku ha ganado el combate")
    }

}


fun main() {
    ej01()
    ej03()
    ej05()
    ej07()
    ejFinal()
}