package linkedlist

fun reverseList(head: ListNode?): ListNode? {
    if (head == null) return head

    var first: ListNode = head // 1
    var next: ListNode?
    do {
        next = head.next // 2
        if (next != null) {
            head.next = next.next // 3
            next.next = first
            first = next
        }
    } while (next != null)
    return first
}

fun main() {
    val forth = ListNode(4)
    val third = ListNode(3).apply { next = forth }
    val second = ListNode(2).apply { next = third }
    val first = ListNode(1).apply { next = second }

    val head = reverseList(first)

    var list: ListNode? = head
    do {
        println(list?.`val`)
        list = list?.next
    } while (list != null)
}