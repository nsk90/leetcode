package strings.easy

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal
 * substring
 *  consisting of non-space characters only.
 *
 */
class Solution {
    fun lengthOfLastWord(s: String): Int {
        var startIndex: Int = s.lastIndex
        var endIndex: Int = s.lastIndex
        var wordDetected = false
        for (index in s.lastIndex downTo 0) {
            val isWhitespace = s[index].isWhitespace()
            if (!wordDetected && isWhitespace) {
                --startIndex
                --endIndex
            } else if (!isWhitespace) {
                wordDetected = true
                --startIndex
            } else {
                break
            }
        }
        return endIndex - startIndex
    }
}

fun main() {
    println(Solution().lengthOfLastWord("   fly me   to   the moon  "))
}