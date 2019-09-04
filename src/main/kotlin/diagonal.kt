import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    val x = arr
        .mapIndexed { index, values -> Pair(values[index], values[values.size - 1 - index]) }
        .reduce { acc, pair -> Pair(acc.first + pair.first, acc.second + pair.second) }
    return abs(x.first - x.second)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
