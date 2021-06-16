import common.ListNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ReverseNodesInKgroup_25 {

    @Test
    public void test1(){
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        List<ListNode> l = testNode(node1,node2);
        System.out.println(node1.val);
        System.out.println(node2.val);
        System.out.println(l.get(0).val);
        System.out.println(l.get(1).val);
    }

    @Test
    public void test2(){
        ListNode head = ListNode.buildList(new Integer[]{1,2,3,4,5});
        ListNode.printQueue(head);

        head = reverseKGroup(head, 2);
        ListNode.printQueue(head);
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null||k<=1) return head;
        ListNode start=head, end, cur=head, prevEnd=null;
        int i=0;
        while(cur!=null){
            i++;
            if(i==k){
                end=cur; //reverse sub-k list
                ListNode newStart=end.next;
                reverseBetween(start,end);//start->end reversed to start<-end
                start.next=newStart;
                if(start==head) {
                    head=end;
                }
                if(prevEnd!=null){
                    prevEnd.next=end;
                }
                prevEnd=start;
                start=newStart;
                i=0;
                cur=start;
            } else {
                cur=cur.next;
            }

        }
        return head;
    }

    private void reverseBetween(ListNode start, ListNode end ) {
        List<ListNode> ret = new ArrayList<>();
        if(start==null || start.next==null || start==end) return;
       ListNode p=start, q=start.next, r;
        while(p!=end && q!=null){
            r=q.next;
            q.next=p;
            p=q;
            q=r;
        }
        return;
    }

    private List<ListNode> testNode(ListNode node1, ListNode node2){
        List<ListNode> l = new ArrayList<>();
        l.add(node2);
        l.add(node1);

        ListNode tmp;
        tmp=node1;
        node1=node2;
        node2=tmp;


        return l;
    }
}
