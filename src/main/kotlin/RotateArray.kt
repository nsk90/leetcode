object RotateArray {
    /**
     * Rotates array in place, with O(1) additional memory.
     */
    fun rotate(nums: IntArray, k: Int) {
        println(nums.contentToString())

        if (nums.size < 2) return
        repeat(k % nums.size) {
            println("iteration $it")

            val last = nums.last()
            println("moving last element: $last")

            for (index in nums.size downTo 2) {
                nums[index - 1] = nums[index - 2]
            }
            nums[0] = last
        }

        println("result ${nums.contentToString()}")
    }
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    //val array = intArrayOf()

    // expect 4, 5, 1, 2, 3
    RotateArray.rotate(array, 2)
}
