package page2;

public class RemoveDuplicatesFromSortedList83 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode copy = head;
        ListNode pre = null;
        while (copy != null) {
            if (pre != null && pre.val == copy.val) {
                pre.next = copy.next;
            } else {
                pre = copy;
            }
            copy = copy.next;

        }
        return head;
    }


    public class ListNode {
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
