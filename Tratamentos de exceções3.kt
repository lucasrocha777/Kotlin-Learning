import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner
import kotlin.io.path.fileVisitor

fun ler_arquivo(){
    val arquivo = File("D:\\Treino coding\\Conceitos_Iniciais\\src\\Rotina.txt")
    try {
        Scanner(arquivo).use{l ->
            while (l.hasNext()){
                println(l.next())
            }
            l.close()
        }
    }catch (e: FileNotFoundException){
        println("Falha ao localizar o arquivo")
    }
}

fun main() {
    ler_arquivo()
}