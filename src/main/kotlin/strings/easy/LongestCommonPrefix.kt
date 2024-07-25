package strings.easy

fun longestCommonPrefix(strings: Array<String>): String {
    val minLenString = strings.minBy { it.length }!!
    for (c in minLenString.indices) {
        for (s in strings.indices) {
            if (strings[s][c] != minLenString[c])
                return minLenString.substring(0, c)
        }
    }
    return minLenString
}

fun main() {
    println(longestCommonPrefix(arrayOf("flower","flow","flight")))
    println(longestCommonPrefix(arrayOf("flower","flower","flower")))
    println(longestCommonPrefix(arrayOf("flower","flowwer","flowwwer")))
}