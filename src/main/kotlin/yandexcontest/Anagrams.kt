package yandexcontest

fun main() {
    val firstLine = readLine()!!
    val secondLine = readLine()!!
    if (firstLine.length != secondLine.length) {
        println("0")
        return
    }

    val first = firstLine.toCharArray().apply { sort() }
    val second = secondLine.toCharArray().apply { sort() }

    for (c in first.indices) {
        if (first[c] != second[c]) {
            println("0")
            return
        }
    }

    println("1")
}