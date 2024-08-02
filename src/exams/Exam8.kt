package exams

import kotlin.random.Random

fun main() {
    println("*********** SORU 1  ****************")

    var arr = arrayOf(1, 2, 3, 4, 5, 6)

    for (i in arr.indices) {
        // Her bir eleman için rastgele bir yer bul
        val index = Random.nextInt(0, arr.size)

        // Bulduğun yerdeki eleman ile o anki elemanın yeri değiş
        val temp = arr[i]
        arr[i] = arr[index]
        arr[index] = temp
    }

    println(arr.contentToString())


    println("*********** SORU 2  ****************")

    arr = arrayOf(1, 2, 3, 4, 5, 6)
    var shuffledArray = Array(arr.size) { index -> arr[index] }

    for (i in shuffledArray.indices) {
        // Her bir eleman için rastgele bir yer bul
        val index = Random.nextInt(0, shuffledArray.size)

        // Bulduğun yerdeki eleman ile o anki elemanın yeri değiş
        val temp = shuffledArray[i]
        shuffledArray[i] = shuffledArray[index]
        shuffledArray[index] = temp
    }

    println(shuffledArray.contentToString())
    arr = arrayOf(1, 2, 3, 4, 5, 6)
    shuffledArray = Array(arr.size) { 0 }

    //val indexList = Array(arr.size) {it}.toList()
    val indexList = mutableListOf<Int>()
    for (i in arr.indices) {
        indexList.add(i)
    }

    for (e in arr) {
        val r = Random.nextInt(0, indexList.size)
        val index = indexList.get(r)
        indexList.removeAt(r)
        shuffledArray[index] = e
    }
    println(shuffledArray.contentToString())



    println("*********** SORU 3  ****************")

    arr = arrayOf(1, 2, 3, 4, 5, 6)
    var index = 0

    for (i in arr.lastIndex downTo 0) {
        arr.set(index, arr[i])
        index++

    }
    println(arr.contentToString())

    println("*********** SORU 4  ****************")

    arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val element = 11
    var isContain = false

    for (i in arr) {
        if (i == element) {
            isContain = true
            break
        } else {
            isContain = false
        }
    }

    println(isContain)

    println("*********** SORU 5  ****************")

    arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var arr2 = arrayOf(1, 2, 5)
    isContain = true

    for (i in arr) {
        for (j in arr2) {
            if (i != j) {
                isContain = false
                break
            } else {
                isContain = true
            }
        }
    }

    println(isContain)



    println("*********** SORU 6  ****************")
    arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var intRange = 2..11
    isContain = true

    if (intRange.last > arr.last()) {
        isContain = false
    } else {
        for (i in intRange) {
            if (i in arr) {
                isContain = true
            } else {
                isContain = false
            }
        }
    }

    println("yaptım $isContain")

    println("*********** SORU 7  ****************")

    arr = arrayOf(1, 2, 3, 4)
    arr2 = arrayOf(1, 2, 3, 5)
    var hasSame = false

    if (arr.size == arr2.size) {
        for (i in arr.indices) {
            if (arr[i] == arr2[i]) {
                hasSame = true
            } else {
                hasSame = false
            }
        }
    }

    println("yaptım $hasSame")

    println("*********** SORU 8  ****************")

    arr = arrayOf(1, 2, 3, 4)
    arr2 = arrayOf(1, 3, 2, 4)
    hasSame = false

    if (arr.size == arr2.size) {
        for (i in arr) {
            if (i in arr2) {
                hasSame = true
            } else {
                hasSame = false
                break
            }
        }
    }
    println("yaptım $hasSame")



    println("*********** SORU 9  ****************")

    arr = arrayOf(1, 2, 3, 4)
    println("yaptım ${arr.contentToString()}")



















}

