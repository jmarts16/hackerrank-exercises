import java.util.*
import kotlin.math.ceil
import kotlin.math.sqrt


// Complete the encryption function below.
fun encryption(s: String): String {
    val columns = ceil(sqrt(s.trim().length.toDouble()))
    val foldInitialValue = (1..columns.toInt())
        .toList()
        .map { emptyList<Char>() }

    return s
        .toList()
        .chunked(columns.toInt())
        .fold(foldInitialValue){
                acc,
                list -> acc
            .mapIndexed { index, finalColumn -> finalColumn + listOf(list.getOrElse(index) { ' ' })}}
        .map { it.joinToString("").trim() }
        .joinToString(" ")


}

fun main() {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = encryption(s)

    println(result)
}
