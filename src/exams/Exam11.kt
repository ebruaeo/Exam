package exams

fun main() {

    println("************ Soru 1 *********************")
    var arr = arrayOf(0, 1, 2, 3, 2, 1, 4, 5, 6, 7, 7)
    var arr2 = Array<Int?>(arr.size) { null }
    var index = 0

    for (i in arr) {
        if (!arr2.contains(i)) {
            arr2[index] = i
            index++
        }
    }
    var count = 0
    for (j in arr2) {
        if (j != 0) {
            count++
        }
    }
    index = 0
    var arr3 = Array(count) { 0 }
    for (h in arr2) {
        if (index < arr3.size && h != null) {
            arr3[index] = h
            index++
        }
    }


    println(arr3.contentToString())

    println("************ Soru 2 *********************")

    arr = arrayOf(1, 2, 3, 4, 5)
    arr2 = arrayOf(1, 3, 5, 7, 9)
    count = 0

    for (i in arr) {
        for (j in arr2) {
            if (i == j) {
                count++
                break
            }
        }
    }

    index = 0
    arr3 = Array(count) { 0 }
    for (i in arr) {
        for (j in arr2) {
            if (i == j) {
                arr3[index] = i
                index++
            }
        }
    }
    println(arr3.contentToString())

    println("************ Soru 3 *********************")

    arr = arrayOf(1, 2, 3, 4, 5)
    arr2 = arrayOf(4, 5, 6, 7)
    count = 0

    for (i in arr) {
        for (j in arr2) {
            if (i == j) {
                count++
                break
            }
        }
    }
    index = 0
    arr3 = Array((arr.size + arr2.size) - count) { 0 }

    for (i in arr) {
        arr3[index] = i
        index++
    }
    for (j in arr2) {
        for (h in arr3) {
            if (arr3.contains(j)) {
                break
            } else {
                arr3[index] = j!!
                index++
            }
        }
    }

    println(arr3.contentToString())

    println("************ Soru 4 *********************")

    arr = arrayOf(1, 2, 3, 4, 5)
    arr2 = arrayOf(4, 5, 6, 7)
    count = 0

    for (i in arr) {
        for (j in arr2) {
            if (i == j) {
                count++
                break
            }
        }
    }
    index = 0
    arr3 = Array((arr.size) - count) { 0 }

    for (i in arr) {
        for (j in arr2) {
            if (index < arr3.size) {
                if (!arr.contains(j)) {
                    arr3[index] = i
                    index++
                    break
                }
            }

        }
    }
    println(arr3.contentToString())

    println("************ Soru 5 *********************")


}