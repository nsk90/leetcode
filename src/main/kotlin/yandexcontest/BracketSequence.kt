package yandexcontest

/**
 * 3
 * ((()))
 * (()())
 * (())()
 * ()(())
 * ()()()
 */
fun main() {
    val countOfBracketPairs = readLine()!!.toInt()

//    for (b in 0 until countOfBracketPairs) {
//        print("()")
//    }
//    println()

    recursiveAlgo(countOfBracketPairs, countOfBracketPairs)
    println()
}

/**
 * count 3
 * nesting 3
 * ((()))
 * nesting 2
 * (())()
 * ()(())
 * nesting 1
 * ()()()
 */
fun recursiveAlgo(count: Int, nesting: Int) {
    println("A")
    if (nesting == 0) return

    val size = count - nesting
    for (nestPos in 0..size) {
        straight(nestPos)
        recursive(nesting)
        straight(size - nestPos)
        println("L")
        if (nesting == 1) break
    }


    recursiveAlgo(count, nesting - 1)
}

fun recursive(count: Int) {
    if (count == 0) return
    print("(")
    recursive(count - 1)
    print(")")
}

fun straight(count: Int) {
    for (b in 0 until count) {
        print("()")
    }
}

/**
 * 3
 * ((()))
 * (()())
 * (())()
 * ()(())
 * ()()()
 *
 * 4
 * ()()()()
 *
 * (()()())
 * ((())())
 * (()(()))
 *
 * (()())()
 * ()(()())
 *
 * (())()()
 * ()(())()
 * ()()(())
 *
 * ((()))()
 * ()((()))
 *
 * (((())))
 */
fun recursiveCursor() {

}