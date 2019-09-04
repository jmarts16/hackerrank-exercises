import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

const val POSITIVE = -2
const val ZERO = 0
const val NEGATIVE = -1


// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>) {
    val sortedValues = arr
        .groupBy {
            when (it) {
                in -100..-1 -> NEGATIVE
                in 1..100 -> POSITIVE
                else -> ZERO
            }
        }

    listOf(sortedValues.getOrDefault(POSITIVE, listOf()).size, sortedValues.getOrDefault(NEGATIVE, listOf()).size, sortedValues.getOrDefault(ZERO, listOf()).size)
        .map { BigDecimal(it.toDouble() / arr.size.toDouble()).setScale(6, RoundingMode.UP) }
        .forEach { println(it) }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    scan.nextLine()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
