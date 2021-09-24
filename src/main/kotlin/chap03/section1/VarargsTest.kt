package chap03.section1

fun main(args: Array<String>) {
    normalVaragrs(1, 2, 3, 4)
    normalVaragrs(4, 5, 6)
}

fun normalVaragrs(vararg counts: Int) { // 설문 조사 할떄 쓴다.
    for (num in counts) {
        println("$num")
    }

    print("\n\n")
    println(counts.toUIntArray())
}