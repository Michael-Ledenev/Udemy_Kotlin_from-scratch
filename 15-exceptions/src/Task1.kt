/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
*/

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee {

    for (employee in employees) {
        if (employee.salary == salary) {
            return employee
        }
    }

    throw Exception("Подходящего сотрудника с зарплатой $salary - не найден!")

}

fun main() {
    val user1 = SomeEmployee("Kirill", 11)
    val user2 = SomeEmployee("Olga", 15)
    val user3 = SomeEmployee("Vladimir", 21)
    val user4 = SomeEmployee("Nikita", 41)

    val employeesList = listOf<SomeEmployee>(user1, user2, user3, user4)

    try {
        val employee = findEmployeeBySalary(employeesList, 122)
        println(employee.name)
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

}


class SomeEmployee(
    val name: String,
    val salary: Int,
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

