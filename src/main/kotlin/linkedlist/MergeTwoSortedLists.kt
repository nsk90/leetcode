package linkedlist

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    var list1: ListNode? = l1 ?: return l2
    var list2: ListNode? = l2 ?: return l1

    var head: ListNode? = null
    var current: ListNode? = null

    do {
        //println("first ${list1?.`val`}, second ${list2?.`val`}")

        if (list1 != null && list2 != null) {
            if (list1.`val` < list2.`val`) {
                current?.next = list1
                current = list1
                list1 = list1.next
            } else {
                current?.next = list2
                current = list2
                list2 = list2.next
            }
        } else if (list1 != null) {
            current?.next = list1
            current = list1
            list1 = list1.next
        } else if (list2 != null) {
            current?.next = list2
            current = list2
            list2 = list2.next
        } else
            break

        if (head == null) head = current

        //println("current ${current.`val`}")
        //println()
    } while (true)

    return head
}

fun main() {
    val forth1 = ListNode(6)
    val third1 = ListNode(5).apply { next = forth1 }
    val second1 = ListNode(4).apply { next = third1 }
    val first1 = ListNode(3).apply { next = second1 }
    println("list1")
    printList(first1)

    val fifth2 = ListNode(5)
    val forth2 = ListNode(4).apply { next = fifth2 }
    val third2 = ListNode(3).apply { next = forth2 }
    val second2 = ListNode(2).apply { next = third2 }
    val first2 = ListNode(1).apply { next = second2 }
    println("list2")
    printList(first2)

    val head = mergeTwoLists(first1, first2)

    printList(head)
}