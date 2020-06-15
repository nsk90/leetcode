public class RemoveDuplicatesFromSortedArray {
    /**
     * Given a sorted array nums, remove the duplicates in-place
     * such that each element appear only once and return the new length.
     *
     * Do not allocate extra space for another array,
     * you must do this by modifying the input array in-place with O(1) extra memory.
     */
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length < 2)
            return length;
        int i = 0;
        do {
            if (nums[i] == nums[i + 1]) {
                for (int j = i; j < length - 1; ++j) {
                    nums[j] = nums[j + 1];
                }
                --length;
            } else {
                i++;
            }
        } while (i < length - 1);
        return length;
    }
}
