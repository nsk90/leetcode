package sorting

/**
 * Given an integer array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....
 *
 * You may assume the input array always has a valid answer.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,5,1,1,6,4]
 * Output: [1,6,1,5,1,4]
 * Explanation: [1,4,1,5,1,6] is also accepted.
 * Example 2:
 *
 * Input: nums = [1,3,2,2,3,1]
 * Output: [2,3,1,3,1,2]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 5 * 104
 * 0 <= nums[i] <= 5000
 * It is guaranteed that there will be an answer for the given input nums.
 *
 *
 * Follow Up: Can you do it in O(n) time and/or in-place with O(1) extra space?
 */
class Solution {
    /**
     * My first solution
     */
    fun wiggleSort(nums: IntArray): Unit {
        if (nums.size < 2) return

        val sorted = nums.sorted()
        val maxChunkSize = sorted.size / 2 + sorted.size.mod(2)
        val chunked = sorted.chunked(maxChunkSize)
        val smallValues = chunked[0].reversed()
        val bigValues = chunked[1].reversed()
        val result = mutableListOf<Int>()

        for (index in 0 until maxChunkSize) {
            if (index <= smallValues.lastIndex)
                result.add(smallValues[index])
            if (index <= bigValues.lastIndex)
                result.add(bigValues[index])
        }
        result.forEachIndexed { index, element ->
            nums[index] = element
        }
    }

    /**
     * Edik's solution
     */
    fun wiggleSortEdik(nums: IntArray): Unit {
        val max = nums.max()
        val numbersCounts = IntArray(max + 1)
        nums.forEach { numbersCounts[it]++ }

        var numberIndex = numbersCounts.size - 1

        for (i in 1 until nums.size step 2) {
            numberIndex = maxIndex(numbersCounts, numberIndex)
            nums[i] = numberIndex
            numbersCounts[numberIndex]--
        }

        for (i in 0 until nums.size step 2) {
            numberIndex = maxIndex(numbersCounts, numberIndex)
            nums[i] = numberIndex
            numbersCounts[numberIndex]--
        }
    }

    private fun maxIndex(numbersCounts: IntArray, numberIndex: Int): Int {
        for (i in numberIndex downTo 0) {
            if (numbersCounts[i] > 0) return i
        }
        return -1
    }
}

fun main() {
    //val a = intArrayOf(1,5,1,1,6,4)
    //Solution().wiggleSort(a)
    //println(a.joinToString())

    val b = intArrayOf(1,3,2,2,3,1) // 1, 3, 2, 3, 1, 2
    Solution().wiggleSort(b)
    println(b.joinToString())

    val c = intArrayOf(4,5,5,6) // 5, 6, 5, 4
    Solution().wiggleSort(c)
    println(c.joinToString())

    val d = intArrayOf(4, 5, 5, 3, 6) // 5, 6, 5, 4
    Solution().wiggleSort(d)
    println(d.joinToString())
}