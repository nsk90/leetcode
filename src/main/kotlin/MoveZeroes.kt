object MoveZeroes {
    /**
     * Given an array nums, write a function to move all 0's to the end of it
     * while maintaining the relative order of the non-zero elements.
     *
     * Note:
     * You must do this in-place without making a copy of the array.
     * Minimize the total number of operations.
     */
    fun moveZeroes(nums: IntArray) {
        var index = 0
        var end = nums.size
        var iter = 0
        while (index < end) {
            iter++
            if (nums[index] == 0) {
                nums.copyInto(nums, index, index + 1)
                nums[nums.size - 1] = 0
                end--
                continue
            }
            index++
        }
        println("iterations: $iter ${nums.contentToString()}")
    }
}

fun main() {
    MoveZeroes.moveZeroes(intArrayOf())
    MoveZeroes.moveZeroes(intArrayOf(0, 0))
    MoveZeroes.moveZeroes(intArrayOf(1, 0, 2, 0, 9))
    MoveZeroes.moveZeroes(intArrayOf(1, 0, 0, 0, 9))
    MoveZeroes.moveZeroes(intArrayOf(1, 2, 0, 0))
    MoveZeroes.moveZeroes(intArrayOf(0, 0, 0, 9))
    MoveZeroes.moveZeroes(intArrayOf(0, 0, 9))
    MoveZeroes.moveZeroes(intArrayOf(0, 9))
}