/*
Написать функцию, которая возвращает текстовое представление для целых чисел от 1 до 5:
1 – «один», 2 – «два», 3 – «три», 4 – «четыре», 5 – «пять»
Если на вход приходит любое другое число, то возвращать: «ошибка»

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val Number: Int = readln().toInt()
    val result: String = textNumberUser(Number)

    println(result)
}

fun textNumberUser(userNumber:Int): String {

    val number: String = when(userNumber) {
        1 -> "один"
        2 -> "два"
        3 -> "три"
        4 -> "четыре"
        5 -> "пять"
        else -> "ошибка"
    }

    return number
}