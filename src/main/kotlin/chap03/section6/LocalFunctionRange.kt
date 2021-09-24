package chap03.section6

fun a() = b() // 최 상위 함수이므로 b()함수 선언 위치에 상관 없이 사용 가능
fun b() = println("b") // b()함수의 선언

/*fun c() = { // 오류! d()는 지역 함수이며 e()의 이름을 모름
    fun e() = println("e")
}*/

fun main() {
    a() // 최상위 함수는 어디서든 호출될 수 잇다.
    //e() // 오류! c()함수에 정의된 e()는 c블록({ })을 벗어난 곳에서 사용할 수 없음
}