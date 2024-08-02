package exams

fun main() {
// String exam
    println("**************SORU 1***********************************")

    var text = "Kotlin   Programming Language "
    var countWords = 0
    var nextWordIndex = -1
    for (i in text.trim().indices) {
        if (nextWordIndex != -1 && i != nextWordIndex) {
            continue
        }
        nextWordIndex = -1
        if (text[i] == ' ') {
            for (j in i..text.lastIndex) {
                if (text[j] != ' ') {
                    countWords++
                    nextWordIndex = j
                    break
                }
            }
        }
    }
    println(countWords + 1)

    countWords = 0
    var j = 0
    while (j < text.trim().length) {
        if (text[j] == ' ') {
            for (k in j..text.lastIndex) {
                if (text[k] != ' ') {
                    countWords++
                    j = k
                    break
                }
            }
        }
        j++
    }
    println(countWords + 1)

    text = "Kotlin Programming Language"
    countWords = 0
    var w = 0
    while (w < text.trim().length) {
        if (text[w] == ' ') {
            countWords++
        }
        w++
    }
    println(countWords + 1)

    println("**************SORU 2***********************************")

    var letter = 'x'
    var isFound = false
    for (j in text.indices) {
        if (text[j] == letter) {
            println("Harfin bulunduğu ilk index: $j")
            isFound = true
            break
        }

    }
    if (!isFound) {
        println("Harfin bulunduğu ilk index: -1")
    }

    var foundIndex = -1
    for (j in text.indices) {
        if (text[j] == letter) {
            foundIndex = j
            break
        }
    }
    println("Harfin bulunduğu ilk index: $foundIndex")


    var h = 0
    isFound = false
    while (h < text.length) {
        if (text[h] == letter) {
            println("Harfin bulunduğu ilk index: $h")
            isFound = true
            break
        }
        h++
    }
    if (!isFound) {
        println("Harfin bulunduğu index = -1")
    }

    foundIndex = -1
    h = 0
    while (h < text.length) {
        if (text[h] == letter) {
            foundIndex = h
            break
        }
        h++
    }
    println("Harfin bulunduğu ilk index: $foundIndex")



    println("**************SORU 3***********************************")

    letter = 'a'
    for (f in text.length - 1 downTo 0) {
        if (text[f] == letter) {
            println("Harfin bulunduğu son index: $f")
            break
        }


    }

    var e = text.length - 1
    while (e > 0) {
        if (text[e] == letter) {
            println("Harfin bulunduğu son index: $e")
            break
        }
        e--
    }





    println("**************SORU 4***********************************")

    for (t in text.indices) {
        if (text[t] == letter) {
            println("Harfin bulunduğu index: $t")
        }

    }


    var q = 0
    while (q < text.length) {
        if (text[q] == letter) {
            println("Harfin bulunduğu index: $q")
        }
        q++
    }





    println("**************SORU 5***********************************")

    var text2 = "AB_D"
    var isUppercase = true

    for (y in text2) {
        if (y == y.lowercaseChar()) {
            isUppercase =false
            break
        }
    }
    println(isUppercase)


}