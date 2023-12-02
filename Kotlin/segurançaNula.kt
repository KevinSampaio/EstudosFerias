fun describeString(maybeString: String?): String {              // 1
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }
}

fun main() {

    var neverNull: String = "This can't be null"

//    neverNull = null

    var nullable: String = "You can keep a null here"

//    nullable = null

    var inferredNonNull = "The compiler assumes non-null"

//    inferredNonNull = null

    fun strLength(notNull: String): Int {
        return notNull?.length ?: 0
    }

    println(strLength(neverNull))
    println(strLength(nullable))
    println(describeString(null))

}
