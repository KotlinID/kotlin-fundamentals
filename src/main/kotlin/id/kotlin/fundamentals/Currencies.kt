package id.kotlin.fundamentals

class Currencies {

    lateinit var currency: String

    //  Function without return value
    fun setMoney(currency: String): Unit {
        this.currency = currency
    }

    //  Function without return value and 'Unit'
    fun setMoneys(currency: String) {
        this.currency = currency
    }
}