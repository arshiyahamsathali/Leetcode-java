package Leetcode-java.LinkedList;

public class 0206_Reverse_Linked_List {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
}
