/*fun main() {
    var idade: Int =17
    if (idade >=18)
        println("Essa pessoa é adulta!")
    else if (idade <18)
        println("Essa pessoa é menor de idade!")
}**//////
fun media (a:Float,b:Float,c:Float,d:Float):Float{
    return a+b+c+d
}
/*fun main() {
    var n1F=11F
    var n2F=3F
    var n3F=6F
    var n4F=7F
    println("Media ${media(n1F, n2F, n3F, n4F)/4}")
    var med=media(n1F, n2F, n3F, n4F)/4
    if (med>=7)
        println("Aprovado!")
    else if (med>=4 && med<7)
        println("Está de recuperação!")
    else if (med<4)
        println("O aluno está reprovado!")
}*/

fun main() {
    val numero = 10
    var ehPrimo = true

    if (numero <= 1) {
        ehPrimo = false
    } else {
        for (i in 2 until numero) {
            if (numero % i == 0) {
                ehPrimo = false
                break
            }
        }
    }

    if (ehPrimo) {
        println("$numero é um número primo.")
    } else {
        println("$numero não é um número primo.")
    }
}