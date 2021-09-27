package chap04.section2

fun main() {

    print("Enter the lines: ")
    val n = readLine()!!.toInt() // 콘솔에서 정수값을 입력 받음

    for(line in 1..n){
        for(space in 1..(n - line)) print(" ") // 공백출력
        for(star in 1..(2 * line -1)) print("*") // 별 찍기 until 로 대체 가능 1 until 2 * line
        println() // 개행(줄 바꿈)
    }
}