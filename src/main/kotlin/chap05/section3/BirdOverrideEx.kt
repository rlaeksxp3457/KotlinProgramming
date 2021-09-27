package chap05.section3


open class Bird(
    var name: String,
    var wing: Int,
    var beak: String,
    var color: String
) {
    //메소드
    fun fly() = println("Fly wind: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol") // 오버라이딩 가능한 메소드
}

class Parrot// 새로 추가된 프로퍼티 마지막 인자만 var로 선언되어 프로퍼티(필드)가 추가됨
    (
    name: String,
    wing: Int = 2,
    beak: String,
    color: String,
    var language: String = "natural"
) : Bird(
    name,
    wing,
    beak,
    color
) {
    fun speak() = println("Speak! $language") // Parrot에 추가된 메소드
    override fun sing(vol: Int) { // 오버 라이딩된 메소드
        println("I'm parrot! The volume level is $vol")
        speak() // 달라진 내용
    }
}

fun main() {
    val parrot = Parrot(name = "myparrot", beak = "short", color = "multiple")
    parrot.language = "English"
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.sing(5) // 달라진 메소드 실행가능
}