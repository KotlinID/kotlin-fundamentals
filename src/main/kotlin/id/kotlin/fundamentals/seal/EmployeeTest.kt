package id.kotlin.fundamentals.seal

// Function that call an object from sealed class
fun getEmployee(employee: Employee): String {
    return when (employee) {
        is User -> employee.firstName.plus(" ").plus(employee.lastName)
        is Company -> employee.companyName
    }
}