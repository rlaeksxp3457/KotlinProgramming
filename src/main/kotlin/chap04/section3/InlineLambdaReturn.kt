package chap04.section3

fun main() {
    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("start of retFunc") // 1
    inlineLambda(13, 3, fun(a, b) { // 2
        val result = a + b
        if (result > 10) return // 3
        println("result: $result") // 4)
    })
    println("end of retFunc") // 5
}