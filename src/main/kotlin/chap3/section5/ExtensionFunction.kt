package chap3.section5

fun main() {
    val source = "Hello World!"
    val target = "Kotlin Kotlin Kotlin"
    println(source.getLongString(target))
    source getLongString target
}

// String을 확장해 getLongString 메소드 추가
infix fun String.getLongString(target: String): String =
    if(this.length > target.length) this else target