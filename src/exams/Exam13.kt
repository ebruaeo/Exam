package exams

fun main() {
//? Soru 1 *********
    printElements(arrayOf(1, 2, 3, 56, 78))
//? Soru 2 ********
    var arr = arrayOf(1, 2, 3, 4, 56, 89)
    arr.printElement2()


//! Soru 3 *********
    println(combineArrays(arrayOf(1, 2, 3), arrayOf(4, 5, 6)).contentToString())
//! Soru 4 *********
    arr = arrayOf(1, 2, 3)
    println(arr.combineArrays2(arrayOf(4, 5, 6)).contentToString())


//? Soru 5 *********
    arr = arrayOf(30, 40, 50, 60)
    var arr2 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    copyElements(arr, arr2, 2)
    printElements(arr2)

//? Soru 6 *********
    arr = arrayOf(30, 40, 50, 60)
    arr2 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    arr.copyElements2(arr2,2)
    printElements(arr2)

}

//? Soru 1 *********

fun printElements(array: Array<Int>) {
    println(array.contentToString())

}
//? Soru 2 *********

fun Array<Int>.printElement2() {
    println(this.contentToString())
}

//! Soru 3 *********

fun combineArrays(a: Array<Int>, b: Array<Int>): Array<Int> {
    return a + b
}

//! Soru 4 *********

fun Array<Int>.combineArrays2(b: Array<Int>): Array<Int> {
    return this + b
}

//? Soru 5 *********
fun copyElements(a: Array<Int>, b: Array<Int>, startingIndex: Int = 0) {
    var fromIndex = startingIndex
    for (i in a.indices) {
        b[fromIndex] = a[i]
        fromIndex++
    }
}

//? Soru 6 *********

fun Array<Int>.copyElements2(b: Array<Int>, startingIndex: Int = 0){
    var fromIndex = startingIndex
    for (i in this.indices) {
        b[fromIndex] = this[i]
        fromIndex++
    }
}




