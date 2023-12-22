fun colorVerde() = "\u001B[32m"
fun colorAzul() = "\u001B[34m"
fun colorAmarillo() = "\u001B[33m"
fun colorRojo() = "\u001B[31m"
fun colorLila() = "\u001B[35m"
fun colorReset() = "\u001B[0m"

/**
 * Función principal que inicia la aplicación para calcular el precio de una furgoneta Volkswagen.
 */
fun main() {
    imprimirAsciiArt()
    println("${colorVerde()}Benvingut a la calculadora de preu de la teva Furgoneta Volkswagen${colorReset()}")
    val versioFurgo = demanarVersio()
    val PneumaticsEstat = demanarEstatPneumatics()
    mostrarPreus(versioFurgo, PneumaticsEstat)
}

fun imprimirAsciiArt() {
    println("${colorAzul()}   _____       _            _           ")
    println("  / ____|     | |          | |          ")
    println(" | |  __  __ _| | ___ _ __ | |_ ___     ")
    println(" | | |_ |/ _` | |/ _ \\ '_ \\| __/ _ \\    ")
    println(" | |__| | (_| | |  __/ | | | || (_) |   ")
    println("  \\_____|\\__,_|_|\\___|_| |_|\\__\\___/    ${colorReset()}")

}

/**
 * Función para solicitar al usuario la versión de la furgoneta que tiene.
 * @return Versión de la furgoneta: "normal" o "camper".
 */
fun demanarVersio(): String {
    println("${colorAmarillo()}Quina versió de la Volkswagen Grand California tens? (normal/camper)${colorReset()}")
    return readln().toLowerCase()
}

/**
 * Función para determinar el estado de los neumáticos y asignar un valor de depreciación.
 * @return Valor de depreciación basado en los kilómetros de los neumáticos.
 */
fun demanarEstatPneumatics(): Int {
    val quilometresPneumatics = llegirLong("${colorAzul()}Quants quilòmetres tenen els pneumàtics?${colorReset()}", 0.0, 100000.0)
    return when {
        quilometresPneumatics <= 5000 -> 0
        quilometresPneumatics <= 10000 -> 200
        else -> 300
    }
}

/**
 * Función que muestra el precio base y el precio actual de la furgoneta.
 */
fun mostrarPreus(versioFurgo: String, PneumaticsEstat: Int) {
    val preuBase = calcularPreuBase(versioFurgo)
    val preuActual = calcularPreuActual(PneumaticsEstat.toDouble(), preuBase, false, 0)

    println("${colorRojo()}El preu base de la furgó és: €$preuBase${colorReset()}")
    println("${colorLila()}El preu que té actualment és: €$preuActual${colorReset()}")
}
