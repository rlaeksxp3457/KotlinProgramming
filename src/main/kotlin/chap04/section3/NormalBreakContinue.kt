package chap04.section3

fun main() {
    for (i in 1..5) {
        if (i == 3) break
        print(i)
    }
    println() // 개행문자
    println("outside")
    labelBreak()
}

fun labelBreak() {
    println("labelBreak")
    for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

fun labelBreakV2() {
    println("labelBreak")
    first@ for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}