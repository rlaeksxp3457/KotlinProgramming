package chap04.section1

class MyClass

fun main(args: Array<String>) {
    cases("Hello")                  // String
    cases(1)                        // Int
    cases(System.currentTimeMillis())   // Long
    cases(MyClass())                    // 객체

}

fun cases(obj:Any){
    when (obj){
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not A String")
        else -> println("Unknown")
    }
}