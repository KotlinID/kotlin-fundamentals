import id.kotlin.fundamentals.data.Companies
import id.kotlin.fundamentals.data.User
import id.kotlin.fundamentals.seal.Company
import id.kotlin.fundamentals.seal.Employee
import id.kotlin.fundamentals.Employee as Employees
import id.kotlin.fundamentals.seal.User as Users
import id.kotlin.fundamentals.utils.User as UserUtils

// Constant value in an extensions file
const val NAME = "Budi Oktaviyan Suryanto"

// Specify name for existing type
typealias UserList = List<User>

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
    val user = User("Budi ", "Oktaviyan Suryanto", 29)
    val employee = user.copy() // Copy to new object
    println("My name is ${user.firstName.plus(user.lastName)}")
    println("Employee age is ${employee.age}")

    // Example implementation of Data Class with empty constructor
    val companies = Companies().apply {
        companyId = 1
        companyName = "GO-JEK"
    }
    println(companies.companyName)

    // Example implementation
    setEmployee("Budi Oktaviyan Suryanto")

    // Example calling employee from sealed class
    println(getEmployee(Users("Budi", "Oktaviyan Suryanto", 29)))
    println(getEmployee(Company(1, "GO-JEK")))

    // Example calling constants
    println(Employees.USER_ID)
    println(NAME)

    // Example calling a singleton object
    println(UserUtils.INSTANCE.name)

    // Pair an Object
    val pairing = Pair(29, "Budi Oktaviyan Suryanto")
    println(pairing.first)
    println(pairing.second)

    // Example of fold
    println(toStringLeft(listOf(Pair(50, 100))))
    println(toStringRight(listOf(Pair(50, 100))))

    // Example of multiple function
    println(printName())
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
fun setEmployee(name: String, companyId: Int = -1) {}

// Function that call an object from sealed class
fun getEmployee(employee: Employee): String {
    return when (employee) {
        is Users -> employee.firstName.plus(" ").plus(employee.lastName)
        is Company -> employee.companyName
    }
}

// Folding an elements to left
fun toStringLeft(types: List<Pair<Int, Int>>): String {
    return types.fold(" -> ") { first, second ->
        first + second
    }
}

// Folding an elements to right
fun toStringRight(types: List<Pair<Int, Int>>): String {
    return types.foldRight(" <- ") { first, second ->
        "" + first + second
    }
}

// Multiple function
fun printName(): String {

    fun myName(): String = "Budi Oktaviyan Suryanto"
    return myName()
}