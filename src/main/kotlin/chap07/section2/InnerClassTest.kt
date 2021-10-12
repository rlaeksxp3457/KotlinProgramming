package chap07.section2

interface Switcher {
    fun on(): String
}


class Smartphone(val model: String) {

    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb" // 바깥 클래스의 프로퍼티 접근
    }

    fun powerOn(): String {
        class Led(val color: String) { // 지역 클래스 선언
            fun blink(): String = "Blinking $color on $model"
        }

        val powerStaus = Led("Red")
        //return powerStaus.blink()
        val powerSwitch = object : Switcher {
            override fun on(): String {
                return powerStaus.blink()
            }
        }
        return powerSwitch.on()
    }

}

fun main() {
    val mySdcard = Smartphone("fold 3").ExternalStorage(1024)
    println(mySdcard.getInfo())

    val notebook = Smartphone("macbook pro 16in").ExternalStorage(2048)
    val notebookInfo = Smartphone("macbook pro 16in")
    println(notebook.getInfo())
    println(notebookInfo.powerOn())
}