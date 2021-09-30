package chap05.section5.protected

open class Base {
    protected var i = 1

    protected fun protectedFunc(x : Int) {
        this.i += x
    }
}

class Derived(val num: Int) : Base() {

    fun derivedFunc(): Int{
        protectedFunc(this.num)
        return 1 + i
    }
}

class Other {
    val base = Base()
   // base.i = 3
}

fun main() {
    val test = Derived(10)
   println(test.derivedFunc())
}