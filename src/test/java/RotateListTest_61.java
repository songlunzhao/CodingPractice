import com.songlunzhao.leetcode.editor.en.common.ListNode;
import org.testng.annotations.Test;


public class RotateListTest_61 {

    @Test
    public void testRotateList(){

    }

    /**
     * solution : link tail to head, make the linked list a loop,
     * then calculate where is the new tail of the list.
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode cur = head, tail=null;
        int len=0;
        while(cur!=null){
            len++;
            if(cur.next==null){
                tail=cur;
            }
            cur=cur.next;
        }
        int steps = k%len;
        if(steps==0) return head;

        tail.next=head;

        cur=tail;
        for(int i=0; i<len-steps; i++){
            cur=cur.next;
        }
        head = cur.next;
        cur.next=null;
        return head;
    }
}
