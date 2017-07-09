package id.kotlin.fundamentals.data

// Data class with empty constructor
data class Companies(val companyId: Int,
                     val companyName: String) {
    constructor() : this(-1, "")
}