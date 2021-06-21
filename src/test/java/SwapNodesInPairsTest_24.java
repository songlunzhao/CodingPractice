import com.songlunzhao.leetcode.editor.en.common.ListNode;
import org.testng.annotations.Test;

public class SwapNodesInPairsTest_24 {

    @Test
    public void testSwapNodes(){
        //Finished: Your input:[1,2,3,4] Output:[2,3,4,1] Expected:[2,1,4,3] stdout:
        ListNode head = ListNode.buildList(new Integer[]{1,2,3,4});
        ListNode.printQueue(head);
        head=swapPairs(head);
        ListNode.printQueue(head);
        head = ListNode.buildList(new Integer[]{1,2,3,4});
        ListNode.printQueue(head);
        head=swapPairs2(head);
        ListNode.printQueue(head);
    }



    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        ListNode p=head, q=p.next;
        while(p!=null&&q!=null){
            int v1=p.val;
            int v2=q.val;
            p.val=v2;
            q.val=v1;
            p=q.next;
            if(p!=null) q=p.next;
        }

        return head;
    }

    public ListNode swapPairs2(ListNode head) {
        if(head==null) return head;
        ListNode p=head, q=p.next;
        boolean changeHead=true;
        ListNode prevQ=null;
        while(p!=null&&q!=null){
            if(prevQ!=null){
                prevQ.next=q;
            }
            p.next=q.next;
            q.next=p;
            ListNode tmp=q;
            q=p;
            p=tmp;
            if(changeHead){
                head=p;
                changeHead=false;
            }
            p=q.next;
            prevQ=q;
            if(p!=null) q=p.next;
        }

        return head;
    }


}
