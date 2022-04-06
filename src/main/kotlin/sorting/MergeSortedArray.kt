package sorting

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        for (i in 0..m + n) {
            if (nums1[i] <= nums2[i])
                continue
            else {
                // move
                for (move in m + n - 1 downTo i) {
                    nums1[move] = nums1[move - 1]
                }
                //insert
                nums1[i] = nums2[i]
            }

        }
    }
}

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(1, 2, 3)

    MergeSortedArray().merge(nums1, 3, nums2, nums2.size)

    println(nums1)
}