import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val triplets = listOf(Triplet(a[0], b[0]), Triplet(a[1], b[1]), Triplet(a[2], b[2]))
    val aliceScore = triplets.filter { it.aliceValue > it.bobValue }.size
    val bobScore = triplets.filter { it.bobValue > it.aliceValue}.size
    return listOf(aliceScore, bobScore).toTypedArray()
}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}

data class Triplet(val aliceValue: Int, val bobValue: Int)