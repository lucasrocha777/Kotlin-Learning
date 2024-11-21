fun main() {
    try {
        var s:String? = null
        s = "Felipe"
        println(s!!.length)
        var a = 10 / 0 var b = -4.0 var y = sqrt(b)
        if (b < 0) throw IllegalArgumentException() }
    catch (e: NullPointerException) { println("Variável nula") }
    catch (e: ArithmeticException) { println("Divisão por zero é inexistente") }
    catch (e: IllegalArgumentException) { println("Não existe raiz de número negativo") }
    catch (e: Exception) { println("Exception mais geral") }
    finally { println("Final do TRY CATCH") } println("Final do programa!") }
}