fun main() {
    // Classifique as pessoas pela faixa etaria
    // Idoso - 60 anos acima | Adulto - entre 21 e 59 | Jovem - entre 13 e 20 anos | Criança -  12 anos ou abaixo

    var idade: Int = 13
    if (idade <= 12)
        println("Essa pessoa eh uma crianca!")
    else if (idade >= 13 && idade <= 20)
        println("Essa pessoa eh jovem!")
    else if (idade >= 21 && idade <= 59)
        println("Essa pessoa eh adulta!")
    else if (idade >= 60)
        println("Essa pessoa eh Idosa!")
}