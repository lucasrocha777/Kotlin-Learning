
fun impressao(){
    println("Funcao sem parametro e sem retorno")
}
fun soma(a:Int, b:Int):Int{ // Funcao com parametro e com retorno do tipo inteiro
    return a+b
}
fun soma_2(a:Int,b:Int){
    println("A soma das variaveis são: ${a+b}")
}

fun main() {
    impressao()
    var x = 10
    var y = 24
    print(soma(x, y))
    print("\n")
    soma_2(x,y)
}