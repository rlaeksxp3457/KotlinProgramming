package chap03.section3.high2

fun main() {

    var result: Int

    // 람다식을 매개변수와 인자로 사용한 함수
    result = highOrder(::sum, 10, 20)
    println(result)

    // 코드를 더 간결하게 대입!
    val result2: Int = highOrder({ x, y -> x + y }, 10, 20)
    println(result2)
}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
   return sum(a, b)
}

fun sum(a : Int, b: Int): Int = a + b