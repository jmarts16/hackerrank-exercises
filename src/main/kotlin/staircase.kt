import java.util.*

// Complete the staircase function below.
fun staircase(n: Int) {
    val result = 1.rangeTo(n)
        .toList()
        .map { " ".repeat(n - it).plus("#".repeat(it)) }
        .joinToString("\n")

    println(result)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}
