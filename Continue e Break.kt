fun main() {
    var i = 0
        while (i<1000){
            if (i == 46){
                break // Parar uma iteração com base em uma requisação logica.
            }
            print("${i} ")
            i++
        }
    print("\n")
    var str = "O ryan é gay"
    var r = 0
        while (r< str.length){
            if (str[r] == 'a'){
                break
            }
            print("${str[r]} ")
            r++
        }
    print("\n")
    for ( i in 0 .. 35){
        if (i%2 == 0){
            continue
        }
        print("${i} ")
    }
    print("\n")
    var str2 = "O ryan mama"
    for ( i in 0 .. (str2.length-1)) {
        if (str2[i] == 'y' || str2[i] == 'a') {
            continue
        }
        print("${str2[i]} ")
    }
}