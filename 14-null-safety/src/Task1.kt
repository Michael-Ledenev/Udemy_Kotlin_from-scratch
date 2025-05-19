/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

fun main() {
    val user1 = SomeEmployee("Kirill", 11)
    val user2 = SomeEmployee("Olga", 15)
    val user3 = SomeEmployee("Vladimir", 21)
    val user4 = SomeEmployee("Nikita", 41)

    val employeesList = listOf<SomeEmployee>(user1, user2, user3, user4)

    val employee = findEmployeeBySalary(employeesList, 221)

    employee?.callToClient("Ivan")
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee? {

    for (employee in employees) {
        if (employee.salary == salary) {
            return employee
        }
    }
    return null
}

