
fun main() {
    println("Benvingut a la calculadora de preu de la teva FUrgoneta Volkswaggen")
    val versioFurgo = demanarVersio()
    val PneumaticsEstat = demanarEstatPneumatics()
    mostrarPreus(versioFurgo, PneumaticsEstat)
}
fun demanarVersio(): String {
    println("Quina versió de la Volkswagen Grand California tens? (normal/camper)")
    return readln().toLowerCase()
}
fun demanarEstatPneumatics(): Int {
    println("Quants quilòmetres tenen els pneumàtics?")
    val quilometresPneumatics = llegirInt()
    return when {
        quilometresPneumatics <= 5000 -> 0
        quilometresPneumatics <= 10000 -> 200
        else -> 300
    }
}
fun mostrarPreus(versioFurgo: String, PneumaticsEstat: Int) {
    val preuBase = calcularPreuBase(versioFurgo)
    val preuActual = calcularPreuActual(preuBase, PneumaticsEstat)

    println("El preu base de la furgó és: €$preuBase")
    println("El preu que té actualment és: €$preuActual")
}
