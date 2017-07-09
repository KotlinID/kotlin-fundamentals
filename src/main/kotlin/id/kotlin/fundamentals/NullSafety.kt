package id.kotlin.fundamentals

class NullSafety {

    fun test(args: Array<String>) {

        var name = "Budi Oktaviyan Suryanto"
        // name = null // Caused a compilation error

        var names: String? = "Budi Oktaviyan Suryanto"
        names = null // Ok

        val nameLength = name.length // Variable 'name' can be null
        val namesLength = name?.length // Safe nullable check for 'name'
        val namesCheck = name?.length ?: 0 // Check and return default value using 'Elvis Operator'

        // Using 'let' for checking nullable object
        var user: User? = null
        user?.let { println(it.name) }
    }
}