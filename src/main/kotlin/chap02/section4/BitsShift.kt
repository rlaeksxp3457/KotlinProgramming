package chap02.section4

fun main(){
    val num = -4 // 0100 = 4
    println(num.shl(1)) // 0100 = 4 -> 0001 0000 = 16
    println(num shl 1) // 중위 표현법 (infix)

    println(num.shr(1)) // 0100 -> 0001
    println(num shr 1)
    println(num.ushr(1))

    var x = 4
    var y = 0b000_1010  // 10진수 10
    var z = 0x0F        // 10진수 15

    println("x shl 2 -> ${x shl 2}")    //16
    println("x.inv -> ${x.inv()}")    //-5

    println("y.shl 2 -> ${y shl 2}")    //2, 2
    println("x.shl 4 -> ${x*16}, ${x shl 4}")    //64, 64
    println("z.shl 4 -> ${z*16}, ${z shl 4}")    //240, 240

    x= 64
    println("x shl 4 -> ${x/4}, ${x shr 2}") // 16, 16


}