/*
Написать функцию, которая возвращает большее из двух целых чисел.

Проверить работу написанной функции на примере каких-нибудь входных данных.
 */

fun main() {
    val number1: Int = 10
    val number2: Int = 16
    val result: Int = maxNumber(number1, number2)
    println(result)
}

fun maxNumber(number1: Int, number2: Int): Int {
    val max: Int = if (number1 > number2) {
        number1
    } else {
        number2
    }
    return max
}