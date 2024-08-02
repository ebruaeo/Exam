package practice

fun main() {

    val liste = intArrayOf(34, 45, 64, 44, 1, 100, 554)
    var sonuc = PuanlarHesapla(liste)
    println("En düşük puan = ${sonuc.first}")
    println("En yüksek puan = ${sonuc.second}")


    //******
    HighOrder(50, 60, 40, ::myFunction)

    myExample(4, 6, ::function)
}


fun PuanlarHesapla(puanlar: IntArray): Pair<Int, Int> {
    var dusuk = puanlar[0]
    var yuksek = puanlar[0]

    for (puan in puanlar) {
        if (puan < dusuk) {
            dusuk = puan
        } else if (puan > yuksek) {
            yuksek = puan
        }

    }


    return Pair(dusuk, yuksek)
}

fun myFunction(num1: Int, num2: Int, num3: Int): Int {
    return ((num1 + num2 + num3) / 3)
}

fun HighOrder(num1: Int, num2: Int, num3: Int, funcName: (Int, Int, Int) -> Int) {
    println(funcName(num1, num2, num3))

}

fun myExample(a: Int, b: Int, func: (Int, Int) -> Int) {
    println(func(a, b))
}


fun function(a: Int, b: Int): Int {
    return a + b
}


