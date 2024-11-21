fun vetor_nome(){
    var nomes = arrayOf("Lucas", "Gabriel", "Rocha", "Iza", "felipe", "Maria", "Sirius", "Aruk", "Perola")
    for (i in 0 .. (nomes.size -1)) {
        print("Nome: ${nomes[i]}\n")
    }
}
fun main() {
    vetor_nome()
}