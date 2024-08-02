package exams

fun main() {

    println("*******Soru 1********* ")

    var arr1 = arrayOf(1, 2, 3)
    var arr2 = arrayOf(4, 5, 6)
    var resultArray = Array<Int>(arr1.size + arr2.size) { 0 }
    var index = 0

    for (i in arr1.indices) {
        resultArray.set(index, arr1[i])
        index++
    }
    for (j in arr2.indices) {
        resultArray.set(index, arr2[j])
        index++
    }
    println(resultArray.contentToString())

    println("*******Soru 2********* ")

    arr1 = arrayOf(1, 2, 3)
    arr2 = arrayOf(4, 5, 6)
    resultArray = Array<Int>(arr1.size + arr2.size) { 0 }
    var specifiedIndex = 1
    index = 0

    for (i in arr1.indices) {
        if (index == specifiedIndex) {
            for (j in arr2) {
                resultArray[index] = j
                index++
            }
        }
            resultArray[index] = arr1[i]
            index++

    }


    println(resultArray.contentToString())


    println("*******Soru 3********* ")

    arr1 = arrayOf(1, 2, 3)
    var reversedArray = Array<Int>(arr1.size) { 0 }
    index = 0
    for (i in arr1.lastIndex downTo 0) {
        reversedArray[index] = arr1[i]
        index++
    }
    println(reversedArray.contentToString())






    println("*******Soru 4********* ")
    arr1 = arrayOf(1, 2, 3, 4, 5)
    var fromIndex = 2
    reversedArray = Array<Int>(arr1.size - fromIndex) { 0 }
    index = 0

    for (i in arr1.lastIndex downTo fromIndex) {
        reversedArray[index] = arr1[i]
        index++
    }
    println(reversedArray.contentToString())


    println("*******Soru 5********* ")

    arr1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var toIndex = 5
    fromIndex = 2
    reversedArray = Array<Int>(toIndex - fromIndex) { 0 }
    index = 0

    for (i in toIndex - 1 downTo fromIndex) {
        reversedArray[index] = arr1[i]
        index++
    }
    println(reversedArray.contentToString())

    println("*******Soru 6********* ")

    arr1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var range = 5 - 1 downTo 2
    reversedArray = Array<Int>(range.first + 1 - range.last) { 0 }
    index = 0

    for (i in range) {
        reversedArray[index] = arr1[i]
        index++
    }
    println(reversedArray.contentToString())


    println("*******Soru 7********* ")
    arr1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    fromIndex = 2
    var slicedArray = Array<Int>(arr1.size - fromIndex) { 0 }
    index = 0
    for (i in fromIndex..arr1.lastIndex) {
        slicedArray[index] = arr1[i]
        index++
    }
    println(slicedArray.contentToString())

    println("*******Soru 8 ********* ")

    arr1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    fromIndex = 2
    toIndex = 5
    slicedArray = Array<Int>(toIndex - fromIndex) { 0 }
    index = 0

    for (i in fromIndex..toIndex - 1) {
        slicedArray[index] = arr1[i]
        index++
    }
    println(slicedArray.contentToString())

    println("*******Soru 9 ********* ")
    arr1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    range = 2..5 - 1
    slicedArray = Array<Int>(range.last + 1 - range.first) { 0 }
    index = 0

    for (i in range) {
        slicedArray[index] = arr1[i]
        index++
    }
    println(slicedArray.contentToString())


}