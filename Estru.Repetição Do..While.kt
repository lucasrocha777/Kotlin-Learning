fun main() {
    var i = 0
        do{
            print("${i} ")
            i++
        } while (i != 10)

        while (i==10){
            print("Loop While")
            i++
        }
    print("\n")
    do {
        print("Qual o seu nome: ")
        val value = readLine()
        if (value == "")
            println("Responda corno")
    }while (value == "")
}