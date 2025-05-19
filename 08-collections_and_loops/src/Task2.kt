/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает самого младшего из них

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun youngAgeOfEmployees(userList: List<Employee>): Int {
    var minAgeEmployee = userList[0].age

    for(employee in userList)
        if (minAgeEmployee > employee.age) {
            minAgeEmployee = employee.age
        }
    return minAgeEmployee
}

fun main() {
    val emp1 = Employee("Vasya", 25)
    val emp2 = Employee("Ivan", 20)
    val emp3 = Employee("Olga", 31)
    val emp4 = Employee("Zurab", 23)

    val listEmployee = listOf(emp1, emp2, emp3, emp4)

    val result = youngAgeOfEmployees(listEmployee)
    println(result)
}