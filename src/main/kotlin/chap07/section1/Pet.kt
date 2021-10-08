package chap07.section1

interface Pet {
    val category: String // abstract 키우드가 없어도 기본은 추상 프로퍼티
        get() = "I'm your lovely pet!"
    fun feeding() // 마찬가지로 추상 메서드
    fun patting(){ // 일반메서드 : 구현부를 포함하면 일반적인 메서드로 기본이 됨
        println("Keep patting!") // 구현부
    }
}

class Cat(val name : String,override var category: String) : Pet{
    override fun feeding() {
        println("Feed the cat a tuna con!")
    }

}

fun main() {
    val obj = Cat("Coco","small")
    println("Pet Category: ${obj.category}")
    obj.feeding()
    obj.patting()
    println()
}