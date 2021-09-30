package test

interface Bank {
    fun returnResult(): String
    fun getBalance() {}
    fun setBalance(pay: Int, check: Int) {}
}

class Console {
    fun run() {
        println("비밀번호를 입력 하세요!")
        val pin: Int? = readLine()?.toInt()
        val account = pin?.let { Account(it) }
        val bankController = account?.let { BankController(it) }


        if (account!!.checkPin()) {
            println("비밀번호가 일치 합니다.")
            var runCheck = true
            while (runCheck) {
                println("1.잔고 확인, 2.입금, 3.출금, 4.종료")
                when (val num: Int? = readLine()?.toInt()) {
                    1 -> {
                        println(bankController!!.returnResult())
                    }
                    2 -> {
                        println("입금 하실 금액을 입력 하세요.")
                        readLine()?.let { println(bankController!!.returnResult(it.toInt(), num)) }
                    }
                    3 -> {
                        println("출금 하실 금액을 입력 하세요.")
                        readLine()?.let { println(bankController!!.returnResult(it.toInt(), num)) }
                    }
                    4 -> {
                        println("프로그램을 종료 합니다.")
                        runCheck = false
                    }
                }
            }
        } else {
            println("비밀번호가 일치하지 않습니다.")
        }
    }
}

class BankController(_account: Account) : Bank {
    private val account: Account = _account
    private lateinit var message: String


    override fun getBalance() {
        message = "현재 잔고는 ${account.balance}원 입니다."
    }

    override fun setBalance(pay: Int, check: Int) {
        if (check == 2) {
            account.balance += pay
        } else if (check == 3) {
            account.balance -= pay
        }
        message = "현재 잔고는 ${account.balance}원 입니다."
    }

    override fun returnResult(): String {
        getBalance()
        return message
    }

    fun returnResult(pay: Int, check: Int): String {
        setBalance(pay, check)
        return message
    }
}

class Account(private val _pin: Int) {
    private val pin: Int = 12345
    var balance: Int = 1000000

    fun checkPin(): Boolean {
        return pin == this._pin
    }
}

fun main() {
    val bank = Console()
    bank.run()
}