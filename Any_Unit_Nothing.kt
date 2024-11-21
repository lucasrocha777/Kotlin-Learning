fun main() {
    a(valor = true) // O tipo any, recebe qualquer valor determinado pela variavel, desde Int a boolean!
    b() // Função do tipo vazio, não retorna valor, mas sim procedimento
    c() // Retorna um tratamento de exceção
}

fun a(valor: Any){
    println("Imprimindo o valor: $valor")
}

fun b():Unit{
    println("Função sem retorno (void)")
}

fun c():Nothing{
    TODO("Função ainda a ser completada")
}