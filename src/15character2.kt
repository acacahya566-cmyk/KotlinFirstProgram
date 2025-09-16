fun main(args: Array<String>) {
    var charA : Char = 'A'
    //Println (charA == 65)
    println(charA.isUpperCase())//apakah huruf kapital atau tidak
    println(charA.isLowerCase())//apakah huruf kecil
    println(charA.isDigit())//apakah digit
    println(charA.lowercaseChar())
    val strA : String = charA.toString()//mengubah menjadi huruf kecil
    println("kini charA sudah menjadi String =" +strA)
}

