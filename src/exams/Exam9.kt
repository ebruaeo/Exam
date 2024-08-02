package exams

fun main() {
    println("*****************sORU 1 *****************")

    var arr = arrayOf(1, 2, 3, 4, 5, 6)
    var n = 2
    if (n > arr.size) {
        // println(emptyArray<Int>().contentToString())
        println(arrayOf<Int>().contentToString())
        // Array(0) { 0 }
    } else if (n < 0) {
        println("Negative n value is not valid")
    } else {
        var arr2 = Array(arr.size - n) { 0 }
        var index = 0

        for (i in arr.indices) {
            if (i >= n) {
                arr2.set(index, arr[i])
                index++
            }
        }
        println(arr2.contentToString())

        var i = n
        var i2 = 0
        while (i < arr.size) {
            arr2[i2] = arr[i]
            i++
            i2++
        }

        println(arr2.contentToString())
    }


    println("*****************sORU 2 *****************")

    arr = arrayOf(1, 2, 3, 4, 5, 6)
    n = 2
    if (n > arr.size) {
        println(arrayOf<Int>().contentToString())
    } else if (n < 0) {
        println("Negative n value is not valid")
    } else {
        var arr2 = Array(arr.size - n) { 0 }
        var index = 0

        for (i in arr) {
            if (index < (arr.size - n)) {
                arr2.set(index, i)
                index++
            }

        }
        println(arr2.contentToString())

        var i = 0
        var lastIndex = arr.size - n
        while (i < lastIndex) {
            arr2[i] = arr[i]
            i++
        }
        println(arr2.contentToString())

    }

    println("*****************sORU 3 *****************")
    val arrWithNulls = arrayOf(1, 2, 0, 3, 4, 5, 0, 0, 6, 7)
    var size = 0
    for (i in arrWithNulls){
        if (i != null){
            size++
        }
    }

    var arrNoNulls= Array(size){0}
    var ind = 0
    for (i in arrWithNulls){
        if (i != null){
            arrNoNulls.set(ind,i)
            ind++
        }
    }

    println(arrNoNulls.contentToString())



    println("*****************sORU 4 *****************")

    arr = arrayOf(1, 2, 3, 4, 5, 2)
    var givenElement = 2
    var isContain = false

    for (i in arr.indices) {
        if (arr[i] == givenElement) {
            isContain = true
            println("elemanın ilk bulunduğu index: $i")
            break
        }
//        else {
//            isContain = false
//        }
    }
    if (!isContain) {
        println("-1")
    }


    println("*****************sORU 5 *****************")

    arr = arrayOf(1, 2, 3, 4, 5, 2)
    givenElement = 2
    isContain = false

    for (i in arr.lastIndex downTo 0) {
        if (arr[i] == givenElement) {
            isContain = true
            println("elemanın son bulunduğu index: $i")
            break
        }
//        else {
//            isContain = false
//        }
    }
    if (!isContain) {
        println("-1")
    }
    println("*****************sORU 6 *****************")


    arr = arrayOf(1, 2, 2, 4, 5, 2)
    givenElement = 2
    var count = 0

    for (i in arr) {
        if (i == givenElement) {
            count++
        }
    }

    println(count)

}