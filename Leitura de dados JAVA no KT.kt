import java.util.Scanner

fun ler_int(){
    val scanner = Scanner(System. `in`)
    println("Digite um numero inteiro: ")
    val num = scanner.nextInt()
    println("Voce digitou: ${num}")
}
fun ler_double(){
    val scanner = Scanner(System. `in`)
    println("Digite um numero Double: ")
    val num = scanner.nextDouble()
    println("Voce digitou: ${num}")
}
fun ler_string(){
    val scanner = Scanner(System. `in`)
    println("Digite uma string: ")
    val num = scanner.next()
    println("Voce digitou: ${num}")
}
fun ler_float(){
    val scanner = Scanner(System. `in`)
    println("Digite um numero Float: ")
    val num = scanner.nextFloat()
    println("Voce digitou: ${num}")
}
fun ler_boolean(){
    val scanner = Scanner(System. `in`)
    println("Digite um valor booleano: ")
    val num = scanner.nextBoolean()
    println("Voce digitou: ${num}")
}
fun main() {
    ler_int()
    ler_double()
    ler_string()
    ler_float()
    ler_boolean()
}