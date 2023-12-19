
fun calcularPreuBase(versio: String): Double {
        return when (versio) {
            "camper" -> 93490.0
            else -> 73490.0
        }
    }

    fun calcularPreuActual(PneumaticsEstat: Int, preuBase: Double, TéPortabicis: Boolean, EdatVehicle: Int): Double {
        val depreciacioPerKilometre = when {
            EdatVehicle >= 6 && EdatVehicle <= 10 -> 0.0002
            EdatVehicle > 10 -> 0.0004
            else -> 0.00001
        }
        val preuTéPortabicis = if (TéPortabicis) {
            preuAjustat + 250
        } else return preuAjustat

        println("Quants quilòmetres ha recorregut la furgo?")
        val quilometresRecorreguts = llegirLong()
        val depreciació = preuBase * depreciacióPerKilometre * quilometresRecorreguts
        val preuAmbAjust = preuBase - PneumaticsEstat


        return if (preuTéPortabicis - depreciació < 0) {
            0.0
        } else preuTéPortabicis - depreciació
    }
}
