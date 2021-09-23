package chap3.section5.teilrec

fun main() {
    val number = 4
    println("Factorial: $number -> ${factorial(number)}")
}

tailrec fun factorial(n: Int, run: Int = 1): Long{
    return if (n == 1) run.toLong() else factorial(n-1,run*n)
}