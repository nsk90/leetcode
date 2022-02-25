package dynamicprogramming

private val cache = mutableMapOf<Int/*n*/, Int /*result*/>(0 to 0, 1 to 1)
/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * We use cache as there are many repeated tasks
 */
fun climbStairs(n: Int): Int {
    if (n < 3) return n
    val result = cache[n]
    return if (result == null) {
        val newResult = climbStairs(n - 1) + climbStairs(n - 2)
        cache[n] = newResult
        newResult
    } else {
        result
    }
}

fun main() {
    println(climbStairs(0)) // 0
    println(climbStairs(1)) // 1 // 1
    println(climbStairs(2)) // 1 + 1, 2  // 2
    println(climbStairs(3)) // 1 + 1 + 1, 2 + 1, 1 + 2 // 3
    // 1 + 1 + 1 + 1, 2 + 1 + 1, 1 + 2 + 1, 1 + 1 + 2, 2 + 2 // 5

    // sequence repeats only first value changes, it is 1 or 2
    // 1 + 1 + 1 + 1
    // 1 + 1 + 2
    // 1 + 2 + 1
    // 2 + 1 + 1
    // 2 + 2
    println(climbStairs(4))
    // 1 + 1 + 1 + 1 + 1, 2 + 1 + 1 + 1, 1 + 2 + 1 + 1, 1 + 1 + 2 + 1, 1 + 1 + 1 + 2, 2 + 2 + 1, 2 + 1 + 2, 1 + 2 + 2  // 8
    println(climbStairs(5))
    println(climbStairs(45))
}