package chap03.section3.funarg

fun main() {
    val res1 = sum(10, 3) // 일반 인자
    val res2 = mul(sum(3, 3), 2) // 인자에 함수를 사용

    println("result: $res1, result2: $res2")
    println(funcFunc())
}

fun sum(a: Int, b: Int) = a + b
fun mul(a: Int, b: Int) = a * b

fun funcFunc(): Int{ //함수의 반환값으로 함수 사용
    return sum(2, 2)
}
