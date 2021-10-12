package chap07.section3

class Point(var x: Int = 0, var y: Int = 10) {
    operator fun plus(p: Point): Point {
        return Point(x + p.x, y + p.y)
    }
    operator fun dec() = Point(--x,--y)
}

fun main() {
    var p1 = Point(3, -8)
    var p2 = Point(2, 9)

    var point = Point()
    point = p1 + p2 // Point 객체의 + 연산이 가능하게됨
    println("point = (${point.x}, ${point.y})")
    --point
    println("point = (${point.x}, ${point.y})")
}