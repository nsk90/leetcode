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
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

/**
 * Given node is not a tail
 */
fun deleteNode1(node: ListNode?) {
    if (node == null) return
    var currentNode: ListNode = node
    do {
        val next = currentNode.next!!
        currentNode.`val` = next.`val`

        if (next.next == null)
            currentNode.next = null
        currentNode = next
    } while(currentNode.next != null)
}

/**
 * Предыдущий узел мы не можем связать со следующим, но можем выкинуть из цепочки следующий
 * сохранив его значение в текущем
 */
fun deleteNode(node: ListNode?) {
    if (node == null) return
    node.`val` = node.next!!.`val`
    node.next = node.next!!.next
}

fun main() {
    val forth = ListNode(9)
    val third = ListNode(1).apply { next = forth }
    val second = ListNode(5).apply { next = third }
    val first = ListNode(4).apply { next = second }

    deleteNode(second)

    printList(first)
}