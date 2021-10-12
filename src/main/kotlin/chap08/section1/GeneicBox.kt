package chap08.section1

class Box<T>(t: T){
    var name = t
}

fun main() {

    val box1: Box<Int> = Box(1) //  1은 Int형이므로 Box<Int> 로 유추함
    val box2: Box<String> = Box("Kildong")

    println("Box<T> -> ${box1.name}, ${box2.name}")

}