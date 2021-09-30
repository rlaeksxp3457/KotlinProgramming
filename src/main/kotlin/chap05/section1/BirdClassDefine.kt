package chap05.section1

class Bird {
    //프로퍼티(필드)
    var name: String
    var wing: Int
    var beak: String
    var color: String

    //부 생성자
    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }
    constructor(_name: String, _color: String) {
        name = _name
        this.wing = 5
        this.beak = "long"
        color = _color
    }

    //메서드
    fun fly() = println("Fly $wing")
    fun sing(volume: Int) = println("Sing $volume")
}

fun main() {

    val coco = Bird("mybird", 2, "long", "yellow")
    val coki = Bird("mybird","yellow")
    coco.color = "Blue"

    println("coco.name ${coco.name}")
    println("coco.color ${coco.color}")
    coco.fly()
    coco.sing(3)

}