package chap05.section5.private

private class PrivateClass {
    private var i = 1
    private fun privateFunc(){
        i += 1 // 접근 허용
        println(i)
    }
    fun access(){
        privateFunc() // 접근 허용
    }
}
class OtherClass{
    //val opc = PrivateClass() // 불가 - 프로퍼티 opc 는 private 이 되어야 함
    fun test(){
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass() // 생성 가능 최상위 함수에서는 사용 가능 하다.
   // pc.i // 접근 불가
   // pc.privateFunc() // 접근 불가
    pc.access()
}
fun TopFunction(){
    val tpc = PrivateClass() // 객체 생성 가능
}