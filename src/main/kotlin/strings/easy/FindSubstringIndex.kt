package strings.easy

fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}

fun main() {
    println(strStr("hello", "ll"))
}