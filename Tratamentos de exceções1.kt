import java.lang.ArithmeticException
import kotlin.math.sqrt

fun main() {
    val numerador = 10
    val denominador = 2
    try {
        val res = (numerador/denominador)
        println("Resultado da divisão: $res")
    }catch (e: ArithmeticException){
        println("Erro: Não existe divisão por zero!")
    }
    val numero = 4.0
    try {
        val res2 = sqrt(numero)
        if (numero < 0){
            throw IllegalArgumentException()
        }
        println("Resultado da radiciação: $res2")
    }catch (e: IllegalArgumentException){
        println("Não existe raiz real de numero negativos")
    }
}