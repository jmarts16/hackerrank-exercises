import java.util.*

// Complete the birthdayCakeCandles function below.
fun birthdayCakeCandles(ar: Array<Int>): Int {
    val maxHeightCandle = ar.max()
    return ar.count{ it == maxHeightCandle }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}
