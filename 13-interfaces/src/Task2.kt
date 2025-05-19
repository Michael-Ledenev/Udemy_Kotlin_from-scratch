/*
Создайте класс Animal с полями name: String, x: Int, y: Int, который будет реализовывать интерфейс Movable
из предыдущей задачи (любой вариант реализации на ваш выбор)

Для этой задачи есть видео с разбором.
*/

fun main() {
    val hare = Animal("Bunny")

    hare.moveUp(2)
    hare.moveDown(2)
    hare.moveLeft(2)
    hare.moveRight(2)
}

