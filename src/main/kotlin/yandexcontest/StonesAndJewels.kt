package yandexcontest

fun main() {
    val jewels = readLine()!!
    val stones = readLine()!!

    var jewelStones = 0
    stones.forEach {
        if (jewels.contains(it)) ++jewelStones
    }

    println(jewelStones)
}