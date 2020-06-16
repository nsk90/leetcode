object PlusOne {
    /**
     * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
     *
     * The digits are stored such that the most significant digit is at the head of the list,
     * and each element in the array contain a single digit.
     *
     * You may assume the integer does not contain any leading zero, except the number 0 itself.
     */
    fun plusOne(digits: IntArray): IntArray {
        for (index in digits.size - 1 downTo 0 ) {
            if (digits[index] == 9) {
                digits[index] = 0
                if (index == 0)
                    return IntArray(digits.size + 1) { if (it == 0) 1 else 0 }
            } else {
                digits[index]++
                break
            }
        }
        return digits
    }
}

fun main() {
    PlusOne.plusOne(intArrayOf(1, 2, 3)).also { println(it.contentToString()) }
    PlusOne.plusOne(intArrayOf(0)).also { println(it.contentToString()) }
    PlusOne.plusOne(intArrayOf(1, 2, 9)).also { println(it.contentToString()) }
    PlusOne.plusOne(intArrayOf(9, 9, 9)).also { println(it.contentToString()) }
}