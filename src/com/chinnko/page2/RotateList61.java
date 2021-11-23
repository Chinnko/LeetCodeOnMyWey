package page2;

import java.util.ArrayList;

public class RotateList61 {
    public static void main(String[] args) {
        ListNode listNode = new RotateList61().rotateRight(new ListNode(1, new ListNode(2, new ListNode(3))), 2);
        System.out.println(listNode);
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0){
            return head;
        }
        ListNode cursor=head;
        ListNode tail=null;//尾指针
        int length=1;
        while(cursor.next!=null)//循环 得到总长度
        {
            cursor=cursor.next;
            length++;
        }
        int loop=length-(k%length);//得到循环的次数
        tail=cursor;//指向尾结点
        cursor.next=head;//改成循环链表
        cursor=head;//指向头结点
        for(int i=0;i<loop;i++){//开始循环
            cursor=cursor.next;
            tail=tail.next;
        }
        tail.next=null;//改成单链表
        return cursor;//返回当前头

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
