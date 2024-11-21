fun main() {
    var str: String? = null
    str = "Lukasx"
    if (str == null){
        println("Variavel Nula")
    }else{
        println(str)
    }
    // Operador Elvis
    println(str ?: "Nula") // Operador Elvis lembra o operador ternario
}