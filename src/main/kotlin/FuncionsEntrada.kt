import java.util.*

fun llegirInt(pMessage : String, pMin : Int, pMax : Int) : Int{
    var valor : Int = 0
    val scan : Scanner = Scanner(System.`in`)
    var correctType : Boolean = false

    do{
        println(pMessage)
        correctType = scan.hasNextInt()

        if(!correctType){
            println("ERROR")
        }else{
            valor = scan.nextInt()

            if(valor < pMin || valor > pMax){
                println("ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    }while(!correctType)
    return valor
}
fun llegirLong(pMessage: String, pMin: Double, pMax: Double): Long {
    var valor: Long = 0
    val scan: Scanner = Scanner(System.`in`)
    var correctType: Boolean

    do {
        println(pMessage)
        correctType = scan.hasNextLong()

        if (!correctType) {
            println("ERROR")
        } else {
            valor = scan.nextLong()

            if (valor < pMin || valor > pMax) {
                println("ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    } while (!correctType)
    return valor
}
fun llegirDouble(pMessage : String, pMin : Double, pMax : Double) : Double {
    var valor : Double = 0.0
    val scan : Scanner = Scanner(System.`in`)
    var correctType : Boolean = false

    do{
        println(pMessage)
        correctType = scan.hasNextDouble()

        if(!correctType){
            println("ERROR")
        }else{
            valor = scan.nextDouble()

            if(valor < pMin || valor > pMax){
                println("ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    }while(!correctType)
    return valor
}
