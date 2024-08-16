package exams

fun main() {
//!*******  SORU 1 ***********
    println(sumElements(arrayOf(1, 2, 3, 4)))
//!*******  SORU 2 ***********
    println(dropFirst(arrayOf(1, 2, 3, 4, 5, 6), 2).contentToString())
//!*******  SORU 3 ***********
    var arr = arrayOf(1, 2, 3, 4, 5, 6)
    println(arr.dropFirst2(2).contentToString())
//!*******  SORU 4 ***********
    println(dropLast(arrayOf(1, 2, 3, 4, 5, 6), 2).contentToString())
//!*******  SORU 5 ***********
    arr = arrayOf(1, 2, 3, 4, 5, 6)
    println(arr.dropLast2(2).contentToString())
//!*******  SORU 6 ***********
    println(arr.dropElements(2, "first").contentToString())

}

//!*******  SORU 1 ***********

fun sumElements(arr: Array<Int>): Int {
    var sum = 0
    for (i in arr) {
        sum += i
    }
    return sum
}

//!*******  SORU 2 ***********

fun dropFirst(arr: Array<Int>, first: Int): Array<Int> {
    val newArray = Array<Int>(arr.size - first, { 0 })
    var index = 0
    for (i in first..arr.lastIndex) {
        newArray[index] = arr[i]
        index++
    }
    return newArray
}

//!*******  SORU 3 ***********
fun Array<Int>.dropFirst2(first: Int): Array<Int> {
    val newArray = Array<Int>(this.size - first, { 0 })
    var index = 0
    for (i in this.indices) {
        if (i >= first) {
            newArray[index] = this[i]
            index++
        }
    }
    return newArray
}

//!*******  SORU 4 ***********

fun dropLast(arr: Array<Int>, last: Int): Array<Int> {
    val newArray = Array<Int>(arr.size - last, { 0 })
    var index = 0
    for (i in 0..arr.size - last - 1) {
        newArray[index] = arr[i]
        index++
    }
    return newArray
}

//!*******  SORU 5 ***********

fun Array<Int>.dropLast2(last: Int): Array<Int> {
    val newArray = Array<Int>(this.size - last, { 0 })
    var index = 0
    for (i in this.indices) {
        if (i <= last + 1) {
            newArray[index] = this[i]
            index++
        }
    }
    return newArray
}

//!*******  SORU 6 ***********
//? Enum class öğren, drop at yerine kullan
fun Array<Int>.dropElements(number: Int, dropAt: String = "first") = when (dropAt) {
    "first" -> dropFirst(this, number)
    "last" -> dropLast(this, number)
    else -> emptyArray()
}
























