package yandexcontest

import java.util.*

/**
 * Не помогло уложиться в 10mb, наверное строки кешируются.
 */
fun main() {
    val input = Scanner(System.`in`)
    val countOfNumbers = input.nextInt()
    var previous = 0
    for (n in 0 until countOfNumbers) {
        val number = input.nextInt()
        if (n == 0) {
            println(number)
        } else {
            if (previous != number)
                println(number)
        }
        previous = number
        System.out.flush()
    }
    input.close()
}

/**
 * readLine жрет больше 10 мб памяти
 */
fun main1() {
    val countOfNumbers = readLine()!!.toInt()
    var previous = 0
    for (n in 0 until countOfNumbers) {
        val number = readLine()!!.toInt()
        if (n == 0) {
            println(number)
        } else {
            if (previous != number)
                println(number)
        }
        previous = number
    }
}

fun main2() {
    val countOfNumbers = readLine()!!.toInt()

    val numbers = mutableListOf<Int>()
    for (n in 0 until countOfNumbers) {
        numbers += readLine()!!.toInt()
    }

    var previous = 0
    for (n in 0 until countOfNumbers) {
        val number = numbers[n]
        if (n == 0) {
            println(number)
        } else {
            if (previous != number)
                println(number)
        }
        previous = number
    }
}
