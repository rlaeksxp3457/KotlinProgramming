package chap03.section5.localreturn

fun main() {
    shortFunc(3){
        println("First call: $it")
        return // 의도하지 않은 반환
    }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit){ // 호출시 함수 복제 복기가 없어 리소스 줄일수있음?
    println("Before calling out()")
    out(a)
    println("After calling out()") // 이 문장은 실행되지 않음
}