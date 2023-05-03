/*
*HARD
* You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class  MergeKSortedLists {

    public static void main(String[] args) {
        ListNode a = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode b = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode c = new ListNode(2, new ListNode(6, new ListNode(9)));
        ListNode[] listMas = {a, b, c};
        ListNode result = mergeKLists(listMas);
        System.out.print("[");
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
            if(result != null) System.out.print(", ");
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

    public static ListNode mergeKLists(ListNode[] lists) {
        List<Integer> value = new ArrayList<>();
        for (ListNode node : lists) {
            while (node != null) {
                value.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(value);
        if (value.size() == 0) return null;
        ListNode rez = new ListNode(value.get(0));
        ListNode buf = rez;
        for (int i = 1; i < value.size(); ++i) {
            rez.next = new ListNode(value.get(i));
            rez = rez.next;
        }
        return buf;
    }
}
