package exams

fun main() {


    println("**** SORU 1 **********************************")

    var arr = arrayListOf(1, 2, 3, 4, 5, 6, 7)
    var range = arr[0]..arr.lastIndex
    println(range)



    println("**** SORU 2 **********************************")

    var arr1 = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    var arr1Copy = mutableListOf<Int>()

    for (i in arr1) {
        arr1Copy.add(i)
    }
    println("Copy array: $arr1Copy")


    var arr1Copy1 = mutableListOf<Int>()
    var q = 0
    while (q < arr1.size) {
        arr1Copy1.add(arr1[q])
        q++
    }
    println("while copy array: $arr1Copy1")


    println("**** SORU 3 **********************************")

    var arr2 = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    var copySize = 10
    var arr2Copy = mutableListOf<Int?>()
    var f = copySize - arr2.size



    for (i in arr2.indices) {
        if (i != copySize) {
            arr2Copy.add(arr2[i])
        } else {
            break
        }
    }
    println(arr2Copy)


    println("**** SORU 4 **********************************")

    var arr3 = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
    var start = 2
    var end = 7
    var newArray = mutableListOf<Int>()

    for (i in start..end - 1) {
        newArray.add(arr3[i])
    }
    println("new array : $newArray")

    var newArray2 = mutableListOf<Int>()
    var w = start
    while (w < end) {
        newArray2.add(arr3[w])
        w++
    }
    println("while new array : $newArray2")



    println("**** SORU 5 **********************************")

    var sourceArr = mutableListOf(10, 20, 30, 40)
    var destinationArr = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (i in sourceArr.indices) {
        destinationArr.add(i, sourceArr[i])
    }

    println("desti: $destinationArr")
    println("source: $sourceArr")


    var sourceArr2 = mutableListOf(10, 20, 30, 40)
    var destinationArr2 = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var e = 0
    while (e < sourceArr2.size) {
        destinationArr2.add(e, sourceArr2[e])
        e++
    }
    println("desti2: $destinationArr2")
    println("source2: $sourceArr2")



    println("**** SORU 6 **********************************")

    var sourceArray= mutableListOf(30,40,50,60)
    var destinationArray = mutableListOf(1,2,3,4,5,6,7,8,9)
    var index = 4

    for (i in sourceArray) {
        destinationArray.add(index, i)
    }

    println("desti: $destinationArray")
    println("source: $sourceArray")














}