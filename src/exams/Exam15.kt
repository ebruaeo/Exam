package exams

fun main() {
//!******** Soru 1********
    println(removeNulls(arrayOf(1, 2, null, 3, 4, 5, null, null, 6, 7)).contentToString())
//!******** Soru 2 ********
    println(findFirstIndex(arrayOf(1, 2, 3, 4, 2), 2))
//!******** Soru 3 ********
    println(findLastIndex(arrayOf(1, 2, 3, 4, 2), 15))
//!******** Soru 4 ********
    println(countElements(arrayOf(1, 2, 3, 4, 2), 2))
//!******** Soru 5 ********
    println(findMinElement(arrayOf(3, 5, 7, 2, 0, 8, 10, 0)))
//!******** Soru 6 ********
    println(findMaxElement(arrayOf(3, 5, -71, 2, 0, 8, 10, 0)))
//!******** Soru 7 ********
    println(sliceArray(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),4).contentToString())


}

//!******** Soru 1********

fun removeNulls(array: Array<Int?>): Array<Int> {
    var nullElements = 0
    for (i in array) {
        if (i == null) {
            nullElements++
        }
    }
    var index = 0
    var arr = Array<Int>(array.size - nullElements, { 0 })
    for (i in array) {
        if (i != null) {
            arr[index] = i
            index++
        }
    }
    return arr
}

//!******** Soru 2 ********

fun findFirstIndex(array: Array<Int>, element: Int): Int? {
    for (i in array.indices) {
        if (array[i] == element) {
            return i
        }
    }
    return null
}

//!******** Soru 3 ********

fun findLastIndex(array: Array<Int>, element: Int): Int? {
    for (i in array.lastIndex downTo 0) {
        if (array[i] == element) {
            return i
        }
    }
    return null
}

//!******** Soru 4 ********

fun countElements(array: Array<Int>, element: Int): Int {
    var count = 0
    for (i in array) {
        if (i == element) {
            count++
        }
    }
    return count
}

//!******** Soru 5 ********

fun findMinElement(array: Array<Int>): Int {
    var min = array[0]
    for (i in array) {
        if (i < min) {
            min = i
        }
    }
    return min
}

//!******** Soru 6 ********

fun findMaxElement(array: Array<Int>): Int {
    var max = array[0]
    for (i in array) {
        if (i > max) {
            max = i
        }
    }
    return max
}

//!******** Soru 7 ********

fun sliceArray(array: Array<Int>, startingPoint: Int = 0, endingPoint: Int = array.lastIndex): Array<Int> {
    val arr = Array<Int>(endingPoint - startingPoint, { 0 })
    var index = 0
    for (i in startingPoint..endingPoint - 1) {
        arr[index] = array[i]
        index++
    }
    return arr
}

































