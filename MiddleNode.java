/*
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
*/


import java.util.ArrayList;
import java.util.List;

public class MiddleNode {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode rez = middleNode(list1);
        System.out.println(rez.val);
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head;
        if (head.next.next == null) return head.next;
        ListNode tmp = head;
        List<ListNode> buf = new ArrayList<>();
        while (tmp.next != null) {
            buf.add(tmp);
            tmp = tmp.next;
        }
        int count = buf.size() % 2 == 0 ? (buf.size() / 2) : (buf.size() / 2) + 1;
        return buf.get(count);

    }

}
