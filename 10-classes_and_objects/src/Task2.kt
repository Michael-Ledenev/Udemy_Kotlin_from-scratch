/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.
Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)
Создайте объект класса Round и проверьте работоспособность написанных функций
*/

fun main() {
    val result = Round(10.7)

    println (result.area())
    println (result.length())
}

class Round(val radius: Double) {
    fun area(): Double {
        return (Math.PI * radius * radius)
    }
    fun length(): Double {
        return (2 * Math.PI * radius)
    }
}