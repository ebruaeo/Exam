package practice

fun main() {
    var k = Kare()
    k.kenar=-1f
    println(k.kenar)

    k.kenar = 110f
    println(k.kenar)


}

class Kare {
    var kenar: Float = 0.0f
        get() {
            return field
        }
        set(yeniKenar) {
            if (yeniKenar > 0) {
                field = yeniKenar
            } else {
                field = 0f
            }
        }


    var cevre: Float = 0.0f
        get() {
            return kenar * 4
        }

        private set

}