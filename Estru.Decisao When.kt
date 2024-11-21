fun main() {
    var cargo:String = "Gerente"
    when(cargo){
        "Presidente" -> println(10000f)
        "Gerente Geral" -> println(7500f)
        "Gerente" -> println(6000f)
        "Coordenador" -> println(4500)
        "Analista" -> println(3500f)
        "Estagiario" -> println(2000f)
        else -> println("Cargo não identificado")
    }

    var imc:Float = 20f
        when(imc) {
            10f -> println("O IMC esta 10 ou abaixo")
            20f -> println("O IMC esta 20 ou abaixo")
            30f -> println("O IMC esta 30 ou abaixo")
            50f -> println("O IMC esta 50 ou abaixo")
            else -> println("IMC esta acima do normal")
    }


}