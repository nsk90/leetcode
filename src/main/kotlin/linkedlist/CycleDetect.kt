package linkedlist

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

fun hasCycle(head: ListNode?): Boolean {
    val nodes = mutableSetOf<ListNode>()
    var next = head
    while (next != null) {
        nodes.add(next)
        if (nodes.contains(next.next))
            return true
        next = next.next
    }
    return false
}

fun main() {
    val forth = ListNode(9)
    val third = ListNode(1).apply { next = forth }
    val second = ListNode(5).apply { next = third }
    val first = ListNode(4).apply { next = second }
    // do cycle
    forth.next = first

    println(hasCycle(second))
}