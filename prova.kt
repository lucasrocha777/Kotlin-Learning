fun main () {
    val numerador = 10
    val denominador = 0
    try {
        val resultado = numerador / denominador
        println("Resultado: $resultado")
    } catch (e: ArithmeticException ) { println("Erro: Divisão por zero") }
}