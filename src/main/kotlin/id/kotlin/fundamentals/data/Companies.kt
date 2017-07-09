package id.kotlin.fundamentals.data

// Data class with empty constructor
data class Companies(var companyId: Int,
                     var companyName: String) {
    constructor() : this(-1, "")
}