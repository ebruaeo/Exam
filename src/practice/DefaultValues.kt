package practice

fun main() {
    foo('e',5)
}

fun foo(letter: Char = 'a',number: Int = 7){
    println(letter)
    println(number)
}