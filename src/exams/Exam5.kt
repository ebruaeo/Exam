package exams

fun main() {
    println("*SORU 1 ************")

    var arr = arrayListOf(1, 2, 3, 4, 5, 6, 7)
    var range = 0..arr.lastIndex
    println(range)

    println("*SORU 2 ************")

    var arr1 = arrayListOf(1, 2, 3, 4, 5, 6, 7)
    var copyarr = arrayListOf<Int>()

    for (i in arr1) {
        copyarr.add(i)
    }
    println("for copyarr1: $copyarr")

    var copyArr = arrayListOf<Int>()
    var q = 0
    while (q < arr1.size) {
        copyArr.add(arr1[q])
        q++
    }
    println("while copyArr: $copyArr")

    println("*SORU 3 ************")

    var arr2 = arrayListOf(3, 4, 5, 6, 78)
    var size = 2
    var newArray = arrayListOf<Int?>()

    for (i in arr2.indices) {
        if (i <= size) {
            newArray.add(arr2[i])
        }
    }

    for (j in newArray.size..size-1) {
        newArray.add(null)
    }

    println("for newArray: $newArray")

    println("*SORU 4 ************")

    val givenArr = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val firstInd = 2
    val lastInd = 5
    val newArray2 = arrayListOf<Int>()

    for (i in firstInd..lastInd - 1) {
        newArray2.add(givenArr[i])
    }

    println("for: $newArray2")

    val givenArr2 = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var firstInd2 = 1
    val lastInd2 = 5
    val newArray22 = arrayListOf<Int>()

    while (firstInd2 < lastInd2) {
        newArray22.add(givenArr2[firstInd2])
        firstInd2++
    }

    println("while: $newArray22")

    println("*SORU 5 ************")

    val sourceArray = arrayListOf(10, 20, 30, 40)
    val destinationArray = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (i in sourceArray.indices) {
        destinationArray[i] = sourceArray[i]
    }

    println(" for Source Array  $sourceArray")
    println(" for destination Array  $destinationArray")


    val sourceArray2 = arrayListOf(10, 20, 30, 40)
    val destinationArray2 = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var a = 0
    while (a < sourceArray2.size) {
        destinationArray2[a] = sourceArray2[a]
        a++
    }

    println(" while Source Array 2  $sourceArray2")
    println(" while destination Array 2 $destinationArray2")

    println("*SORU 6 ************")

    val sourceArray3 = arrayListOf(10, 20, 30, 40)
    val destinationArray3 = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val givenIndex = 5

    for (i in sourceArray3.size - 1 downTo 0) {
        destinationArray3.add(givenIndex, sourceArray3[i])
    }

    println(" for Source Array  $sourceArray3")
    println(" for destination Array  $destinationArray3")


    val sourceArray4 = arrayListOf(10, 20, 30, 40)
    val destinationArray4 = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val givenIndex2 = 5
    var t = sourceArray4.lastIndex
    while (t < sourceArray4.size && t >= 0) {
        destinationArray4.add(givenIndex2, sourceArray4[t])
        t--
    }

    println(" while Source Array  $sourceArray4")
    println(" while destination Array  $destinationArray4")

}