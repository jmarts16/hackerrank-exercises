import java.util.*

// Complete the matchingStrings function below.
fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    return queries.map { strings.count { el -> el == it } }.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val stringsCount = scan.nextLine().trim().toInt()

    val strings = Array(stringsCount, { "" })
    for (i in 0 until stringsCount) {
        val stringsItem = scan.nextLine()
        strings[i] = stringsItem
    }

    val queriesCount = scan.nextLine().trim().toInt()

    val queries = Array(queriesCount, { "" })
    for (i in 0 until queriesCount) {
        val queriesItem = scan.nextLine()
        queries[i] = queriesItem
    }

    val res = matchingStrings(strings, queries)

    println(res.joinToString("\n"))
}
