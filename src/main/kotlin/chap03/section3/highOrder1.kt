package chap03.section3

fun main() {
    val result: Int
    //일반 변수에 람다식 할당
    val multi = { x: Int, y: Int ->
        println("x * y")
        x * y
    }
    val multi2: (Int, Int) -> Int = { x, y -> x * y }
    //val multi3 = {x, y -> x * y}

    val greet: () -> Unit = { println("Hello") }
    val nestedLambda: () -> () -> Int = { { 20 } }

    // 람다식이 할당된 변수는 함수처럼 사용 가능
    result = multi(10, 20)
    println(result)
    println(greet)
    greet()
    val test = nestedLambda()()
    println(test)
}