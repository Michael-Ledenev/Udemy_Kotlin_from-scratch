/*
Создайте коллекцию перемещаемых объектов (которые реализуют интерфейс Movable из предыдущей задачи),
среди которых будут разные геометрические фигуры и животные.
Переместить все элементы коллекции вправо на 10 шагов

Для этой задачи есть видео с разбором.
*/

fun main() {
    val rectangle1 = Rectangle("orange", 5.0, 10.0)
    val triangle1 = Triangle("green", 5.0, 10.0, 7.0)
    val round1 = Round("blue", 10.0)
    val animal1 = Animal("Casper")

    val objectList = listOf<Movable>(rectangle1, triangle1, round1, animal1)

    for (selectObject in objectList) {
        selectObject.moveRight(10)
    }
}