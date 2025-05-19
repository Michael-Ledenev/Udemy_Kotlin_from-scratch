/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean


Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean {
    for (user in users) {
        if (condition(user) == true)
            return true
    }
    return false
}

fun main() {
    val user1 = User("Olga", 24)
    val user2 = User("Nikita", 25)
    val user3 = User("Nastya", 30)
    val user4 = User("Michael", 20)
    val user5 = User("Katya", 27)

    val users = listOf(user1, user2, user3, user4, user5)

    val result = containsElement(users) { it.age >= 30 }

    println(result)
}