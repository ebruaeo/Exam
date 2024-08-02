package exams

fun main() {
    /*
    Dummy Array Oluşturma
        Array<Int>(5) { 2 }
        Array<Int>(5) { it }
        Array<Int>(5) { it*2 }
        Array<Int>(5) { i -> i+2 }
        Array<Int>(5) { i -> i }

        arrayOfNulls<Int>(5)

    */

    println("****** SORU 1*******")

    var arr = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val range = 0..arr.lastIndex
    println("range : $range")


    println("****** SORU 2*******")

    arr = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var copyArray = Array<Int>(arr.size) { 0 }
    for (i in arr.indices) {
        //copyArray.set(i, arr[i])
        copyArray[i] = arr[i]
    }
    println(copyArray.contentToString())

    copyArray = Array<Int>(arr.size) { 0 }
    var q = 0
    while (q < arr.size) {
        copyArray.set(q, arr[q])
        q++
    }
    println(copyArray.contentToString())

    println("****** SORU 3 *******")

    arr = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var copyarray = arrayOfNulls<Int?>(3)

    for (i in arr.indices) {
        if (i < copyarray.size) {
            copyarray.set(i, arr[i])
        }
    }
    println(copyarray.contentToString())


    copyarray = arrayOfNulls<Int?>(10)
    q = 0
    while (q < arr.size && q < copyarray.size) {
        copyarray.set(q, arr[q])
        q++
    }
    println(copyarray.contentToString())

    println("****** SORU 4 *******")

    val givenArr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val a = 2
    val b = 6
    var j = 0
    var newArr = Array<Int>(b - a) { 0 }
    for (i in a..b - 1) {
        newArr.set(j, givenArr[i])
        //newArr.set(i-a, givenArr[i])
        j++
    }


    println(newArr.contentToString())

    newArr = Array<Int>(b - a) { 0 }
    q = 0
    j = 0
    while (q < givenArr.size) {
        if (q >= a && q < b) { // if (q in a..b-1)
            newArr.set(j, givenArr[q])
            j++
        }
        q++
    }
    println(newArr.contentToString())



    println("****** SORU 5 *******")

    var sourceArray = arrayOf(10, 20, 30, 40)
    var destinationArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (i in sourceArray.indices) {
        destinationArray.set(i, sourceArray[i])
    }
    println(sourceArray.contentToString())
    println(destinationArray.contentToString())

    sourceArray = arrayOf(10, 20, 30, 40)
    destinationArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    q = 0
    while (q < sourceArray.size) {
        destinationArray.set(q, sourceArray[q])
        q++
    }

    println(sourceArray.contentToString())
    println(destinationArray.contentToString())


    println("****** SORU 6 *******")


    sourceArray = arrayOf(30, 40, 50, 60)
    destinationArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var givenIndex = 2

    for (i in sourceArray.indices) {
        destinationArray.set(givenIndex, sourceArray[i])
        givenIndex++
    }
    println(sourceArray.contentToString())
    println(destinationArray.contentToString())


    sourceArray = arrayOf(30, 40, 50, 60)
    destinationArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    givenIndex = 2
    q = 0

    while (q < sourceArray.size) {
        destinationArray.set(givenIndex, sourceArray[q])
        q++
        givenIndex++
    }

    println(sourceArray.contentToString())
    println(destinationArray.contentToString())


}