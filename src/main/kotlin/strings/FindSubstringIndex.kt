package strings

fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}

fun main() {
    println(strStr("hello", "ll"))
}