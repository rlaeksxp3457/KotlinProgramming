package chap07.section2

interface Score {
    fun getScore(): Int
}

enum class MemberType(var prio: String) : Score {
    NORMAL("Third") {
        override fun getScore(): Int {
            return 100
        }
    },
    SILVER("Second") {
        override fun getScore(): Int {
            return 500
        }
    },
    GOLD("First") {
        override fun getScore(): Int {
            return 1500
        }
    }
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.SILVER.getScore())
    println(MemberType.GOLD.getScore())

    println(MemberType.NORMAL)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.GOLD.prio)

    for(grade in MemberType.values()){
        println("grade.name = ${grade.name}, prio = ${grade.prio}")
    }

}