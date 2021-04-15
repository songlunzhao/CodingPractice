package common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode buildList(Integer[] input){
        ListNode head=new ListNode();
        ListNode cur=head;
        for(int i: input){
            ListNode c = new ListNode(i);
            cur.next=c;
            cur=cur.next;
        }
        return head.next;
    }

    public static void printQueue(ListNode head){
        ListNode cur=head;
        while(cur!=null){
            System.out.print(cur.val + " ");
            cur=cur.next;
        }
        System.out.println();
    }
}
