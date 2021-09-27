package chap04.section2

fun main() {

    do{
        print("Enter an integer: ")
        val input = readLine()!!.toInt()

        for(i in 0..(input-1)){ // until 로 변경 가능 0 until input
            for(j in 0..(input-1)) print((i+j) % input + 1) // until 로 변경 가능 0 until input
            println()
        }

    }while(input != 0)
}