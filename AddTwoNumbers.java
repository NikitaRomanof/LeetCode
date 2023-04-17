/*
* You are given two non-empty linked lists representing two non-negative integers.
* The digits are stored in reverse order, and each of their nodes contains a single digit.
* Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4, new ListNode(3));
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6, new ListNode(4));
        ListNode result = addTwoNumbers(l1, l2);
        System.out.print("[");
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
            if (result != null) System.out.print(", ");
        }
        System.out.print("]");


    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l1.next == null) return l2;
        if (l2.val == 0 && l2.next == null) return l1;
        ListNode buffer = new ListNode(0);
        ListNode result = buffer;
        int tmp = 0;
        while (true) {
            int l1Val = 0;
            int l2Val = 0;
            if (l1 != null) l1Val = l1.val;
            if (l2 != null) l2Val = l2.val;
            int sumNode = l1Val + l2Val;
            if ((sumNode + tmp) / 10 < 1) {
                buffer.val = sumNode + tmp;
                tmp = 0;
            } else {
                buffer.val = (sumNode + tmp) - 10;
                tmp = 1;
            }

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            if (l1 == null && l2 == null) {
                if (tmp == 1) buffer.next = new ListNode(1);
                break;
            }
            buffer.next = new ListNode(0);
            buffer = buffer.next;
        }
        return result;
    }
}
