fun colorVerde() = "\u001B[32m"
fun colorAzul() = "\u001B[34m"
fun colorAmarillo() = "\u001B[33m"
fun colorRojo() = "\u001B[31m"
fun colorLila() = "\u001B[35m"
fun colorReset() = "\u001B[0m"

fun main() {
    println("${colorVerde()}Benvingut a la calculadora de preu de la teva Furgoneta Volkswagen${colorReset()}")
    val versioFurgo = demanarVersio()
    val PneumaticsEstat = demanarEstatPneumatics()
    mostrarPreus(versioFurgo, PneumaticsEstat)
}
fun demanarVersio(): String {
    println("${colorAmarillo()}Quina versió de la Volkswagen Grand California tens? (normal/camper)${colorReset()}")
    return readln().toLowerCase()
}
fun demanarEstatPneumatics(): Int {
    val quilometresPneumatics = llegirLong("${colorAzul()}Quants quilòmetres tenen els pneumàtics?${colorReset()}", 0.0, 100000.0)
    return when {
        quilometresPneumatics <= 5000 -> 0
        quilometresPneumatics <= 10000 -> 200
        else -> 300
    }
}
fun mostrarPreus(versioFurgo: String, PneumaticsEstat: Int) {
    val preuBase = calcularPreuBase(versioFurgo)
    val preuActual = calcularPreuActual(PneumaticsEstat.toDouble(), preuBase, false, 0)

    println("${colorRojo()}El preu base de la furgó és: €$preuBase${colorReset()}")
    println("${colorLila()}El preu que té actualment és: €$preuActual${colorReset()}")
}

