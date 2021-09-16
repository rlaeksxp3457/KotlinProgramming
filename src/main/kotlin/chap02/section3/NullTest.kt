package chap02.section3
/*
* 기본형을 사용하지 않고 참조형만 사용
* 서로 다른 자료형은 변환 과정을 거친 후 비교(변수.to타입)
*/
fun main() {
    var str1 : String? = "Hello Kotlin"
    var num : Int? = null

    str1 = null //Null을 허용하지 않음(오류 발생)
    println("str1: $str1, num: $num")
    //println("str1: $str1, length: ${str1?.length}")

    val len = if(str1 != null) str1.length else -1
    println("str1: $str1 length: $len")

    println("str1: $str1 length: ${str1?.length ?: -1}")


}