package exams

import kotlin.random.Random

fun main() {

    println("*****************SORU 1*******************")

    var str = "Kotlin"
    var arr = Array<Char>(str.length) { ' ' }
    var index = 0


    for (i in str) {
        arr.set(index, i)
        index++
    }
    println(arr.contentToString())

    println("*****************SORU 2*******************")

    var givenArr = arrayOf(1, "a", 3, "b", 5)
    var random = givenArr[Random.nextInt(givenArr.size)]

    println(random)


    println("*****************SORU 3*******************")

    var array = arrayOf(1, 2, 3, 4, 5)
    str = ""
    for (i in array) {
        str += i
    }
    println(str)

    println("*****************SORU 4*******************")

    array = arrayOf(1, 2, 3, 4, 5)
    str = ""
    var delimeter = "-"
    for (i in array) {
        str += i
        if (i!=array.last()){
            str += delimeter
        }

    }

    println(str)


    println("*****************SORU 5*******************")

    array = arrayOf(2, 3, 4, 5, 98, 0)
    var min = array[0]
    for (i in array) {
        if (i < min) {
            min = i
        }
    }
    println("min element= $min")

    println("*****************SORU 6*******************")

    array = arrayOf(2, 3, 4, 5, 98, 0)
    var max = array[0]
    for (i in array) {
        if (i > max) {
            max = i
        }
    }

    println("Max element: $max")

    println("*****************SORU 7*******************")
    array = arrayOf(2, 3, 4, 5, 98, 0)
    var sum = 0

    for (i in array){
        sum +=i
    }

    println("sum of array= $sum")


}