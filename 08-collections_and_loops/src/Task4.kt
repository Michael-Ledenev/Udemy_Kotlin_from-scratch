/*
Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функцию, которая на вход принимает объект класса Department и возвращает средний возраст сотрудников этого отдела
Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun avgEmployeesSection(selectedDepartment: Department): Int {
    var avgSum = 0
    for (employee in selectedDepartment.employees) {
        avgSum += employee.age
    }

    return avgSum/selectedDepartment.employees.size
}

fun main() {
    val employee1 = Employee("Nikita", 25)
    val employee2 = Employee("Vika", 23)
    val employee3 = Employee("Olga", 21)
    val employee4 = Employee("Nastya", 29)
    val employee5 = Employee("Oleg", 25)

    val employees = listOf<Employee>(employee1,employee2,employee3,employee4,employee5)

    val section = Department("Technology Department", employees)
    val result = avgEmployeesSection(section)

    println(result)
}
