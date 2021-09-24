package chap04.section1

fun main(args: Array<String>) {

    print("Enter the score:")
    val score = readLine()!!.toDouble() ////자바 스캐너랑 동일 작용
    val grade: Char = when(score){
        in 90.0..100.0 -> 'A'
        in 80.0..89.9 -> 'B'
        in 70.0..79.9 -> 'C'
        else -> 'F'
    }
    val msg = when(score){
        90.0, 100.0 -> "Good!"
        else -> "Not Bad!"
    }
    println("Score: $score, Grade: $grade, Msg: $msg")
}