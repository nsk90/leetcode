package yandexcontest

fun main() {
    val args = readLine()!!.split(" ")
    val numbers = args.map { it.toInt() }
    val sum = numbers.sum()
    println(sum)
}