/*
Дана следующая структура классов.
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста:
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

Для этой задачи есть видео с разбором.
*/
fun totalNumberOfEmployees(company: Company): Int {
    var numberPeople = 0

    for (department in company.departments) {
        numberPeople += department.employees.size
    }

    return numberPeople
}

fun averageAgeOfEmployees(company: Company): Int {
//    var counter = 0
    var averageAge = 0

    for (department in company.departments) {
        for (employee in department.employees) {
//            counter++
            averageAge += employee.age
        }
    }
    return averageAge / totalNumberOfEmployees(company)
}

fun main() {
    val employee1 = Employee("Nikita", 25)
    val employee2 = Employee("Vika", 23)
    val employee3 = Employee("Olga", 21)
    val employee4 = Employee("Nastya", 29)
    val employee5 = Employee("Oleg", 31)
    val employee6 = Employee("Michael", 22)
    val employee7 = Employee("Max", 30)
    val employee8 = Employee("Masha", 32)
    val employee9 = Employee("Denis", 36)

    val listEmployees1 = listOf<Employee>(employee1,employee2,employee3)
    val listEmployees2 = listOf<Employee>(employee4,employee5,employee6)
    val listEmployees3 = listOf<Employee>(employee7,employee8,employee9)

    val department1 = Department("Engineers", listEmployees1)
    val department2 = Department("Technology Department", listEmployees2)
    val department3 = Department("Accounting", listEmployees3)

    val allCompany = Company("Windows", listOf<Department>(department1, department2, department3))

    val result1 = totalNumberOfEmployees(allCompany)

    println(result1)
    println(averageAgeOfEmployees(allCompany))
}