fun main(args: Array<String>) {

    val width = 50 // Immediate assignment
    val height = 50 // 'Int' type is inferred
    var name = "Budi Oktaviyan Suryanto" // 'String' type is inferred
    var hello = "Hai, My Name is $name" // With 'String' template

    // Given a list of odd number
    val numbers = listOf(1, 3, 5, 7, 9)

    for (number in numbers) {
        println("Number is $number")
    } // for loop

    for (index in numbers.indices) {
        println("Number at $index is ${numbers[index]}")
    } // for loop indexed

    for (number in numbers) {
        if (number in 1..5) {
            println(number)
        }
    } // for loop using ranges

    // for loop using ranges with single expression
    numbers.filter { it in 1..5 }.forEach { println(it) }
}

// Function with return value
fun total(width: Int, height: Int): Int {
    return width * height
}

// Single expression function with return value
fun totals(width: Int, height: Int): Int = width * height

// Default conditional expression
fun compareMoney(oldValue: Int, newValue: Int): String {
    if (oldValue > newValue) {
        return "Money $oldValue is more expensive than $newValue"
    } else {
        return "Money $newValue is the expensive one!"
    }
}

// Single conditional expression
fun compareMoneys(oldValue: Int, newValue: Int): String = if (oldValue > newValue) "Money $oldValue is more expensive than $newValue" else "Money $newValue is the expensive one!"

// Default when expression
fun getCurrency(type: Int): String {
    when (type) {
        1 -> return "Rupiah"
        2 -> return "Dollar"
        else -> return "Nothing match!"
    }
}

// When expression return explicitly
fun getCurrencyExtra(type: Int): String {
    return when (type) {
        1 -> "Rupiah"
        2 -> "Dollar"
        else -> "Nothing match!"
    }
}

// Single when expression function
fun getCurrencies(type: Int): String = when (type) {
    1 -> "Rupiah"
    2 -> "Dollar"
    else -> "Nothing match!"
}