package strings.easy

object FirstUniqueCharacter {
    /**
     * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
     */
    fun firstUniqChar(s: String): Int {
        data class Data(val index: Int, var count: Int)

        val charData = mutableMapOf<Char, Data>()
        for (c in s.indices) {
            val data = charData[s[c]]
            if (data != null)
                data.count++
            else
                charData[s[c]] = Data(c, 1)
        }

        val res = charData.minWith(Comparator { p1, p2 ->
            when {
                p1.value.count > p2.value.count -> 1
                p1.value.count == p2.value.count -> {
                    if (p1.value.index > p2.value.index)
                        return@Comparator 1
                    else (p1.value.index == p2.value.index)
                    return@Comparator 0
                }
                else -> -1
            }
        })

        res?.let {
            if (it.value.count == 1)
                return it.value.index
        }
        return -1
    }
}

fun main() {
    println(FirstUniqueCharacter.firstUniqChar("hhllo"))
    println(FirstUniqueCharacter.firstUniqChar(""))
    println(FirstUniqueCharacter.firstUniqChar("hh"))
    println(FirstUniqueCharacter.firstUniqChar("hhh"))
    println(FirstUniqueCharacter.firstUniqChar("hhl"))
    println(FirstUniqueCharacter.firstUniqChar("lhh"))
}