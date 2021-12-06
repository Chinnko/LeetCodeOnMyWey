package page2;

public class RemoveDuplicatesSortedListII82 {
    public static void main(String[] args) {
        deleteDuplicates(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(2)))));
    }

    //1,2,2,2
    //1,2,2,2
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        if (head.val == next.val) {
            while (next != null && head.val == next.val) {
                next = next.next;
            }
            head = deleteDuplicates(next);
        } else {
            head.next = deleteDuplicates(next);
        }
        return head;
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
