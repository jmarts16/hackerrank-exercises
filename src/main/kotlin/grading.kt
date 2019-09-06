/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun roundGrade(grade: Int): Int{
    return if ((grade / 5 + 1) * 5 - grade < 3) grade + (5 - (grade % 5)) else grade
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    return grades.map { if(it < 38 ) it else roundGrade(it) }.toTypedArray()
}

fun main() {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
