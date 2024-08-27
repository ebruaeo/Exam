package LambdaFunctionExams

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    var doubleToInt = { number: Double -> number.toInt() }
    var list = arrayListOf(12.4, 24.7, 24.9, 130.3)

    println(doubleToInteger(list, doubleToInt))

    var capitalLambda = { word: String -> word.capitalize() }
    var stringList = arrayListOf("abc", "ebru", "ali", "ömer", "ece")

    println(capitalizeWords(stringList, capitalLambda))

    stringList = arrayListOf("abc", "ebru", "ali", "ömer", "ece")
    var countChar = { word: String, char : Char ->
        var count = 0
        for (i in word) {
            if (i == char) {
                count++
            }
        }
        count
    }
    println(countChar(stringList, 'm', countChar))

    var map = hashMapOf(
        Pair("Ebru", arrayListOf(86, 34, 78)),
        Pair("Esra", arrayListOf(86, 45, 100)),
        Pair("Ömer", arrayListOf(5, 12, 100))
    )
    var lambda = { word: String, list2: List<Int> ->
        var sum = 0
        for (i in list2) {
            sum += i
        }
        var average = sum / list2.size
        Pair(word, average)
    }

    println(function(map, lambda))


}

fun doubleToInteger(list: ArrayList<Double>, doubleToInt: (Double) -> Int): List<Int> {
    var intArr = arrayListOf<Int>()
    for (i in list) {
        intArr.add(doubleToInt(i))
    }
    return intArr
}

fun capitalizeWords(list: ArrayList<String>, capitalLambda: (String) -> String): List<String> {
    var stringArr = arrayListOf<String>()

    for (i in list) {
        stringArr.add(capitalLambda(i))
    }
    return stringArr
}

fun countChar(list: ArrayList<String>, char: Char, countChar: (String, Char) -> Int): Map<String, Int> {
    var map = hashMapOf<String, Int>()
    for (i in list) {
        map.put(i, countChar(i,char))
    }
    return map
}

fun function(map: Map<String, List<Int>>, lambda: (String, List<Int>) -> Pair<String, Int>): List<Pair<String, Int>> {
    var pairList = arrayListOf<Pair<String, Int>>()
    for (entry in map) {
        pairList.add(lambda(entry.key, entry.value))
    }
    return pairList

}