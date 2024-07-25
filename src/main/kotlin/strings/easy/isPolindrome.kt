package strings.easy

fun isPalindrome(string: String): Boolean {
    val letters = string.filter { it.isLetter() || it.isDigit() }.toLowerCase().toCharArray()
    println(letters)
    for(l in letters.indices)
        if (letters[l] != letters[letters.lastIndex - l])
            return false
    return true
}

fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
    println(isPalindrome("race a car"))
}

fun isPalindrome1(string: String): Boolean {
    val letters = string.filter { it.isLetterOrDigit() }
    return letters.equals(letters.reversed(), true)
}