/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

На вход подаются: марка авто(String), возраст и стаж пользователя.
Определить доступно ли ему это авто или нет.
*/

fun main() {
    val userAge: Int = readln().toInt()
    val userStage: Int = readln().toInt()
    val carBrand: String = readln().toString()

    val result: String = when {
        userAge >= 26 && userStage >= 6 -> "Доступен"
        userAge >= 21 && userStage >= 2 && carBrand != "Audi" && carBrand != "BMW" -> "Доступен"
        else -> "Услуги каршеринга недоступны"
    }

    println(result)
}