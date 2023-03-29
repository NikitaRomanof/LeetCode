/*
     You are given the heads of two sorted linked lists list1 and list2.
     Merge the two lists in a one sorted list.
     The list should be made by splicing together the nodes of the first two lists.
     Return the head of the merged linked list.
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

public class Main {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode rez = mergeTwoLists(list1, list2);

        while (rez != null) {
            System.out.println(rez.val);
            rez = rez.next;
        }
    }
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null && list2 == null) return null;
            if (list1 != null && list2 == null) return list1;
            if (list1 == null) return list2;
            ListNode tmp = list1.next != null ? list1.next : list1;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = list2;
            sortVal(list1);
            return list1;
        }

        private static ListNode sortVal(ListNode in) {
            ListNode tmp = in;
            while (tmp.next != null) {
                ListNode buf = in;
                while (buf.next != null) {
                    if (buf.next.val < buf.val) {
                        int t = buf.val;
                        buf.val = buf.next.val;
                        buf.next.val = t;
                    }
                    buf = buf.next;
                }
                tmp = tmp.next;
            }
            return in;
        }
}
