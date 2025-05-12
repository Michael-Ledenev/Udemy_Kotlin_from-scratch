/* Вывести на экран большее из двух целых чисел. */

fun main() {
    val a: Int = 10
    val b: Int = 12

    val comparison: Int = if (a > b) {
        a
    } else {
        b
    }
    print(comparison)

}
