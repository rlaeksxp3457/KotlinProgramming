package chap08.section1.limit

open class Animal(val size: Int) {
    fun feed() = println("Feeding...")
}

class Cat(val jump: Int) : Animal(50)

class Spider(val poison: Boolean) : Animal(50)

class Box<out T : Animal>(val element: T) {
    fun getAnimal(): T = element
/*    fun setAnimal(new: T){
        element = new
    }*/

}

fun main(args: Array<String>) {
    val c1 = Cat(10)
    val s1 = Spider(true)

    val catBox: Box<Cat> = Box(c1)
    val spiderBox = Box(s1)

    val animalBoxs = arrayOf(catBox, spiderBox)

    animalBoxs.forEach { i ->
        run {
            println(i.getAnimal().size)
            i.getAnimal().feed()
        }
    }

    catBox.getAnimal()
}