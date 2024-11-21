fun main() {
    for (i in 1..20){ // Estrutura de repetição FOR Crescente de 1 em 1.
        println("${i} ")
    }

    println("\n") //Quebra de linha
    for (i in 20 downTo 1) { // Estutura de repetição FOR Decrescente de 1 em 1.
        println("${i}")
    }
    println("\n")
    var str = "Criação de aplicativos android"
    for (i in str){
        println("${i}")
    }
    println("\n")
    for (i in 1..20 step 2){ // Estrutura de repetição FOR Crescente de 2 em 2.
        println("${i} ")
    }
    println("\n") //Quebra de linha
    for (i in 20 downTo 1 step 3) { // Estutura de repetição FOR Decrescente de 3 em 3.
        println("${i}")
    }

}