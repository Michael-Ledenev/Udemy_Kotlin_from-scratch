/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

data class User(val name: String, val age: Int, val experience: Int)
data class Car(val brand: String, val model: String, val cost: Double)

fun checkUserStatusString(user: User): String {
    val access = when {
        user.age >= 26 && user.experience >= 6 -> "Доступны все авто"
        user.age >= 21 && user.experience >= 2 -> "Доступны все авто кроме Audi и BMW"
        else -> "Услуги каршеринга недоступны"
    }

    return access
}

fun checkUserStatusBoolean(user: User, car: Car): Boolean{
    val access = when {
        user.age >= 26 && user.experience >= 6 -> true
        user.age >= 21 && user.experience >= 2 && car.brand != "Audi" && car.brand != "BMW" -> true
        else -> false
    }
    return access
}


fun main() {
    val user1 = User("Nikita", 25, 7)
    val car1 = Car("Toyota", "X7", 70000.0)

    val result1 = checkUserStatusString(user1)
    val result2 = checkUserStatusBoolean(user1, car1)

    println(result1)
    println(result2)
}