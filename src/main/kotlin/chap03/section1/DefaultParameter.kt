package chap03.section1

fun main(){
    val name ="홍길동"
    val email ="hong@example.kr"

    add(name) // name : 홍길동, email : default
    add(name, email) // name : 홍길동, email : hong@example.kr
    defaultArgs()   // 100 + 200
    defaultArgs(200)   // 200 + 200
    defaultArgs(y = 700)   // 200 + 200
}

fun add(name: String, email: String = "default"){ // 코틀린의 함수는 매개값의 기본값을 초기화 해줄수가 있다.
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200){
    println(x + y)
}