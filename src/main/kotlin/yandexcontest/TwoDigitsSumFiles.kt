package yandexcontest

import java.io.File

fun main() {
    val line = File("input.txt").readLines().single()
    val numbers = line.split(" ").map { it.toInt() }

    File("output.txt").writeText(numbers.sum().toString())
}