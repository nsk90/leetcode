package yandexcontest

fun main() {
    val firstLine = readLine()!!
    val secondLine = readLine()!!

    if (isAnagram(firstLine, secondLine))
        println("1")
    else
        println("0")
}

/**
 * Лучший способ завести массив букв, и для одной строчки инкрементить там счетчик, для другой декрементить.
 * потом проверить что везде 0.
 */
fun isAnagram(firstLine: String, secondLine: String) : Boolean {
    if (firstLine.length != secondLine.length)
        return false

    val first = firstLine.toCharArray().apply { sort() }
    val second = secondLine.toCharArray().apply { sort() }

    for (c in first.indices)
        if (first[c] != second[c])
            return false

    return true
}
