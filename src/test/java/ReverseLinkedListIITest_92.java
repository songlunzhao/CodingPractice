import com.songlunzhao.leetcode.editor.en.common.ListNode;
import org.testng.annotations.Test;

public class ReverseLinkedListIITest_92 {

    @Test
    public void testReverseLinkedList(){
        //Input: head = [1,2,3,4,5], left = 2, right = 4
        //Output: [1,4,3,2,5]

        ListNode head = ListNode.buildList(new Integer[]{1,2,3,4,5});
        ListNode.printQueue(head);

        head=reverseBetween(head, 2,6);
        ListNode.printQueue(head);

        head=ListNode.buildList(new Integer[]{3,5});
        ListNode.printQueue(head);

        head=reverseBetween(head, 1,2);
        ListNode.printQueue(head);
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null && head.next == null) return head;
        ListNode p = head, q = null, r = null;
        //p=current node,
        //q=previous node of p, becomes previous node of end after loop;
        //r=previous node of start
        int i = 0;
        ListNode start = null, end = null;
        while (p != null) {
            i++;
            if (i == left) {
                start = p;
                r = q;
            }
            if (i == right) {
                end = p;
                p = p.next;
                break;
            }
            q = p;
            p = p.next;
        }
        //list is like r->start->...->end->p
        //after reverse list become r->end->...->start->p
        if(end==null) end=q;
        reverseBetween(start, end);
        if (r != end && r!=null) {
            r.next = end;
        } else {
            head=end;
        }
        if (p != start && start != null) {
            start.next = p;
        }
        return head;
    }

    public void reverseBetween(ListNode start, ListNode end) {
        if (start == null || start.next==null || start==end) return;
        ListNode p = start, q=p.next, r;
        while (p != end && q!=null) {
            r = q.next;
            q.next=p;
            p=q;
            q=r;
        }
    }

}
