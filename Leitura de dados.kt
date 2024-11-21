fun main() {
    val l = readLine()
    var num = readLine()?.toInt() ?: 0
    var num2 = readlnOrNull()?.toInt() ?: 0
    var num3 = readlnOrNull()?.toDouble() ?: 0
    var num4 = readlnOrNull()?.toFloat() ?: 0f
    var num5 = readlnOrNull()?.toBoolean() ?: false
    println("Tipo string: $l")
    println("Tipo Inteiro: $num")
    println("Tipo Inteiro2: $num2")
    println("Tipo Double: $num3")
    println("Tipo Float: $num4")
    println("Tipo Boolean: $num5")
}