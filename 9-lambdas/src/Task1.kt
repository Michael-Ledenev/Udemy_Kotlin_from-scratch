import java.util.concurrent.locks.Condition

/*
Написать функцию преобразования каждого элемента коллекции пользователей в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/


fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String> {
    var result = mutableListOf<String>()

    for (user in users) { result.add(conversion(user)) }

    return result
}

fun main() {
    val user1 = User("Olga", 24)
    val user2 = User("Nikita", 25)
    val user3 = User("Nastya", 30)
    val user4 = User("Michael", 20)
    val user5 = User("Katya", 27)

    val users = listOf(user1, user2, user3, user4, user5)

//    val result = convertToStrings(users, ::conversion)

    val result = convertToStrings(users) {"Name: ${it.name}. Age: ${it.age}"}

    println(result)
}

fun conversion(user: User): String {
    return "Name: ${user.name}. Age: ${user.age}"
}