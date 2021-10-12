package chap07.section2

sealed class Result {
    open class Success(val message: String) : Result()
    class Error(val code: Int, val message: String) : Result()
}

fun main() {
    val result = Result.Success("Success")
    val result2 = Result.Error(10, "No disk")
    println(eval(result))
    println(eval(result2))
}

fun eval(result: Result): String = when(result){
    is Result.Success -> result.message
    is Result.Error -> result.message
}