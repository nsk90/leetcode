package yandexcontest

/**
 * Найти максимальную последовательность единиц
 */
fun main() {
    val countOfNumbers = readLine()!!.toInt()
    var longestSequence = 0
    var sequenceLength = 0
    for (n in 0 until countOfNumbers) {
        val number = readLine()!!.toInt()
        if (number == 1) {
            ++sequenceLength
            // update longestSequence
            if (sequenceLength > longestSequence)
                longestSequence = sequenceLength
        } else {
            sequenceLength = 0
        }
    }
    println(longestSequence)
}