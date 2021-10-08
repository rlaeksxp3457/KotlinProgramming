package chap07.section1

open class Animal( val name: String)

// feding의 구현을 위해 인터페이스 Pet 지정
class Dog(name : String, override val category: String ) : Animal(name), Pet{
   var species : String = "dog"

    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master{
    fun playWithPet(dog: Dog){
        println("Enjoy with my dog.")
    }
    fun playWithPet(cat: Cat){
        println("Enjoy with my cat.")
    }
}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "small")
    val cat = Cat("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}