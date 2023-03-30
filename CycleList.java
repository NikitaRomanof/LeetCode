/*
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed).
It is -1 if there is no cycle. Note that pos is not passed as a parameter.
Do not modify the linked list.
*/

import java.util.*;

public class CycleList {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        list1.next.next.next = list1;
        ListNode rez = detectCycle(list1);
        System.out.println(rez.val);
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        Set<ListNode> setNode = Collections.newSetFromMap(new IdentityHashMap<>());
        ListNode tmp = head;
        while (tmp.next != null) {
            boolean check = setNode.add(tmp);
            if (!check) return tmp;
            tmp = tmp.next;;
        }
        return null;
    }

}
