package chap05.section1.primary

class Bird(var name: String = "NONAME", var wing: Int = 2, var beak: String, var color: String) {

    init {
        println("----------초기화 블록 시작----------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("----------초기화 블록 끝----------")
    }

    //메서드
    fun fly() = println("Fly $wing")
    fun sing(volume: Int) = println("Sing $volume")
}

fun main() {

    val coco = Bird("mybird", 2, "long", "yellow")
    val coco2 = Bird(beak = "long", color = "yellow")
    val coco3 = Bird(beak = "long", color = "yellow")
    val coco4 = Bird(beak = "long", color = "yellow")
    coco.color = "Blue"

    println("coco")
    println("coco.name ${coco.name}")
    println("coco.color ${coco.color}")
    coco.fly()
    coco.sing(3)

    println("coco2")
    println("coco.name ${coco2.name}")
    println("coco.color ${coco2.color}")
    coco2.fly()
    coco2.sing(3)

}