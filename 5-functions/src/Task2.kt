/*
Написать функцию, которая для двух целых чисел возвращает «первое число больше» если первое больше,
«второе число больше» если второе больше и «числа равны», если они равны

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val number1: Int = 16
    val number2: Int = 16
    val result: String = mNumber(number1, number2)
    println(result)
}

fun mNumber(number1: Int, number2: Int): String {
    val max: String = when {
        number1 > number2 -> "первое число больше"
        number2 > number1 -> "второе число больше"
        else -> "числа равны"
    }
    return max
}