import java.util.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Long>) {
    val minSum = arr
        .sortedArray()
        .sliceArray(0 until arr.size - 1)
        .sum()

    val maxSum = arr
        .sortedArray()
        .sliceArray(1 until arr.size)
        .sum()

    println("$minSum $maxSum")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    miniMaxSum(arr)
}
