fun vetor_inteiro(){
    var numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for (i in 0 .. (numeros.size-1)){
        print("${numeros[i]} ")
    }
    print("\n")
    print("Acessando a setima posição: ${numeros[7]}")
    print("\n")
}
fun vetor_inteiro2() {
    var n = Array(10, { i -> i })
    for (i in n) {
        print("${n[i]} ")
    }
    print("\n")
}
fun vetor_bool(){
    var a = booleanArrayOf(true, false, true, true, false)
    for (i in 0 .. (a.size-1)){
        print("${a[i]} ")
    }
    print("\n")
}
fun vetor_str(){
    var a = arrayOf("Boa Vista", "Roraima", "Brasil")
    for (i in 0 .. (a.size-1)){
        print("${a[i]} ")
    }
    println("\n")
    print("Estado: ${a[1]}")
}
//desafio: Fazer fun vetor de char e float!

fun main() {
    vetor_inteiro()
    vetor_inteiro2()
    vetor_bool()
    vetor_str()
}