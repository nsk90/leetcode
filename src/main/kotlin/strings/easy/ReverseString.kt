package strings.easy

object ReverseString {
    /**
     * Write a function that reverses a string. The input string is given as an array of characters char[].
     *
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     * You may assume all the characters consist of printable ascii characters.
     */
    fun reverseString(s: CharArray) {
        var startIndex = 0;
        var endIndex = s.size - 1
        while (startIndex < s.size / 2) {
            s[startIndex] = s[endIndex].also { s[endIndex] = s[startIndex] }
            startIndex++
            endIndex--
        }
        println(s.contentToString())
    }
}

fun main() {
    ReverseString.reverseString(charArrayOf('h', 'e', 'l', 'l', 'o'))
    ReverseString.reverseString(charArrayOf('h'))
    ReverseString.reverseString(charArrayOf())
    ReverseString.reverseString(charArrayOf('h', 'e', 'l', 'l'))
}