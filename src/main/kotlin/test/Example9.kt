package test

import java.util.*

fun main() {
    var run = true;
    var studentNum = 0;
    var scores: Array<Int?> = emptyArray()
    val scanner= Scanner(System.`in`)

    while(run){
        println("------------------------------")
        println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료")
        println("------------------------------")
        print("선택> ")

        val selectNo : Int? = readLine()?.toInt() //자바 스캐너랑 똑같엥 Scanner.nextInt()

        when(selectNo){
            1 -> {
                print("학생수>")
                studentNum = scanner.nextInt()
                scores = arrayOfNulls(studentNum)
            }
            2 -> {
                for (i in 0 until studentNum step 1){
                    print("scores[$i]>")
                    val score: Int = scanner.nextInt()
                    scores[i] = score
                }
            }
            3 -> {
                for (i in 0 until studentNum step 1){
                    println("scores[$i]: ${scores[i]}")
                }
            }
            4 -> {
                var maxScore:Int = 0
                var sum:Int = 0
                var avg:Double = 0.0
                for(i in 0 until studentNum step 1){
                    sum += scores[i]!!
                    if(scores[i]!! >maxScore){
                        maxScore = scores[i]!!
                    }
                }
                avg = sum/studentNum.toDouble()
                println("최고 점수: $maxScore")
                println("평균 점수: $avg")
            }
            5 -> {
                println("프로그램 종료!")
                run = false
            }
        }
    }


}