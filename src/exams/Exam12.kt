package exams

import java.text.Normalizer.Form
import kotlin.random.Random

fun main() {
    println("Soru 1************")
    println(reverseString("kotlin"))
    var str = "Ebru"
    println(str.reverseString2())



    println("Soru 2************")
    println(findCharacter("Ebru", 'b'))
    str = "Ebru"
    println(str.findCharacter2('ö'))



    println("Soru 3************")
    println(findStringRange("kotlinLanguage", "an"))
    str = "kotlinLanguage"
    println(str.findStringRange2("an"))



    println("Soru 4************")
    var arr = arrayOf("a", "h", "lk", "jh")
    println(copyArray(arr).contentToString())
    println(arr.copyArray2().contentToString())


    println("Soru 5************")
    println(giveCoordinates(1..9, 9..37))


    println("Soru 6************")
    var midtermNotes = arrayListOf(12, 56, 98, 47, 65, 79, 85)
    var finalNotes = arrayListOf(45, 37, 68, 90, 96, 100, 54)

    println(calculateNotes(midtermNotes, finalNotes))
    formatOutput(calculateNotes(midtermNotes, finalNotes))


}

//! soru 1
fun reverseString(text: String): String {
    var str = ""
    for (e in text.lastIndex downTo 0) {
        str += text[e]
    }
    return str
}

//! Extension

fun String.reverseString2(): String {
    var str = ""
    for (e in this.lastIndex downTo 0) {
        str += this[e]
    }
    return str
}


//! soru 2

fun findCharacter(str: String, char: Char): Int {
    var index = 0
    for (i in str.indices) {
        if (str[i] == char) {
            index = i
            break
        } else if (!str.contains(char)) {
            index = -1
        }
    }
    return index
}

//!Extension
fun String.findCharacter2(char: Char): Int {
    var index = 0
    for (i in this.indices) {
        if (this[i] == char) {
            index = i
            break
        } else if (!this.contains(char)) {
            index = -1
        }
    }
    return index
}

//! soru 3

fun findStringRange(str1: String, str2: String): IntRange? {
    var first = 0
    if (!str1.contains(str2)) {
        return null
    } else {
        for (i in str1.indices) {
            val substr = str1.substring(i, i + str2.length)
            if (substr == str2) {
                first = i
                break
            }
        }
    }
    return first..first + str2.length - 1
}

//! Extension

fun String.findStringRange2(str: String): IntRange? {
    var first = 0
    if (!this.contains(str)) {
        return null
    } else {
        for (i in this.indices) {
            val substr = this.substring(i, i + str.length)
            if (substr == str) {
                first = i
                break
            }
        }
    }
    return first..first + str.length - 1
}


//! soru 4

fun copyArray(arr: Array<String>) = arr.copyOf()

//! extension

fun Array<String>.copyArray2() = this.copyOf()

//! soru 5

fun giveCoordinates(range1: IntRange, range2: IntRange): Pair<Int, Int> {
    val x = range1.random()
    val y = range2.random()
    return Pair(x, y)

}

//! soru 6

fun calculateNotes(midtermNotes: ArrayList<Int>, finalNotes: ArrayList<Int>): ArrayList<Pair<Int, String>> {
    val averageNotes = getAverageNotes(midtermNotes, finalNotes)
    return getNoteList(averageNotes)
}

fun calculateNotes2(midtermNotes: ArrayList<Int>, finalNotes: ArrayList<Int>) =
    getNoteList(getAverageNotes(midtermNotes, finalNotes))




fun getAverageNotes(midtermNotes: ArrayList<Int>, finalNotes: ArrayList<Int>): ArrayList<Int> {
    var midAve = 0
    var finAVE = 0
    var index = 0
    var notes = arrayListOf<Int>()

    while (index in midtermNotes.indices && index in finalNotes.indices) {
        midAve = midtermNotes[index] * 40 / 100
        finAVE = finalNotes[index] * 60 / 100

        notes.add(midAve + finAVE)
        index++
    }
    return notes

}

fun getNoteList(notes: ArrayList<Int>): ArrayList<Pair<Int, String>> {
    val arr = ArrayList<Pair<Int, String>>()
    for (note in notes) {
        var letter = getLetterNote(note)
        arr.add(Pair(note, letter))
    }
    return arr
}

fun getLetterNote(note: Int) = if (note >= 90) {
    "AA"
} else if (note >= 85) {
    "BA"
} else if (note >= 80) {
    "BB"
} else if (note >= 70) {
    "CB"
} else if (note >= 60) {
    "CC"
} else if (note >= 50) {
    "DC"
} else if (note >= 45) {
    "DD"
} else {
    "FF"
}

fun formatOutput(noteList: ArrayList<Pair<Int, String>>) {
    for (n in noteList.indices) {
        println("$n student note is ${noteList[n].first} and letter is ${noteList[n].second} ")
    }
}




