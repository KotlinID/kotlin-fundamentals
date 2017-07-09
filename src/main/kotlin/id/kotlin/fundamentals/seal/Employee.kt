package id.kotlin.fundamentals.seal

// Default sealed class
sealed class Employee

data class User(val firstName: String,
                val lastName: String,
                val age: Int) : Employee()

data class Company(val companyId: Int,
                   val companyName: String) : Employee()