/*
Создайте интерфейс Movable (перемещаемый), в котором будут описаны функции moveLeft(step: Int), moveRight(step: Int),
moveDown(step: Int), moveUp(step: Int).

Сделайте так, чтобы класс Figure из предыдущего задания реализовывал интерфейс Movable (скопируйте сюда код написанного
вами класса Figure)

Для этой задачи есть видео с разбором.
*/

fun main() {
    val result1 = Rectangle("red", 10.7, 74.1)
    val result2 = Round("red", 10.7)
    val result3 = Triangle("red", 10.0, 20.0, 10.0)

    result1.moveUp(2)
    result2.moveDown(2)
    result3.moveLeft(2)
}
