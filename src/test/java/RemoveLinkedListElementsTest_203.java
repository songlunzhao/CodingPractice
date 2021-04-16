import common.ListNode;
import org.testng.annotations.Test;

public class RemoveLinkedListElementsTest_203 {

    @Test
    public void testRemoveElements(){
        //Input: head = [1,2,6,3,4,5,6], val = 6
        //Output: [1,2,3,4,5]
        ListNode head = ListNode.buildList(new Integer[]{1,2,6,3,4,5,6});
        head=removeElements(head,6);
        ListNode.printQueue(head);
    }
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null){
            if(head.val==val) head=head.next;
            else break;
        }
        if(head==null) return null;
        ListNode p=head, q=p.next;
        while(p!=null && q!=null){
            if(q.val==val){
                p.next=q.next;
                q=q.next;
                continue;
            }
            p=p.next;
            if(p==null) break;
            q=p.next;
        }
        return head;
    }
}
