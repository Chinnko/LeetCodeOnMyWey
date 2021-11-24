package page2;

import java.util.LinkedList;

public class ReverseLinkedListII92 {
    public static void main(String[] args) {
        ReverseLinkedListII92 reverseLinkedListII92 = new ReverseLinkedListII92();
        ListNode listNode = new ListNode(1, new ListNode(2));
        reverseLinkedListII92.reverseBetween(listNode, 1, 1);
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null || left == right) {
            return head;
        }
        ListNode copy = head;
        int count = 1;
        ListNode rehead = null;
        ListNode end = null;
        while (copy != null) {
            if (count == left - 1) {
                rehead = copy;
            }
            if (count == right) {
                end = copy;
            }
            count++;
            copy = copy.next;
        }
        ListNode lefts = rehead.next;
        ListNode rights = end.next;

        rehead.next = null;
        end.next = null;

        reverseLinkedList(lefts);

        rehead.next = end;
        lefts.next = rights;
        return head;

    }

    private void reverseLinkedList(ListNode head) {
        // 也可以使用递归反转一个链表
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
