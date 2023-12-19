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
fun llegirLong(pMessage : String, pMin : Long, pMax : Long) : Long {
    var valor : Int = 0
    val scan : Scanner = Scanner(System.`in`)
    var correctType : Boolean = false

    do{
        println(pMessage)
        correctType = scan.hasNextLong()

        if(!correctType){
            println("ERROR")
        }else{
            valor = scan.nextLong().toInt()

            if(valor < pMin || valor > pMax){
                println("ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    }while(!correctType)
    return valor.toLong()
}
fun llegirDouble(pMessage : String, pMin : Double, pMax : Double) : Double {
    var valor : Int = 0
    val scan : Scanner = Scanner(System.`in`)
    var correctType : Boolean = false

    do{
        println(pMessage)
        correctType = scan.hasNextDouble()

        if(!correctType){
            println("ERROR")
        }else{
            valor = scan.nextDouble().toInt()

            if(valor < pMin || valor > pMax){
                println("ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    }while(!correctType)
    return valor.toDouble()
}
