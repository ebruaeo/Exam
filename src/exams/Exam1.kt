package exams

fun main() {
    var str = "kotlin"

    //Soru 1
    println("SORU 1 ********************************************************")

    println(str[2])

    // soru 2
    println("SORU 2********************************************************")
    for (i in str.indices) {
        println(i)
    }

    println("2b")
    var i = 0
    while (i in str.indices) { // i < str.length
        println(i)
        i++
    }

    // soru 3
    println("SORU 3********************************************************")
    for (i in str) { // Her döngünün kendi değişken harfi olsun
        println(i)
    }


    var i2 = 0
    while (i2 in str.indices) {  // i < str.length
        println(str[i2])
        i2++
    }


    // soru 4
    println("SORU 4********************************************************")
    val string = "-a7b9c4d3e1f"

    for (j in string.indices) { // 0 until str.length step 2
        if (j % 2 == 0) {
            println(string[j])
        }
    }

    var a = 0
    while (a in string.indices) { // i < str.length
        if (a % 2 == 0) {
            println(string[a])
        }
        a++ // a += 2
    }

    // soru 5
    println("SORU 5 ********************************************************")

    for (i in str.length - 1 downTo 0) {
        println(str[i])
    }

    var b = str.length - 1
    while (true) { // b >= 0
        println(str[b])
        b--
        if (b < 0) {
            break
        }
    }


    // soru 6
    println("SORU 6 ********************************************************")

//    for (i in text) {
//        if (i != '_') {
//            print(i)
//        }
//    }
    var underScoreCount = 0
    var text = "__Kotlin_-"

    for (i in text) {
        if (i == '_') {
            underScoreCount++
        } else {
            break
        }
    }
    text = text.substring(underScoreCount)

    underScoreCount = 0
    for (i in text.lastIndex..0) {
        if (text[i] == '_') {
            underScoreCount++
        } else {
            break
        }
    }
    text = text.substring(0, text.length - underScoreCount)
    println("\ntext: $text")

    println()

    var text2 = "__Kotlin_-"

    underScoreCount = 0
    var j = 0
    while (j < text2.length) {
        if (text2[j] == '_') {
            underScoreCount++

        } else {
            break
        }
        j++
    }
    text2 = text2.substring(underScoreCount)

    underScoreCount = 0
    var w = text2.length - 1
    while (w > 0) {
        if (text2[w] == '_') {
            underScoreCount++

        } else {
            break
        }
        w--
    }

    text2 = text2.substring(0, text2.length - underScoreCount)
    println("\ntext2 = $text2")


//    var c = 0
//    while (c in text.indices) {
//        if (text[c] != '_') {
//            print(text[c])
//        }
//        c++
//    }
//    println()

    // soru 7
    println("SORU 7 ********************************************************")
    var sentence = "KotlinaaProgramming Language"
    var count = 0

    for (i in sentence) {
        if (i == 'a') {
            count++
        }
    }
    println(count)

    count=0
    var q = 0

    while (q<sentence.length) {
        if (sentence[q]=='a'){
            count++
        }
        q++
    }
    println("while count: $count")























}