package exams

fun main() {

    println("***********************Soru 1    ")
    val vovels = "a,e,ı,i,o,ö,u,ü,A,E,I,İ,O,Ö,U,Ü"
    val text = "minnieAndMIA"
    var count = 0

    for (i in text) {
        if (vovels.contains(i)) {
            count++
        }
    }
    println("Soru 1 For $count")

    count = 0
    var w = 0
    while (w < text.length) {
        if (vovels.contains(text[w])) {
            count++
        }
        w++
    }
    println("Soru 1 While $count")


    println("***********************Soru 2    ")


    val string1 = "Ebruokumus"
    val string2 = "Ebru"
    var h = 0
    var isStarted = true
    while (h < string2.length) {
        if (string1[h] != string2[h]) {
            isStarted = false
            break
        }
        h++
    }
    if (isStarted) {
        println("Soru 2 while $string1 does start with $string2")
    } else {
        println("Soru 2 while $string1 does not start with $string2")
    }


    isStarted = true
    for (i in string2.indices) {
        if (string2[i] != string1[i]) {
            isStarted = false
            break
        }
    }
    if (isStarted) {
        println("Soru 2 for $string1 does start with $string2")
    } else {
        println("Soru 2 for $string1 does not start with $string2")
    }

    println("***********************Soru 3    ")

    var string3 = "Kotlin Programming"
    var string4 = "ktlin"
    string3 = string3.lowercase()
    string4 = string4.lowercase()
    var e = 0
    var isStarted1 = true
    while (e < string4.length) {
        if (string3[e] != string4[e]) {
            isStarted1 = false
            break
        }
        e++
    }
    if (isStarted1) {
        println("Soru 3 while $string3 does start with $string4")
    } else {
        println("Soru 3 while $string3 does not start with $string4")
    }


    isStarted1 = true
    for (i in string4.indices) {
        if (string4[i] != string3[i]) {
            isStarted1 = false
            break
        }
    }
    if (isStarted1) {
        println("Soru 3 for $string3 does start with $string4")
    } else {
        println("Soru 3 for $string3 does not start with $string4")
    }


    println("***********************Soru 4   ")

    var str = "Miyamcıklar"
    var str2 = "llr"
    var endsWith = false

    var d = str2.lastIndex
    var f = str.lastIndex

    while (d >= 0 && str2[d] == str[f]) {
        d--
        f--
    }
    if (d < 0) {
        endsWith = true
    } else {
        endsWith = false
    }

    d = str2.lastIndex
    f = str.lastIndex
    endsWith = true
    while (d >= 0) {
        if (str2[d] != str[f]) {
            endsWith = false
            break
        }
        d--
        f--
    }
    if (endsWith) {
        println("Soru 4 while $str does end with $str2")
    } else {
        println("Soru 4 while $str does not end with $str2")
    }








    str = "miyamcılar"
    str2 = "lar"
    val diff = str.length - str2.length
    endsWith = true
    for (i in str2.lastIndex downTo 0) {
        if (str2[i] != str[i + diff]) {
            endsWith = false
            break
        }
    }

    if (endsWith) {
        println("Soru 4 for $str does end with $str2")
    } else {
        println("Soru 4 for $str does not end with $str2")
    }



    str = "miyamcılar"
    str2 = "lar"
    endsWith = true
    var j = str.lastIndex
    for (i in str2.lastIndex downTo 0) {
        if (str2[i] != str[j]) {
            endsWith = false
            break
        }
        j--
    }

    if (endsWith) {
        println("Soru 4 for $str does end with $str2")
    } else {
        println("Soru 4 for $str does not end with $str2")
    }








    println("***********************Soru 5   ")

    str = str.lowercase()
    str2 = str2.lowercase()
    endsWith = true

    var m = str2.lastIndex
    var n = str.lastIndex
    while (m >= 0) {
        if (str2[m] != str[n]) {
            endsWith = false
            break
        }
        m--
        n--
    }


    if (endsWith) {
        println("Soru 5 while $str does end with $str2")
    } else {
        println("Soru 5 while $str does not end with $str2")
    }


    var cat1 = "minnie"
    var cat2 = "mia"
    cat1 = cat1.lowercase()
    cat2 = cat2.lowercase()
    endsWith = true
    val dif = cat1.length - cat2.length
    for (i in cat2.lastIndex downTo 0) {
        if (cat2[i] != cat1[i + dif]){
            endsWith=false
        }
    }

    if (endsWith) {
        println("Soru 5 for $cat1 does end with $cat2")
    } else {
        println("Soru 5 for $cat1 does not end with $cat2")
    }



}