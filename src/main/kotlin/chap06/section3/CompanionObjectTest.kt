package chap06.section3

class Person {
    var id : Int = 0
    var name : String = "범수"
    companion object{
        var language : String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    val person = Person()

    println(Person.language) // 인스턴스를 생성하지 않고 기본값 사용
    Person.language = "English" // 기본값 변경 가능
    println(Person.language) // 변경된 내용 출력
    Person.work()   //메소드 실행
    println(person.name) //name은 companion object가 아니므로 에러
}