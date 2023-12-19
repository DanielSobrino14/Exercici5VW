import java.util.*

fun main() {
    println("Benvingut a la calculadora de preu de la teva Furgoneta Volkswagen")
    val versioFurgo = demanarVersio()
    val PneumaticsEstat = demanarEstatPneumatics()
    mostrarPreus(versioFurgo, PneumaticsEstat)
}

fun demanarVersio(): String {
    println("Quina versió de la Volkswagen Grand California tens? (normal/camper)")
    return readLine()?.toLowerCase() ?: "normal"
}

fun demanarEstatPneumatics(): Int {
    println("Quants quilòmetres tenen els pneumàtics?")
    val quilometresPneumatics = llegirLong("Aquests son els quilòmetres", 0.0, 100000.0)
    return when {
        quilometresPneumatics <= 5000 -> 0
        quilometresPneumatics <= 10000 -> 200
        else -> 300
    }
}

fun mostrarPreus(versioFurgo: String, PneumaticsEstat: Int) {
    val preuBase = calcularPreuBase(versioFurgo)
    val preuActual = calcularPreuActual(PneumaticsEstat.toDouble(), preuBase, false, 0)

    println("El preu base de la furgó és: €$preuBase")
    println("El preu que té actualment és: €$preuActual")
}

