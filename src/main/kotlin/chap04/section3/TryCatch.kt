package chap04.section3

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b // 0μΌλ‘ λλ
    } catch (e: Exception) {
        e.printStackTrace()
        println("Exception is handled: ${e.message}")
    } finally {
        println("Hello")
    }

}