import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    val formatter = DateTimeFormatter.ofPattern("hh:mm:ss")
    return LocalDate.parse(s, formatter).toString()

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
