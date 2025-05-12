/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/

fun availableCarsForUser(allCar: List<Car>, user: User): List<Car> {
    val result = mutableListOf<Car>()

    when{
        user.age >= 26 && user.experience >= 6 -> result += allCar.toMutableList()
        user.age >= 21 && user.experience >= 2 ->
            for (car in allCar) {
                if (car.brand != "BMW" && car.brand != "Audi")
                    result += car // result.add(car)
            }
    }

//    for (car in allCars) {
//        val condition1 = user.age >= 26 && user.experience >= 6
//        val condition2 =user.age >= 21 && user.experience >= 2 && car.brand != "Audi" && car.brand != "BMW"
//        if (condition1 == true||condition2 == true)
//            result.add(car)
//    }

    return result
}

fun main() {

    val user1 = User("Michael", 21, 8)

    val car1 = Car("Audi", "X7", 70000.0)
    val car2 = Car("BMW", "X3", 80000.0)
    val car3 = Car("Nissan", "Skyline", 130000.0)
    val car4 = Car("Mitsubishi", "200", 18000.0)
    val car5 = Car("Tesla", "Star", 270000.0)

    val listCars = listOf<Car>(car1, car2, car3, car4, car5)

    val result = availableCarsForUser(listCars, user1)

    println(result.size)
    println(result)
}