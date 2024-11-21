import kotlin.math.sqrt

fun main() {
    try{
        var s:String? = null
        //s= "Lucass"
        println("O tamanho da string é: ${s!!.length}")

        var a:Int = 10/0
        println("O resultado da divisão será: $a")

        var b = -9.0
        var c:Double = sqrt(b)
            if (b<0){
                throw IllegalArgumentException()
            }
        var x = 1
            if (x==1){
                throw Exception("O valor de x não pode ser 1")
            }
    }catch (e: NullPointerException){
        println("A variável está vazia")
    }catch (e: ArithmeticException){
        println("Não existe divisão por zero")
    }catch (e: IllegalArgumentException){
        println("Não existe raiz de numero negativo, sendo exclusivo para o conjunto dos numeros complexos")
    }catch (e: Exception){
        print("Exceção mais geral: ")
        println(e.message)
    }finally {
        println("Executando Finally, finalizando o bloco de tratamentos de dados")
    }
    println("Final do programa!")
}