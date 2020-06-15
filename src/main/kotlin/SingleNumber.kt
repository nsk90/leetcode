import java.lang.IllegalArgumentException

object SingleNumber {
    /**
     * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
     *
     * Note:
     * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
     */
    fun singleNumber(nums: IntArray): Int {
        println(nums.contentToString())
        nums.sort()
        println(nums.contentToString())

        for (index in 0 until nums.size - 1 step 2) {
            if (nums[index] != nums[index + 1])
                return nums[index]
        }
        return nums.last()
    }
}

fun main(args: Array<String>) {
    //val array = intArrayOf(5, 1, 3, 2, 1, 2, 3, 4, 5)
    val array = intArrayOf(2, 2, 1)
    //val array = intArrayOf(4)
    val result = SingleNumber.singleNumber(array)
    println("result $result")
}