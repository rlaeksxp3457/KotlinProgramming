package chap05.section1.bird2

class Bird(var name: String, var wing: Int, var beak: String, var color: String) {

    //메서드
    fun fly() = println("Fly $wing")
    fun sing(volume: Int) = println("Sing $volume")
}

fun main() {

    val coco = Bird("mybird", 2, "long", "yellow")
    coco.color = "Blue"

    println("coco.name ${coco.name}")
    println("coco.color ${coco.color}")
    coco.fly()
    coco.sing(3)

}