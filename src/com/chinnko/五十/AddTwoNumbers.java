package 五十;

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode outNext = new ListNode();
        ListNode curr = outNext;
        while (l1 != null || l2 != null) {
            int l1Num = l1 != null ? l1.val : 0;
            int l2Num = l2 != null ? l2.val : 0;
            int i = (l1Num + l2Num + curr.val) / 10;
            curr.val = (l1Num + l2Num + curr.val) % 10;
            curr.next = new ListNode(i);

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            if (l1 == null && l2 == null && curr.next.val == 0) {
                curr.next = null;
            }
            curr = curr.next;

        }
        return outNext;

    }

}
