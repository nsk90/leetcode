object ContainsDuplicate {
    /**
     * Given an array of integers, find if the array contains any duplicates.
     *
     * Your function should return true if any value appears at least twice in the array,
     * and it should return false if every element is distinct.
     */
    fun containsDuplicate(nums: IntArray): Boolean {
        val numbers = mutableSetOf<Int>()
        for (n in nums) {
            if (numbers.contains(n))
                return true
            numbers.add(n)
        }
        return false
    }
}

fun main() {
    //val array = intArrayOf(1, 2, 3, 4, 5, 5)
    val array = intArrayOf()
    val result = ContainsDuplicate.containsDuplicate(array)
    println(result)
}