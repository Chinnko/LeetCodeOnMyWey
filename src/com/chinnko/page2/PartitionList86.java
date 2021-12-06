package page2;

public class PartitionList86 {

    public static void main(String[] args) {
        System.out.println(partition(new ListNode(2, new ListNode(1)), 2));
    }


    public  static ListNode partition(ListNode head, int x) {
        ListNode sort = new ListNode(0);
        ListNode sortCopy = sort;
        ListNode lar = new ListNode(0);
        ListNode sortLar = lar;
        while (head != null) {
            if (head.val >= x) {
                lar.next = head;
                lar = lar.next;
            } else {
                sort.next = head;
                sort = sort.next;
            }
            head = head.next;
        }
        sort.next = sortLar.next;
        lar.next = null;

        return sortCopy.next;
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
