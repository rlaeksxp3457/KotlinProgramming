package chap3.section3
/*
이것을 잘 이용하면 상황에 맞춰 즉시 실행할 필요가 없는 코드를 작성하는 경우
이름에 의한 호출 방법을 통해 필요한 떄만 람다식 함수가 작동하도록 만들 수 있다.
*/


fun main() {
    val result = callByName(otherLambda) // 람다식 이름으로 호출
    println(result)
}

fun callByName(b: () -> Boolean) : Boolean{ // 람다식 함수 자료형으로 선언됨 매개변수
    println("callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}