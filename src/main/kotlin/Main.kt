import id.kotlin.fundamentals.data.Companies
import id.kotlin.fundamentals.data.User

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

    // Example implementation of Data Class
    val user = User("Budi", "Oktaviyan Suryanto", 29)
    val employee = user.copy() // Copy to new object
    println("My name is ${user.firstName.plus(user.lastName)}")
    println("Employee age is ${employee.age}")

    // Example implementation of Data Class with empty constructor
    val companies = Companies()

    // Example implementation
    setEmployee("Budi Oktaviyan Suryanto")
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

// Default Try/Catch function
fun getEmployee(): String {
    try {
        val employee = User("Budi", "Oktaviyan Suryanto", 29)
        return employee.firstName.plus(" ").plus(employee.lastName)
    } catch (e: Exception) {
        e.printStackTrace()
        return ""
    }
}

// Try/Catch as variable
val employee = try {
    val user = User("Budi", "Oktaviyan Suryanto", 29)
    user.firstName.plus(" ").plus(user.lastName)
} catch (e: Exception) {
    e.printStackTrace()
}

// Default value for function parameters
fun setEmployee(name: String, companyId: Int = -1) {
    println(name.plus(" - ").plus("Company Id: $companyId"))
}