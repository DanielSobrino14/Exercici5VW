
fun calcularPreuBase(versio: String): Double {
        return when (versio) {
            "camper" -> 93490.0
            else -> 73490.0
        }
    }

    fun calcularPreuActual(PneumaticsEstat: Double, preuBase: Double, TéPortabicis: Boolean, EdatVehicle: Int): Double {
        val depreciacióPerKilometre = when {
            EdatVehicle >= 6 && EdatVehicle <= 10 -> 0.0002
            EdatVehicle > 10 -> 0.0004
            else -> 0.00001
        }
        println("Quants quilòmetres ha recorregut la furgo?")
        val quilometresRecorreguts = llegirLong()
        val depreciació = preuBase * depreciacióPerKilometre * quilometresRecorreguts
        val preuAmbAjust = preuBase - PneumaticsEstat

        val preuTéPortabicis = if (TéPortabicis) {
            preuAmbAjust + 250
        } else return preuAmbAjust

        return if (preuTéPortabicis - depreciació < 0) {
            0.0
        } else preuTéPortabicis - depreciació
    }
