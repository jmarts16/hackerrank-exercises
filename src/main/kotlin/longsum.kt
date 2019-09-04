import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    scan.nextLine()

    val result = scan.nextLine().split(" ").map{ it.trim().toLong() }.sum()

    println(result)
}
