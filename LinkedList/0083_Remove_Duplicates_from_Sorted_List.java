package Leetcode-java.LinkedList;

public class 0083_Remove_Duplicates_from_Sorted_List {
    ListNode current = head;

    while (current != null && current.next != null) {

        if (current.val == current.next.val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }

    return head;
}
