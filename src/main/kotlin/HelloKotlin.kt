import com.example.edu.Person as User

fun main() { // 함수(메소드) 선언은 fun 으로!

    val person = User("Kildong", 20)
    val person2 = Person(123, "Kildong", "Programmer")

    println(person)
    println(person.name)
    println(person.age)
}

class Person(val no: Int, val name: String, val jobTitle: String)